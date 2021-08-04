package src.publicacoes;
import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;
import jdk.dynalink.linker.support.TypeUtilities;

public class PublicacoesArtigo extends Publicacoes {
    private static boolean status;
    private String resumo;
    private int dataP;
    private String titulo;
    private String referencias;
    private String autoresTitulacoes;
  

    public PublicacoesArtigo(int dataP, String titulo, ArrayList<Publicacoes> pubs, String referencias,
            String autoresTitulacoes, boolean status, int renovacoes) {
        super(dataP, titulo, pubs, referencias, autoresTitulacoes, status, renovacoes);
        //TODO Auto-generated constructor stub
        this.resumo =  resumo;
        this.dataP = dataP;
        this.titulo = titulo;
        this.referencias = referencias;
        this.autoresTitulacoes = autoresTitulacoes;
    }
  

  

    public String getResumo() {
        return this.resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getDataP() {
        return this.dataP;
    }

    public void setDataP(int dataP) {
        this.dataP = dataP;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReferencias() {
        return this.referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getAutoresTitulacoes() {
        return this.autoresTitulacoes;
    }

    public void setAutoresTitulacoes(String autoresTitulacoes) {
        this.autoresTitulacoes = autoresTitulacoes;
    }


   
    
}
