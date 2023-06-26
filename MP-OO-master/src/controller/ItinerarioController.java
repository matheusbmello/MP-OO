package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Itinerario;

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

    public static DefaultTableModel genItinerarioTable(ArrayList<Itinerario> itinerarios, Object[] header,
            Boolean isEditable) {
        DefaultTableModel tableModel;

        if (isEditable) {
            tableModel = new DefaultTableModel(header, 0);
        } else {
            tableModel = new DefaultTableModel(header, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        }

        for (int i = 0; i < itinerarios.size(); i++) {
            Object[] data = { i + 1, itinerarios.get(i).getOrigem(), itinerarios.get(i).getDestino(),
                    itinerarios.get(i).getData() };
            tableModel.addRow(data);
        }

        return tableModel;
    }
}
