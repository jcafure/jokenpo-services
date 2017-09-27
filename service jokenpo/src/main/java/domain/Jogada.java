package domain;

public enum Jogada {

    PEDRA("PEDRA","1,2"),
    TESOURA("TESOURA","2"),
    PAPEL("PAPEL","0");

    private String valor;

    Jogada(String valor, String ganhaDe) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Jogada getJogadaValendo() {
        switch (this){
            case PEDRA:
                return PAPEL;
            case PAPEL:
                return TESOURA;
            case TESOURA:
                return PEDRA;
                default:
                    return null;
        }
    }
}
