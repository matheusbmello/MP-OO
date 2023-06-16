package view;

import javax.swing.*;
import java.awt.event.*;

public class ListItinerarioView implements ActionListener {
    private static JFrame f;
    private static JLabel texto;
    private static JButton retornar, alterar, excluir;

    // Mostrar escrito
    public ListItinerarioView() {
        f = new JFrame("");
        texto = new JLabel("Confira os dados do itinerário!");
        retornar = new JButton("Retornar a tela inicial");
        excluir = new JButton("Excluir");
        alterar = new JButton("Alterar itinerários");

        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Dimensionar na Tela
        f.setSize(800, 600);
        texto.setBounds(30, 30, 800, 30);
        retornar.setBounds(10, 200, 180, 30);
        excluir.setBounds(600, 200, 180, 30);
        alterar.setBounds(300, 200, 180, 30);

        // Adicionar ao Frame
        f.setLayout(null);
        f.add(texto);
        f.add(alterar);
        f.add(retornar);
        f.add(excluir);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        excluir.addActionListener(this);
        retornar.addActionListener(this);
        alterar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == alterar) {
            // Redirecionamento para a tela "ItinerarioView"
            SwingUtilities.invokeLater(() -> {
                new ItinerarioView();
            });

        } else if (e.getSource() == excluir) {
            // Redirecionamento para a tela "CadastroView"
            SwingUtilities.invokeLater(() -> {
                new CadastroView();
            });
        } else if (e.getSource() == retornar) {
            // Redirecionamento para a tela "TelaInicialView"
            SwingUtilities.invokeLater(() -> {
                new TelaInicialView();
            });
        }
    }
}
