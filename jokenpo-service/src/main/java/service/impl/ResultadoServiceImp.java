package service.impl;

import model.Jokenpo;
import model.Resultado;
import org.springframework.stereotype.Service;
import service.IResultadoService;

@Service
public class ResultadoServiceImp implements IResultadoService {

    @Override
    public Resultado jogadorAGanha(Jokenpo jokenpo) throws Exception {
        return new Resultado(jokenpo.getJogadorA());
    }

    @Override
    public Resultado jogadorBGanha(Jokenpo jokenpo) throws Exception {
        return new Resultado(jokenpo.getJogadorA());
    }

    @Override
    public Resultado empate() throws Exception {
        Resultado empatePartida = new Resultado();
        empatePartida.setEmpate(true);
        return empatePartida;
    }
}
