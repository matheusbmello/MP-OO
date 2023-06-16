package utils;

import org.junit.Test;
import controller.ItinerarioController;
import static org.junit.Assert.*;

public class ItinerarioUtils {

    //Teste para checagem de origem e destino iguais
    @Test
    public void itinerarioErrado() {
        String origem = "Aracaju - SE";
        String destino = "Aracaju - SE";

        assertFalse(ItinerarioController.checkDestino(origem, destino));
    }

    //Teste para checagem de origem e destino diferentes
    @Test
    public void itinerarioCerto() {
        String origem = "Aracaju - SE";
        String destino = "São Paulo - SP";

        assertTrue(ItinerarioController.checkDestino(origem, destino));
    }
}
