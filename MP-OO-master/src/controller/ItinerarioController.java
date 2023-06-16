package controller;

import javax.swing.JOptionPane;

public class ItinerarioController {
   public static boolean checkDestino(String origem, String destino) {
    // Limitar o usuário a escolher origem e destino diferentes
       if (origem.equals(destino)) {
           JOptionPane.showMessageDialog(null, "Escolha um destino diferente de sua origem", "Erro",
                   JOptionPane.ERROR_MESSAGE);
           return false;
       }
       return true;
   }
}
