package src.usuarios;

import java.util.ArrayList;

import src.publicacoes.Publicacoes;

public class UsuarioComum extends Usuario {
    private int limite = 3;
    public UsuarioComum(String nome, int telefone, String email, String cpf, ArrayList<Publicacoes> publisEmprestadas) {
        super(nome, telefone, email, cpf, publisEmprestadas);
        //TODO Auto-generated constructor stub
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    public int getLimite() {
        return limite;
    }
    
    
    
}
