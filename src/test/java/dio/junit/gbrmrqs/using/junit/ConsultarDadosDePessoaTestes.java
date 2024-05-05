package dio.junit.gbrmrqs.using.junit;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTestes {

    @BeforeAll
//    executa uma vez
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
//        System.out.println("rodou");
    }

//    executa antes de cada teste
    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Gabriel", LocalDate.of(2000, 1, 1)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.deletaDados(new Pessoa("Gabriel", LocalDate.of(2000, 1, 1)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
        System.out.println("rodou validarDadosDeRetorno");
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
        System.out.println("rodou validarDadosDeRetorno2");
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.fecharConexao();
//        System.out.println("rodou finaliza conexão");
    }
}
