package service;

import model.Jokenpo;
import model.Resultado;

public interface IResultadoService {

    public Resultado jogadorAGanha(Jokenpo jokenpo) throws Exception;

    public Resultado jogadorBGanha(Jokenpo jokenpo) throws Exception;

    public Resultado empate() throws Exception;


}
