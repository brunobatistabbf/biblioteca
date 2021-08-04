package src.publicacoes;

import java.util.ArrayList;

public class PublicacoesTese extends Publicacoes {
    private int  paginas;
    private String resumo;
    private int  datadef;
    private String  instituicao;
  
    public PublicacoesTese(int dataP, String titulo, ArrayList<Publicacoes> pubs, String referencias,
            String autoresTitulacoes, boolean status, int renovacoes) {
        super(dataP, titulo, pubs, referencias, autoresTitulacoes, status, renovacoes);
        //TODO Auto-generated constructor stub
        this.paginas = paginas;
        this.resumo = resumo;
        this.datadef = datadef;
        this.instituicao = instituicao;
    }
  

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getResumo() {
        return this.resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getDatadef() {
        return this.datadef;
    }

    public void setDatadef(int datadef) {
        this.datadef = datadef;
    }

    public String getInstituicao() {
        return this.instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

 
}
