package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

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
        l.setBounds(270, 20, 250, 30);
        ba.setBounds(250, 50, 120, 30);
        bo.setBounds(380, 50, 120, 30);
        f.setLayout(null);

        // Adicionando ao frame
        f.add(ba);
        f.add(bo);
        f.add(l);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        f.dispose();
    }
}