package dio.junit.gbrmrqs.using.junit;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class AssertionsTeste {
    @Test
    void validarLancamento() {
        int[] primeiroLancamento = {10,20,30,40,50};
//        int[] segundoLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {+10, 5, 2, 3, 10};

//        parametros: esperado, atual
//        valida cada indice do array
//        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Gabriel", LocalDate.now());

        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        int outroValor = 5;

        assertEquals(valor, outroValor);
    }
}
