package desafio.itau.service;
import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import desafio.itau.DTO.EstatisticasReponse;
import desafio.itau.model.Transacao;
import desafio.itau.repository.TransacaoRepository;

@Service
public class TransacaoService {
    private final TransacaoRepository transacaoRepository;
    
    public TransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }
    
    public List<Transacao> getTransacoes() {
        return transacaoRepository.selectTransacao();
    }
    
    public void salvarTransacao(Transacao add) {
        if (add == null) {
            throw new IllegalArgumentException("Transação não pode ser nula");
        }
        else if (add.getValor() < 0) {
            throw new IllegalArgumentException("Valor da transação não pode ser negativo");
        }
        else if (add.getDataHora() == null) {
            throw new IllegalArgumentException("Data e hora da transação não podem ser nulas");
        }
        else if (add.getDataHora().isAfter(OffsetDateTime.now())) {
            throw new IllegalArgumentException("Data e hora da transação não podem ser no futuro");
        }

        else {
            transacaoRepository.adicionarTransacao(add);
        }
    }
    
    public void removerTransacao(Transacao delete) {
        transacaoRepository.deletarTransacao(delete);
    }

    public EstatisticasReponse obterEstatisticas() {
        List<Transacao> transacoes = getTransacoes();
        if (transacoes.isEmpty()) {
            return new EstatisticasReponse(0, 0, 0, 0, 0);
        }

        double sum = transacoes.stream().mapToDouble(Transacao::getValor).sum();
        double avg = sum / transacoes.size();
        double max = transacoes.stream().mapToDouble(Transacao::getValor).max().orElse(0.0);
        double min = transacoes.stream().mapToDouble(Transacao::getValor).min().orElse(0.0);

        return new EstatisticasReponse(transacoes.size(), sum, avg, max, min);
    }
}