package src.usuarios;

import java.util.ArrayList;

import src.publicacoes.Publicacoes;

public abstract class Usuario {
    private String nome;
    private int telefone;
    private String email;
    private String cpf;
    private static ArrayList<Publicacoes> publisEmprestadas = new ArrayList<Publicacoes>();

    public Usuario(String nome, int telefone, String email, String cpf, ArrayList<Publicacoes> publisEmprestadas) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.publisEmprestadas = publisEmprestadas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static ArrayList<Publicacoes> getPublisEmprestadas() {
        return publisEmprestadas;
    }

    public void setPublisEmprestadas(ArrayList<Publicacoes> publisEmprestadas) {
        this.publisEmprestadas = publisEmprestadas;

    }
    
    public void registrarImprestimo(Publicacoes pub){
        publisEmprestadas.add(pub);
    }
 
}
