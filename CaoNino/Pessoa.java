package CaoNino;

public class Pessoa{
    
    private String nome;
    private String endereço;
    private long telefone;
    private String email;
    private String sexo;
    private String cachorro;
    

    public Pessoa(String nome, String endereço, long telefone, String email, String string, String string2) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.sexo = string;
        this.cachorro = string2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCachorro() {
        return cachorro;
    }

    public void setCachorro(String cachorro) {
        this.cachorro = cachorro;
    }
    @Override
    public String toString() {
        return "Pessoa [Nome=" + nome + ", cachorro=" + cachorro + ", endereço=" + endereço + ", email=" + email
                + ", sexo=" + sexo + ", telefone=" + telefone + "]";
    }

 
    



}