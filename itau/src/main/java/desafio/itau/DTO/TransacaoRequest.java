package desafio.itau.DTO;
import java.time.OffsetDateTime;

public class TransacaoRequest {
    private double valor;
    private OffsetDateTime dataHora;

    public TransacaoRequest() {
    }

    public double getValor() {
        return valor;
    }
   
    public OffsetDateTime getDataHora() {
        return dataHora;
    }

}
    
