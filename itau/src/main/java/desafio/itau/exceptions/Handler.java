package desafio.itau.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Handler {
    @ExceptionHandler(TransacaoInvalidaException.class)
    public ResponseEntity<String> erro422(TransacaoInvalidaException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
