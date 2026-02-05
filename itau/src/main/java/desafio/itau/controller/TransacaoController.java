package desafio.itau.controller;
import org.springframework.web.bind.annotation.RestController;
import desafio.itau.model.Transacao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import desafio.itau.service.TransacaoService;
import desafio.itau.DTO.TransacaoRequest;
import desafio.itau.DTO.EstatisticasReponse;
import org.springframework.http.ResponseEntity;


@RestController
public class TransacaoController {

    private final TransacaoService service;

    public TransacaoController(TransacaoService service) {
        this.service = service;
    }

    @PostMapping("/transacao")
    public ResponseEntity<Void> criar(@RequestBody TransacaoRequest request) {
        Transacao t = new Transacao(request.getValor(), request.getDataHora());
        service.salvarTransacao(t);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/transacao")
    public ResponseEntity<Void> limpar() {
        service.removerTransacao();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/estatistica")
    public ResponseEntity<EstatisticasReponse> estatisticas() {
        return ResponseEntity.ok(service.obterEstatisticas());
    }
}
