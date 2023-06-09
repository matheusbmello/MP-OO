package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.PassagemAviao;
import model.enums.ClassesPassagemAviaoEnum;

public class AviaoView implements ActionListener {
    private JFrame f;
    private JLabel nome, telefone, laAviao, mensagemErroNome, mensagemErroTelefone;
    private JTextField tfNome, tfTelefone;
    private JList<String> liAviao;
    private JButton continuar;

    // Mostrar escrito
    public AviaoView() {
        f = new JFrame("Avião");
        nome = new JLabel("Digite seu nome: ");
        telefone = new JLabel("Digite seu telefone: ");
        laAviao = new JLabel("Escolha a classe desejada: ");
        tfNome = new JTextField(50);
        tfTelefone = new JTextField(12);

        // Cria um vetor com as possibilidades de classes
        String classes[] = ClassesPassagemAviaoEnum.toArray();
        liAviao = new JList<String>(classes);
        continuar = new JButton("Continuar");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Definindo tamanhos
        f.setSize(800, 600);
        nome.setBounds(30, 30, 100, 30);
        telefone.setBounds(30, 65, 120, 30);
        laAviao.setBounds(30, 100, 170, 30);
        tfNome.setBounds(130, 30, 200, 30);
        tfTelefone.setBounds(145, 65, 100, 30);
        liAviao.setBounds(200, 100, 120, 60);
        continuar.setBounds(340, 500, 120, 20);

        // Adicionando ao Frame
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.add(nome);
        f.add(telefone);
        f.add(laAviao);
        f.add(tfNome);
        f.add(tfTelefone);
        f.add(liAviao);
        f.add(continuar);

        mensagemErroNome = new JLabel("");
        mensagemErroNome.setBounds(30, 150, 300, 30);
        f.add(mensagemErroNome);

        mensagemErroTelefone = new JLabel("");
        mensagemErroTelefone.setBounds(30, 185, 300, 30);
        f.add(mensagemErroTelefone);

        f.setVisible(true);
        continuar.addActionListener(this);
    }

    // Clicar no botão Continuar
    public void actionPerformed(ActionEvent e) {
        String nome = tfNome.getText();
        String telefone = tfTelefone.getText();
        String classeSelecionada = liAviao.getSelectedValue();

        boolean nomeValido = controller.PassagemController.checkNome(nome);
        boolean telefoneValido = controller.PassagemController.checkTel(telefone);
        boolean classeSelecionadaValida = classeSelecionada != null;

        if (!classeSelecionadaValida) {
            JOptionPane.showMessageDialog(f, "Selecione uma classe desejada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (nomeValido && telefoneValido && classeSelecionadaValida) {
            ClassesPassagemAviaoEnum classe = ClassesPassagemAviaoEnum.getEnum(classeSelecionada);
            PassagemAviao dadosNovaPassagem = new PassagemAviao();
            dadosNovaPassagem.setNomePassageiro(nome);
            dadosNovaPassagem.setTelefone(telefone);
            dadosNovaPassagem.setClasse(classe);

            // Redirecionamento para a tela "Itinerario"

            new ItinerarioView(dadosNovaPassagem);
            f.dispose();
        }
    }
}
