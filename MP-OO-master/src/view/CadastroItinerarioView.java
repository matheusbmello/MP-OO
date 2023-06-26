package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Dados;
import model.Itinerario;

public class CadastroItinerarioView extends JFrame implements ActionListener {

    private static JButton btnCadastrar;
    private static JButton btnVoltar;

    private static JLabel lblOrigem;
    private static JLabel lblDestino;
    private static JLabel lblData;

    private static JTextField txtOrigem;
    private static JTextField txtDestino;
    private static JTextField txtData;

    private static JList<String> tipoItinerario;

    public CadastroItinerarioView() {

        this.setSize(800, 600);

        btnCadastrar = new JButton("Cadastrar");
        btnVoltar = new JButton("Voltar");

        txtOrigem = new JTextField();
        txtDestino = new JTextField();
        txtData = new JFormattedTextField();
        lblOrigem = new JLabel("Origem");
        lblDestino = new JLabel("Destino");
        lblData = new JLabel("Data");

        String[] tipos = { "Avião", "Onibus" };
        tipoItinerario = new JList<String>(tipos);

        lblOrigem.setBounds(30, 30, 100, 30);
        lblDestino.setBounds(30, 65, 120, 30);
        lblData.setBounds(30, 100, 170, 30);
        txtOrigem.setBounds(130, 30, 200, 30);
        txtDestino.setBounds(145, 65, 200, 30);
        txtData.setBounds(200, 100, 150, 30);
        btnCadastrar.setBounds(360, 300, 150, 40);
        btnVoltar.setBounds(200, 300, 150, 40);
        tipoItinerario.setBounds(200, 150, 120, 60);

        btnCadastrar.addActionListener(this);
        btnVoltar.addActionListener(this);

        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.add(txtOrigem);
        this.add(txtDestino);
        this.add(txtData);
        this.add(btnCadastrar);
        this.add(btnVoltar);
        this.add(lblOrigem);
        this.add(lblDestino);
        this.add(lblData);
        this.add(tipoItinerario);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastrar) {

            if (txtOrigem.getText().isEmpty() || txtDestino.getText().isEmpty() || txtData.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                return;
            }

            Dados.getVoos().add(new Itinerario(txtOrigem.getText(), txtDestino.getText(),
                    txtData.getText()));

            JOptionPane.showMessageDialog(null, "Itinerário cadastrado com sucesso!");
            this.dispose();
        } else if (e.getSource() == btnVoltar) {
            this.dispose();
        }
    }

}
