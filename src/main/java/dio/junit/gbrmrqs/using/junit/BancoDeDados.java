package dio.junit.gbrmrqs.using.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
//        fez algo
        LOGGER.info("Conexão iniciada");
    }

    public static void fecharConexao() {
//        fez algo
        LOGGER.info("Conexão fechada");
    }

    public static void insereDados(Pessoa pessoa) {
        LOGGER.info("Dados inseridos");
    }

    public static void atualizaDados(Pessoa pessoa) {
        LOGGER.info("Dados atualizados");
    }

    public static void deletaDados(Pessoa pessoa) {
        LOGGER.info("Dados deletados");
    }
}
