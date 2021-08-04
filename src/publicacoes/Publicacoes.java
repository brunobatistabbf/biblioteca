package src.publicacoes;
import java.util.Date;
import java.util.ArrayList;

public abstract class Publicacoes {
    private int dataP;
    private String titulo;
    private String referencias;
    private double multa;
    private double totalMulta;
    private String autoresTitulacoes;
    private long dataImprestimo;
    private long dataEntrega;
    private int limiteDias;
    private int renovacoes;
    private ArrayList<Publicacoes> pubs = new ArrayList<Publicacoes>();
    protected static boolean status = false;

    public Publicacoes(int dataP, String titulo, ArrayList<Publicacoes> pubs, String referencias, String autoresTitulacoes, boolean status, int renovacoes) {
        this.dataP = dataP;
        this.pubs = pubs;
        this.titulo = titulo;
        this.referencias = referencias;
        this.autoresTitulacoes = autoresTitulacoes;
        this.status = status;
        this.multa = multa;
        this.renovacoes = renovacoes;
    }

    public boolean isStatus() {
        return status;
    }

    public int getDataP() {
        return this.dataP;
    }

    public void setDataImprestimo(long dataImprestimo) {
        this.dataImprestimo = dataImprestimo;
    }
    public long getDataImprestimo() {
        return dataImprestimo;
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

    public int getRenovacoes() {
        return renovacoes;
    }

    public void setRenovacoes (int renovacoes) {
        this.renovacoes = renovacoes;
       
    }

    public void setDataEntrega(long dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public long getDataEntrega() {
        return dataEntrega;
    }
    
    public String getReferencias() {
        return this.referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public void setLimiteDias(int limiteDias) {
        this.limiteDias = limiteDias;
    }
    public int getLimiteDias() {
        return limiteDias;
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

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    public double getMulta() {
        return multa;
    }

    public void setTotalMulta(double totalMulta) {
        this.totalMulta = totalMulta;
    }
    public double getTotalMulta() {
        return totalMulta;
    }
    

    public boolean getStatus() {
        return this.status;
    }



}
