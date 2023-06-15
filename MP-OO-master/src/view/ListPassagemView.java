package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListPassagemView implements ActionListener {
    private static JFrame f;
    private static JLabel texto;
    private static JButton retornar, alterarA, alterarO, excluir;

    // Mostrar escrito
    public ListPassagemView() {
        f = new JFrame("");
        texto = new JLabel("Confira os dados da passagem!");
        retornar = new JButton("Retornar a tela inicial");
        excluir = new JButton("Excluir passagem");
        alterarA = new JButton("Alterar passagem de avião");
        alterarO = new JButton("Alterar passagem de ônibus");

        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Dimensionar na Tela
        f.setSize(800, 600);
        texto.setBounds(30, 30, 100, 30);
        retornar.setBounds(30, 200, 100, 30);
        excluir.setBounds(120, 30, 150, 100);
        alterarA.setBounds(120, 200, 150, 100);
        alterarO.setBounds(120, 100, 150, 100);

        // Adicionar ao Frame
        f.setLayout(null);
        f.add(texto);
        f.add(alterarA);
        f.add(alterarO);
        f.add(retornar);
        f.add(excluir);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        excluir.addActionListener(this);
        retornar.addActionListener(this);
        alterarA.addActionListener(this);
        alterarO.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == alterarA) {
            // Redirecionamento para a tela "AviaoView"
            SwingUtilities.invokeLater(() -> {
                new AviaoView();
            });

        } else if (e.getSource() == alterarO) {
            // Redirecionamento para a tela "OnibusView"
            SwingUtilities.invokeLater(() -> {
                new OnibusView();
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
