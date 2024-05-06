package dio.junit.gbrmrqs.using.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTeste {

    @Test
    void validaCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("1234", 0);
        Conta contaDestino = new Conta("5678", 100);

        TransferenciaEntreContas tefCenario = new TransferenciaEntreContas();

//        se estoura a exceção
        Assertions.assertThrows(IllegalArgumentException.class, () -> tefCenario.transfere(contaOrigem, contaDestino, 0));


//        se n estoura a exceção
        Assertions.assertDoesNotThrow(() -> tefCenario.transfere(contaOrigem, contaDestino, 20));

    }
}
