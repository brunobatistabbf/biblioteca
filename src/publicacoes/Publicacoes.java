package src.publicacoes;

public abstract class Publicacoes {
    private int dataP;
    private String titulo;
    private String referencias;
    private String autoresTitulacoes;

    public Publicacoes(int dataP, String titulo, String referencias, String autoresTitulacoes) {
        this.dataP = dataP;
        this.titulo = titulo;
        this.referencias = referencias;
        this.autoresTitulacoes = autoresTitulacoes;
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

    public boolean isAvailable() {
        return false;
    }

}
