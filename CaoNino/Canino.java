package CaoNino;

import java.util.ArrayList;
import java.util.Scanner;

public class Canino{

    private String nome;
    private String entrada;
    private String raca;
    private String cor;
    private double peso;

    Scanner teclado = new Scanner(System.in);

    public Canino(String nome, String entrada, String raca, String cor, double peso) {
        this.nome = nome;
        this.entrada = entrada;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void printare(){
        System.out.println("fuck");
    }

    @Override
    public String toString() {
        return nome;
    }

}