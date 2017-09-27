package model;

import domain.Jogada;

public class Jogador {

    private Jogada jogada;

    public Jogador(Jogada jogada) {
        this.jogada = jogada;
    }

    public Jogada getJogada() {

        return jogada;
    }

    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }
}
