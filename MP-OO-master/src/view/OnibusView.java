package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class OnibusView implements ActionListener {
    private JFrame f;
    private JLabel nome, telefone, laOnibus, mensagemErroNome, mensagemErroTelefone;
    private JTextField tfNome, tfTelefone;
    private JList<String> liOnibus;
    private JButton continuar;

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

        // definindo tamanhos
        f.setSize(800, 600);
        nome.setBounds(30, 30, 120, 30);
        telefone.setBounds(30, 65, 150, 30);
        laOnibus.setBounds(30, 100, 170, 30);
        tfNome.setBounds(150, 30, 200, 30);
        tfTelefone.setBounds(180, 65, 100, 30);
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
        mensagemErroNome = new JLabel("");
        mensagemErroNome.setBounds(30, 150, 300, 30);
        f.add(mensagemErroNome);

        mensagemErroTelefone = new JLabel("");
        mensagemErroTelefone.setBounds(30, 185, 300, 30);
        f.add(mensagemErroTelefone);
        f.setVisible(true);
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
            JOptionPane.showMessageDialog(f, "Selecione a classe desejada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (nomeValido && telefoneValido && classeSelecionadaValida) {
            // Redirecionamento para a tela "Itinerario"
            SwingUtilities.invokeLater(() -> {

            });
        }
    }
}
