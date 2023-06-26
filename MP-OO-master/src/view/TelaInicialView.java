package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class TelaInicialView implements ActionListener {
    private static JFrame f;
    private static JLabel texto;
    private static JButton cadastrarPassagem, listPassagem, listItinerario, cadastrarItinerario;

    // criar uma classe dados e usar como banco de dados desde a tela inicial
    // JTable

    // Mostrar escrito
    public TelaInicialView() {
        f = new JFrame("Seja bem-vindo à Tripper!");
        texto = new JLabel(
                "Bem-vindo, por favor, escolha a opção que deseja: ");
        cadastrarPassagem = new JButton("Cadastrar Passagem");
        cadastrarItinerario = new JButton("Cadastrar Itinerário");
        listItinerario = new JButton("Listagem de itinerários");
        listPassagem = new JButton("Listagem de passagens");

        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        f.setSize(800, 600);
        // Adicionar os boões na tela inicial ao centro da tela
        texto.setBounds(200, 30, 800, 30);
        cadastrarPassagem.setBounds(100, 200, 200, 30);
        cadastrarItinerario.setBounds(400, 200, 200, 30);
        listItinerario.setBounds(100, 300, 200, 30);
        listPassagem.setBounds(400, 300, 200, 30);

        // Adicionar ao Frame
        f.setLayout(null);
        f.add(texto);
        f.add(cadastrarPassagem);
        f.add(listItinerario);
        f.add(listPassagem);
        f.add(cadastrarItinerario);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        cadastrarPassagem.addActionListener(this);
        listItinerario.addActionListener(this);
        listPassagem.addActionListener(this);
        cadastrarItinerario.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cadastrarPassagem) {
            SwingUtilities.invokeLater(() -> {
                new CadastroView();
            });
        } else if (e.getSource() == listPassagem) {
            SwingUtilities.invokeLater(() -> {
                new ListPassagemView();
            });
        } else if (e.getSource() == listItinerario) {
            SwingUtilities.invokeLater(() -> {
                new ListItinerarioView();
            });
        } else if (e.getSource() == cadastrarItinerario) {
            new CadastroItinerarioView();
        }
    }
}
