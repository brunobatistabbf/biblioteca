package src.biblioteca;
import java.util.List;
import src.publicacoes.Publicacoes;
import src.usuarios.Usuario;
import src.usuarios.UsuarioComum;
import src.usuarios.UsuarioEspecial;

import java.util.Date;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereço;
    private List<Publicacoes> publicacoes;
    private List<Usuario> usuarios;

    public Biblioteca(String nome, String endereço, List<Publicacoes> publicacoes, List<Usuario> usuarios) {
        this.nome = nome;
        this.endereço = endereço;
        this.publicacoes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Publicacoes[] getPublicacoes() {
        if(this.publicacoes.isEmpty()) return null;
        return (Publicacoes[]) this.publicacoes.toArray();
    }

    public boolean addPublicacoes(Publicacoes p){
        if(p==null) return false;
        this.publicacoes.add(p);
        return true;
    }
    
    public Publicacoes getPublicacoesTitulo(String titulo){
        if(this.publicacoes.isEmpty()) return null;
        for(Publicacoes wanted:this.publicacoes) if(wanted.getTitulo().equals(titulo)) return wanted;
        return null;
    }

      public boolean addUsuario (Usuario addusuario){
        if(addusuario==null) return false;
        this.usuarios.add(addusuario);
        return true;
    }


    public Usuario removeUsuarioNome(String nome){
        if(this.usuarios.isEmpty()) return null;
        for(Usuario wanted:this.usuarios) {
            if(wanted.getNome().equals(nome)){
                this.usuarios.remove(wanted);
                return wanted;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarios() {
        if(this.usuarios.isEmpty()) return null;
        return this.usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public void emprestimo(UsuarioComum Usuario, Publicacoes pub){
        if (Usuario.getLimite() == 0) {
            System.out.println("Limite de renovações atingido!");
        }else{
            if(!pub.getStatus()){
                Usuario.setLimite(Usuario.getLimite() - 1);
                Usuario.registrarImprestimo(pub);
                pub.setRenovacoes(3);
                pub.setStatus(true);
            }else{
                System.out.println("Não disponivel para emprestimo!");
            }
        }
    }

    public void emprestimo(UsuarioEspecial Usuario, Publicacoes pub){
        if(!pub.getStatus()){
            Date data = new Date();
            pub.setDataImprestimo(data.getTime());
            Usuario.registrarImprestimo(pub);
            pub.setRenovacoes(5);
            pub.setStatus(true);
        }else{
            System.out.println("Não disponivel para emprestimo!");
        }
    }

    public void renovar(Usuario user, String titulo){
        ArrayList<Publicacoes> pubs = user.getPublisEmprestadas();
        for (int i = 0; i < pubs.size(); i++) {
            if (titulo.equals(pubs.get(i).getTitulo())) {
                if (pubs.get(i).getRenovacoes() > 0) {
                    pubs.get(i).setRenovacoes((pubs.get(i).getRenovacoes() - 1));
                    System.out.println("Renovado com sucesso");
                }else{
                    pubs.get(i).setTotalMulta(pubs.get(i).getMulta() + pubs.get(i).getTotalMulta());
                    System.out.println("Renovado com multa");
                }
            }
        }
    }
    
    public void devolução(Usuario user, String titulo){
        ArrayList<Publicacoes> pubs = Usuario.getPublisEmprestadas();
        for (int i = 0; i < pubs.size(); i++) {
            if (titulo.equals(pubs.get(i).getTitulo())) {
                Date data = new Date();
                pubs.get(i).setDataEntrega(data.getTime());
                long mili = pubs.get(i).getDataImprestimo() - pubs.get(i).getDataEntrega();
                int dias = (int)(mili/86400000);
                if(dias > pubs.get(i).getLimiteDias()){
                    double calcMulta = (dias-pubs.get(i).getLimiteDias())*pubs.get(i).getMulta();
                    pubs.get(i).setTotalMulta(pubs.get(i).getTotalMulta() + calcMulta);
                }
                pubs.get(i).setStatus(false);
                System.out.println("Multa a ser paga: "+ pubs.get(i).getTotalMulta());
                pubs.get(i).setTotalMulta(0);
                pubs.remove(i);
            } 
        }
    }


}
