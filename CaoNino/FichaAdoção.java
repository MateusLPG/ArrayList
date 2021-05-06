package CaoNino;

import java.util.Date;

public class FichaAdoção{
    
    private Canino cao;
    private Pessoa pessoa;
    private String data;
    private long tempoONG;
    private long tempoAdotado;
    private String raça;
    
    
    public FichaAdoção(Canino cao, Pessoa pessoa, String data, long tempoAdotado, String raça) {
        this.cao = cao;
        this.pessoa = pessoa;
        this.data = data;
        this.tempoAdotado = tempoAdotado;
        this.raça = raça;
    }


    public Canino getCao() {
        return cao;
    }


    public void setCao(Canino cao) {
        this.cao = cao;
    }


    public Pessoa getPessoa() {
        return pessoa;
    }


    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }


    public long getTempoONG() {
        return tempoONG;
    }


    public void setTempoONG(long tempoONG) {
        this.tempoONG = tempoONG;
    }


    public long getTempoAdotado() {
        return tempoAdotado;
    }


    public void setTempoAdotado(long tempoAdotado) {
        this.tempoAdotado = tempoAdotado;
    }


    public String getRaça() {
        return raça;
    }


    public void setRaça(String raça) {
        this.raça = raça;
    }


    @Override
    public String toString() {
        return "FichaAdoção [cao=" + cao + ", data=" + data + ", pessoa=" + pessoa + ", raça=" + raça
                + ", tempoAdotado=" + tempoAdotado +  "]";
    }

    
}