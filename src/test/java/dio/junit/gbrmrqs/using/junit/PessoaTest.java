package dio.junit.gbrmrqs.using.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalcularIdade() {
        Pessoa gabriel = new Pessoa("Gabriel", LocalDate.of(2000, 1, 1));
//        para validar resultado
        Assertions.assertEquals(24, gabriel.getIdade());

        Pessoa sabrina = new Pessoa("Sabrina", LocalDate.of(1997, 5, 12));
        Assertions.assertEquals(26, sabrina.getIdade());
    }

    @Test
    void deveRetornarMaiorIdade() {
        Pessoa gabriel = new Pessoa("Gabriel", LocalDate.of(2000, 1, 1));
//        para validar se é true
//        testa condições
        Assertions.assertTrue(gabriel.isMaiorIdade());

        Pessoa sabrina = new Pessoa("Sabrina", LocalDate.of(2010, 5, 12));
//        para validar se é false
        Assertions.assertFalse(sabrina.isMaiorIdade());
    }
}
