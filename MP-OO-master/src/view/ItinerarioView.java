package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.ItinerarioController;
import model.Dados;
import model.Passagem;

public class ItinerarioView implements ActionListener {

    private static JFrame f = new JFrame();
    private static JScrollPane scroll = new JScrollPane();
    private static JButton btnContinuar = new JButton("Continuar");

    private Passagem dadosNovaPassagem;

    public ItinerarioView(Passagem dadosNovaPassagem) {
        this.dadosNovaPassagem = dadosNovaPassagem;

        f.setTitle("Escolha o itinerário");

        // Definindo os tamanhos
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        String[] header = { " ", "Origem", "Destino", "Data" };
        scroll.setViewportView(new JTable(ItinerarioController.genItinerarioTable(Dados.getVoos(), header, false)));

        scroll.setBounds(30, 30, 700, 400);
        btnContinuar.setBounds(300, 450, 150, 40);

        btnContinuar.addActionListener(this);
        f.add(scroll);
        f.add(btnContinuar);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnContinuar) {
            int selectedRow = ((JTable) scroll.getViewport().getView()).getSelectedRow();
            if (selectedRow > -1) {
                dadosNovaPassagem.setItinerario(Dados.getVoos().get(selectedRow));

                new TelaFinalView(dadosNovaPassagem);
                f.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um itinerário", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
