package model;

import org.springframework.stereotype.Component;

@Component
public class Resultado extends Jokenpo {

    private Jogador jogadorGanhador;
    private boolean empate;

    public Resultado(Jogador jogadorGanhador) {
        this.jogadorGanhador = jogadorGanhador;
        this.empate = false;
    }

    public Resultado(){

    }

    public Jogador getJogadorGanhador() {
        return jogadorGanhador;
    }

    public void setJogadorGanhador(Jogador jogadorGanhador) {
        this.jogadorGanhador = jogadorGanhador;
    }

    public boolean isEmpate() {
        return empate;
    }

    public void setEmpate(boolean empate) {
        this.empate = empate;
    }
}
