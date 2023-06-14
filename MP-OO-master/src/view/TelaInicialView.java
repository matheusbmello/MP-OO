package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaInicialView implements ActionListener {
    private static JFrame f;
    private static JLabel texto;
    private static JButton cadastrar, listPassagem, listItinerario;

    // criar uma classe dados e usar como banco de dados desde a tela inicial
    // JTable

    // Mostrar escrito
    public TelaInicialView() {
        f = new JFrame("Seja bem-vindo á Tripper!");
        texto = new JLabel(" ");
        cadastrar = new JButton("Cadastrar");
        listPassagem = new JButton("Listagem de passagens");
        listItinerario = new JButton("Listagem de itinerário");

        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Dimensionar na Tela
        f.setSize(800, 600);
        texto.setBounds(30, 30, 100, 30);
        cadastrar.setBounds(30, 200, 100, 30);
        listPassagem.setBounds(120, 30, 150, 100);
        listItinerario.setBounds(120, 200, 150, 100);

        // Adicionar ao Frame
        f.setLayout(null);
        f.add(texto);
        f.add(cadastrar);
        f.add(listPassagem);
        f.add(listItinerario);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        cadastrar.addActionListener(this);
        listPassagem.addActionListener(this);
        listItinerario.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cadastrar) {
            // Redirecionamento para a tela "Cadastro"
            SwingUtilities.invokeLater(() -> {
                new CadastroView();
            });

        } else if (e.getSource() == listPassagem) {
            // Redirecionamento para a tela "ListPassagem"
            SwingUtilities.invokeLater(() -> {
                new ListPassagemView();
            });
        } else if (e.getSource() == listItinerario) {
            // Redirecionamento para a tela "ListItinerario"
            SwingUtilities.invokeLater(() -> {
                new ListItinerarioView();
            });
        }
    }
}
