package control;

import javax.swing.JOptionPane;

public class ItinerarioControl {
   public static boolean checkDestino(String origem, String destino) {
       if (origem.equals(destino)) {
           JOptionPane.showMessageDialog(null, "Escolha um destino diferente de sua origem", "Erro",
                   JOptionPane.ERROR_MESSAGE);
           return false;
       }
       return true;
   }
}
