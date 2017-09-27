package service;

import exception.JogadaException;
import model.Jokenpo;
import model.Resultado;



public interface IPartidaService {

    Jokenpo jogarPartida(Jokenpo jokenpo, Resultado resultado) throws Exception;
    boolean jogadaAMaiorQueJogadaB(Jokenpo jokenpo) throws JogadaException;
    boolean jogadaBMaiorQueJogadaA(Jokenpo jokenpo) throws Exception;
}
