package model;


public class Jokenpo {

    private Jogador jogadorA;
    private  Jogador jogadorB;

    public Jokenpo() {

    }

    public Jokenpo(Jogador jogadorA, Jogador jogadorB) {
        this.jogadorA = jogadorA;
        this.jogadorB = jogadorB;
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

}
