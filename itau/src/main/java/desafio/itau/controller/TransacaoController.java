package desafio.itau.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import desafio.itau.model.Transacao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import desafio.itau.service.TransacaoService;
import desafio.itau.DTO.TransacaoRequest;
import desafio.itau.DTO.EstatisticasReponse;


@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    private final TransacaoService transacaoService;
    
    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @GetMapping
    public List<Transacao> obterTransacoes() {
        return transacaoService.getTransacoes();
    }

    @PostMapping("/adicionarTransacao")
    public void adicionarTransacao(@RequestBody TransacaoRequest transacaoRequest) {
        Transacao novaTransacao = new Transacao(
            transacaoRequest.getValor(),
            transacaoRequest.getDataHora());
        transacaoService.salvarTransacao(novaTransacao);
    }

    @GetMapping("/estatisticas")
    public EstatisticasReponse obterEstatisticas() {
        return transacaoService.obterEstatisticas();
    }

    @DeleteMapping("/deletarTransacao")
    public void deletarTransacao(@RequestBody Transacao transacao) {
        transacaoService.removerTransacao(transacao);
}
}
