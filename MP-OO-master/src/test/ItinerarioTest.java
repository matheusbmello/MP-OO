package test;

import org.junit.Test;

import control.ItinerarioControl;

import static org.junit.Assert.*;

public class ItinerarioTest {

    //Teste para checagem de origem e destino iguais
    @Test
    public void testCheckDestino_OrigemIgualDestino_ItinerarioErrado() {
        String origem = "Aracaju - SE";
        String destino = "Aracaju - SE";

        assertFalse(ItinerarioControl.checkDestino(origem, destino));
    }

    //Teste para checagem de origem e destino diferentes
    @Test
    public void testCheckDestino_OrigemDiferenteDestino_ItinerarioCerto() {
        String origem = "Aracaju - SE";
        String destino = "São Paulo - SP";

        assertTrue(ItinerarioControl.checkDestino(origem, destino));
    }
}
