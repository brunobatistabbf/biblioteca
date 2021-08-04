package src.publicacoes;

public class PublicacoesLivro extends Publicacoes {
    private int edicao;
    private String editora;
    private int ISBN;
    
    public PublicacoesLivro(int dataP, String titulo, String referencias, String autoresTitulacoes, int edicao,
            String editora, int ISBN) {
        super(dataP, titulo, referencias, autoresTitulacoes);
        this.edicao = edicao;
        this.editora = editora;
        this.ISBN = ISBN;
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
