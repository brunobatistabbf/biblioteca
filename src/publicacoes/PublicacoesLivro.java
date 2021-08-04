package src.publicacoes;

import java.util.ArrayList;

public class PublicacoesLivro extends Publicacoes {
    private int edicao;
    private String editora;
    private int ISBN;


    public PublicacoesLivro(int dataP, String titulo, ArrayList<Publicacoes> pubs, String referencias,
            String autoresTitulacoes, boolean status, int renovacoes) {
        super(dataP, titulo, pubs, referencias, autoresTitulacoes, status, renovacoes);
        //TODO Auto-generated constructor stub
        this.edicao = edicao;
        this.editora = editora;
        this.ISBN =ISBN;
    }


    public int getEdicao() {
        return this.edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
   
    
}
