package dio.junit.gbrmrqs.using.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionTeste {
//    presumir q algo só vai acontecer se uma condição for verdadeira

    @Test
    void validarAlgoSomenteNoUsuarioMeimei() {
        Assumptions.assumeTrue("gabrielamarques".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);

    }
}
