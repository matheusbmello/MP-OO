package utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import controller.PassagemController;

class PassagemUtils {

    // Teste para checagem do nome do usuário
    @Test
    void testCheckNome() {
        String valorNomeErrado = "M4th3us";
        String valorNomeCorreto = "Matheus de Mello";
        assertTrue(PassagemController.checkNome(valorNomeCorreto));
        assertFalse(PassagemController.checkNome(valorNomeErrado));
    }

    // Teste para checagem do telefone do usuário
    @Test
    void testCheckTel() {
        String valorTelErrado = "(61)99999-9999";
        String valorTelCorreto = "61999999999";
        assertTrue(PassagemController.checkTel(valorTelCorreto));
        assertFalse(PassagemController.checkTel(valorTelErrado));
    }

}
