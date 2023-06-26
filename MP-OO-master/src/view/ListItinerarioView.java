package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ListItinerarioView implements ActionListener {
    private static JFrame f;
    private static JLabel texto;
    private static JButton retornar, alterar, excluir;

    // Mostrar escrito
    public ListItinerarioView() {
        f = new JFrame("Alteração de itinerário");
        texto = new JLabel("Confira os dados do itinerário!");
        retornar = new JButton("Retornar à tela inicial");
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
        } else if (e.getSource() == excluir) {

            new CadastroView();

        } else if (e.getSource() == retornar) {

        }
    }
}
