package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroView implements ActionListener {
    private static JFrame f;
    private static JButton ba, bo;
    private static JLabel l;

    public CadastroView() {
        f = new JFrame("Realize seu cadastro");
        l = new JLabel("Escolha o tipo de transporte: ");
        ba = new JButton("Avião");
        bo = new JButton("Ônibus");

        // Definindo os tamanhos
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        l.setBounds(318, 20, 168, 30);
        ba.setBounds(315, 50, 80, 30);
        bo.setBounds(405, 50, 80, 30);
        f.setLayout(null);

        // Adicionando ao frame
        f.add(ba);
        f.add(bo);
        f.add(l);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension newSize = e.getComponent().getSize();
                l.setBounds(newSize.width / 2 - 84, 20, 168, 30);
                ba.setBounds(newSize.width / 2 - 92, 50, 80, 30);
                bo.setBounds(newSize.width / 2 + 8, 50, 80, 30);
            }
        });

        ba.addActionListener(this);
        bo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ba) {
            // Redirecionamento para a tela "Aviao"
            SwingUtilities.invokeLater(() -> {
                new AviaoView();
            });

        } else if (e.getSource() == bo) {
            // Redirecionamento para a tela "Onibus"
            SwingUtilities.invokeLater(() -> {
                new OnibusView();
            });
        }
    }
}