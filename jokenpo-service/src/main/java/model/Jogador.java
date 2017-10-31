package model;

import domain.Jogada;

public class Jogador {

    private Jogada jogada;
    private String nome;

    public Jogador(Jogada jogada) {
        this.jogada = jogada;
    }

    public Jogada getJogada() {

        return jogada;
    }

    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
