package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.AviaoControl;

class AviaoOnibusTest {

    // Teste para checagem do nome do usuário
    @Test
    void testCheckNome() {
        String valorNomeErrado = "M4th3us";
        String valorNomeCorreto = "Matheus";
        assertTrue(AviaoControl.checkNome(
                valorNomeCorreto));
        assertFalse(AviaoControl.checkNome(
                valorNomeErrado));
    }

    // Teste para checagem do telefone do usuário
    @Test
    void testCheckTel() {
        String valorTelErrado = "(61)99999-9999";
        String valorTelCorreto = "61999999999";
        assertTrue(AviaoControl.checkTel(
                valorTelCorreto));
        assertFalse(AviaoControl.checkTel(
                valorTelErrado));
    }

}
