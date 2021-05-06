package CaoNino;

public class Gerencia{
    
    private Canino cao;
    private long tempoONG;
    private String saudeCachorro;
    private long tempoAdotado;
    public int cont = 0;
    
    public Gerencia(Canino cao, long tempoONG, String saudeCachorro, long tempoAdotado) {
        cont++;
        this.cao = cao;
        this.tempoONG = tempoONG;
        this.saudeCachorro = saudeCachorro;
        this.tempoAdotado = tempoAdotado;
    }

    public Canino getCao() {
        return cao;
    }

    public void setCao(Canino cao) {
        this.cao = cao;
    }

    public long getTempoONG() {
        return tempoONG;
    }

    public void setTempoONG(long tempoONG) {
        this.tempoONG = tempoONG;
    }

    public String getSaudeCachorro() {
        return saudeCachorro;
    }

    public void setSaudeCachorro(String saudeCachorro) {
        this.saudeCachorro = saudeCachorro;
    }

    public long getTempoAdotado() {
        return tempoAdotado;
    }

    public void setTempoAdotado(long tempoAdotado) {
        this.tempoAdotado = tempoAdotado;
    }

    @Override
    public String toString() {
        return "Gerencia [cao=" + cao + ", saudeCachorro=" + saudeCachorro + ", tempoAdotado=" + tempoAdotado + " dias"
                + ", tempoONG=" + tempoONG + " dias" + "]";
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

 
    

}