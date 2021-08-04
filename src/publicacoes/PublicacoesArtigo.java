package src.publicacoes;

public class PublicacoesArtigo extends Publicacoes {
    private String resumo;

    public PublicacoesArtigo(int dataP, String titulo, String referencias, String autoresTitulacoes, String resumo) {
        super(dataP, titulo, referencias, autoresTitulacoes);
        this.resumo = resumo;
    }

    public String getResumo() {
        return this.resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }


   
    
}
