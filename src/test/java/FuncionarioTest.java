

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Funcionario funcionario = new Funcionario(10 , 2200);

        assertEquals(2400.0, funcionario.calcularSalario());
    }

}