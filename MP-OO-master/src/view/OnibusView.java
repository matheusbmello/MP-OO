package view;

import javax.swing.*;
import java.awt.event.*;

public class OnibusView implements ActionListener {
    private static JFrame f;
    private static JLabel nome, telefone, laOnibus;
    private static JTextField tfNome, tfTelefone;
    private static JList<String> liOnibus;
    private static JButton continuar;

    // Mostrar escrito
    public OnibusView() {
        f = new JFrame("Ônibus");
        nome = new JLabel("Digite seu nome: ");
        telefone = new JLabel("Digite seu telefone: ");
        laOnibus = new JLabel("Escolha a classe desejada: ");
        tfNome = new JTextField(50);
        tfTelefone = new JTextField(12);

        // criar vetor
        String classes[] = { "Convencional", "Executiva", "Semi Leito", "Cama Leito" };
        liOnibus = new JList<String>(classes);
        continuar = new JButton("Continuar");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // definindo tamanhos (tem que conferir se estao certos)
        f.setSize(800, 600);
        nome.setBounds(30, 30, 100, 30);
        telefone.setBounds(30, 65, 120, 30);
        laOnibus.setBounds(30, 100, 170, 30);
        tfNome.setBounds(130, 30, 200, 30);
        tfTelefone.setBounds(145, 65, 100, 30);
        liOnibus.setBounds(200, 100, 120, 80);
        continuar.setBounds(340, 500, 120, 20);
        continuar.addActionListener(this);

        // adicionando ao Frame
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.add(nome);
        f.add(telefone);
        f.add(laOnibus);
        f.add(tfNome);
        f.add(tfTelefone);
        f.add(liOnibus);
        f.add(continuar);
        f.setVisible(true);
        continuar.addActionListener(this);
    }

    // Clicar no botão Continuar
    public void actionPerformed(ActionEvent e) {
        String nome = tfNome.getText();
        String telefone = tfTelefone.getText();
        String classeSelecionada = liOnibus.getSelectedValue();

        boolean nomeValido = controller.PassagemController.checkNome(nome);
        boolean telefoneValido = controller.PassagemController.checkTel(telefone);
        boolean classeSelecionadaValida = classeSelecionada != null;

        if (!classeSelecionadaValida) {
            JOptionPane.showMessageDialog(f, "Selecione uma classe desejada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (nomeValido && telefoneValido && classeSelecionadaValida) {
            // Redirecionamento para a tela "Itinerario"
            SwingUtilities.invokeLater(() -> {
                new ItinerarioView();
            });
        }
    }
}
