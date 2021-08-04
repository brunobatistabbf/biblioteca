package src.biblioteca;
import java.util.List;

import src.publicacoes.Publicacoes;
import src.usuarios.Usuario;

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


}
