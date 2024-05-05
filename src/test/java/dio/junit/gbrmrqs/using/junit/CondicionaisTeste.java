package dio.junit.gbrmrqs.using.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {


    @Test
//    @EnabledIfEnvironmentVariable(named = "USER", matches = "gabrielamarques")
//    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
//    @EnabledOnOs(OS.MAC)
//    @EnabledOnJre(JRE.JAVA_17)
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    void validarAlgoSomenteNaUsuariaGabriela() {
//        Assumptions.assumeTrue("gabrielamarques".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);

    }

}
