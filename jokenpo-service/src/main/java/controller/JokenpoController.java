package controller;

import model.Jokenpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.IPartidaService;


@RestController
@RequestMapping("/jokenpo")
public class JokenpoController {

    @Autowired
    private IPartidaService partidaService;

    @RequestMapping(value = "/jogar", method = RequestMethod.POST)
    public ResponseEntity<?> iniciarJogada(@RequestBody Jokenpo jokenpo){
        try {
            Jokenpo jokenpoValendo = partidaService.jogarPartida(jokenpo);
            return ResponseEntity.ok(jokenpoValendo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getModel() {
        Jokenpo jokenpoJason = new Jokenpo();
        return ResponseEntity.ok(jokenpoJason);
    }


}
