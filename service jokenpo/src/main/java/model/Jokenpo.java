package model;

import domain.ResultadoJokenpo;

public class Jokenpo {

    private Jogador jogadorA;
    private  Jogador jogadorB;
    private ResultadoJokenpo resultadoJokenpo;

    public Jokenpo() {

    }

    public Jokenpo(Jogador jogadorA, Jogador jogadorB, ResultadoJokenpo resultadoJokenpo) {
        this.jogadorA = jogadorA;
        this.jogadorB = jogadorB;
        this.resultadoJokenpo = resultadoJokenpo;
    }

    public Jogador getJogadorA() {
        return jogadorA;
    }

    public void setJogadorA(Jogador jogadorA) {
        this.jogadorA = jogadorA;
    }

    public Jogador getJogadorB() {
        return jogadorB;
    }

    public void setJogadorB(Jogador jogadorB) {
        this.jogadorB = jogadorB;
    }

    public ResultadoJokenpo getResultadoJokenpo() {
        return resultadoJokenpo;
    }

    public void setResultadoJokenpo(ResultadoJokenpo resultadoJokenpo) {
        this.resultadoJokenpo = resultadoJokenpo;
    }
}
