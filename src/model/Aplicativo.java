package model;

public class Aplicativo  {
    private String nome;
    private int tempo;

    public Aplicativo(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public int getTempo() {
        return tempo;
    }

}
