package CaoNino;

public class Adoções{

    private String nomeCachorro;
    private long tempoAdotado;
    private String raçaCachorro;
    
    
    public Adoções(String nomeCachorro, long tempoAdotado, String raçaCachorro) {
        this.nomeCachorro = nomeCachorro;
        this.tempoAdotado = tempoAdotado;
        this.raçaCachorro = raçaCachorro;
    }

    public String getNomeCachorro() {
        return nomeCachorro;
    }
    public void setNomeCachorro(String nomeCachorro) {
        this.nomeCachorro = nomeCachorro;
    }
    public long getTempoAdotado() {
        return tempoAdotado;
    }
    public void setTempoAdotado(long tempoAdotado) {
        this.tempoAdotado = tempoAdotado;
    }
    public String getRaçaCachorro() {
        return raçaCachorro;
    }
    public void setRaçaCachorro(String raçaCachorro) {
        this.raçaCachorro = raçaCachorro;
    }

}
 
    
     
