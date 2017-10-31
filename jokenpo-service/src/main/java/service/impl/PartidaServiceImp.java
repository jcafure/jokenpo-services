package service.impl;

import domain.Jogada;
import exception.JogadaException;
import model.Jokenpo;
import model.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IPartidaService;
import service.IResultadoService;

@Service
public class PartidaServiceImp implements IPartidaService {

    private Jogada jogadorA;
    private Jogada jogadorB;

    @Autowired
    IResultadoService resultadoService;


    @Override
    public Jokenpo jogarPartida(Jokenpo jokenpo) throws Exception {
        initPartidaJokenpo(jokenpo);
        jokenpo = verificaResultado(jokenpo);
        return jokenpo;
    }

    @Override
    public boolean jogadaAMaiorQueJogadaB(Jokenpo jokenpo) throws JogadaException {
        return jogadorA.equals(jogadorB.getJogadaValendo());
    }

    @Override
    public boolean jogadaBMaiorQueJogadaA(Jokenpo jokenpo) {
        return jogadorB.equals(jogadorA.getJogadaValendo());
    }

    private Jogada getJogadaDoJogadorA(Jokenpo jokenpo) {
        return jokenpo.getJogadorA().getJogada();
    }

    private Jogada getJogadaDoJogadorB(Jokenpo jokenpo) {
        return  jokenpo.getJogadorB().getJogada();

    }

    private void initPartidaJokenpo(Jokenpo jokenpo) {
        this.jogadorA = getJogadaDoJogadorA(jokenpo);
        this.jogadorB = getJogadaDoJogadorA(jokenpo);
    }

    private Resultado verificaResultado(Jokenpo jokenpo) throws Exception {
        if(jogadaAMaiorQueJogadaB(jokenpo)){
            resultadoService.jogadorAGanha(jokenpo);
        }else if (jogadaBMaiorQueJogadaA(jokenpo)){
            return resultadoService.jogadorBGanha(jokenpo);
        }
            return null;
    }



}
