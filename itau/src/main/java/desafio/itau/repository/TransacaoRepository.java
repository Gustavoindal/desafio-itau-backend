package desafio.itau.repository;

import java.util.List;
import java.util.ArrayList;
import desafio.itau.model.Transacao;
import org.springframework.stereotype.Repository;

@Repository
public class TransacaoRepository {   
    private List<Transacao> transacoes;

    public TransacaoRepository() {
        transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao listaAdd) {
        transacoes.add(listaAdd);
    }

    public void deletarTransacao(Transacao listaDelete) {
        transacoes.remove(listaDelete);
    }

    public List<Transacao> selectTransacao() {
        return transacoes;
    }
}
