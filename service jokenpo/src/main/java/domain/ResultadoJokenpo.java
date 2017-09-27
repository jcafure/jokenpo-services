package domain;

public enum ResultadoJokenpo {

    JOGADOR_A,
    JOGADOR_B,
    EMPATE,
    GANHA;

    private String valor;

    ResultadoJokenpo() {
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


}
