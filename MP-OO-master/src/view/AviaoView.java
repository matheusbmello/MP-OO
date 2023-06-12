package view;

import javax.swing.*;
import java.awt.event.*;

public class AviaoView implements ActionListener{
    private static JFrame f;
    private static JLabel nome, telefone, laAviao;
    private static JTextField tfNome, tfTelefone;
    private static JList<String> liAviao;
    private static JButton continuar;

    //Mostrar escrito
    public AviaoView() {
        f = new JFrame("Avião");
        nome = new JLabel("Digite seu nome: ");
        telefone = new JLabel("Digite seu telefone: ");
        laAviao = new JLabel("Escolha a classe desejada: ");
        tfNome = new JTextField(50);
        tfTelefone = new JTextField(12);
        //Cria um vetor com as possibilidades de classes
        String classes[] = {"Econômica", "Executiva", "Primeira Classe"};
        liAviao = new JList<String>(classes);
        continuar = new JButton("Continuar");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //definindo tamanhos (tem que conferir se estao certos)
        f.setSize(800, 600);
        nome.setBounds(30, 30, 100, 30);
        telefone.setBounds(30, 65, 120, 30);
        laAviao.setBounds(30, 100, 170, 30);
        tfNome.setBounds(130, 30, 200, 30);
        tfTelefone.setBounds(145, 65, 100, 30);
        liAviao.setBounds(200, 100, 120, 60);
        continuar.setBounds(340, 500, 120, 20);

        //adicionando ao Frame
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.add(nome);
        f.add(telefone);
        f.add(laAviao);
        f.add(tfNome);
        f.add(tfTelefone);
        f.add(liAviao);
        f.add(continuar);
        f.setVisible(true);
        continuar.addActionListener(this);
    }

    //Clicar no botão Continuar   
    public void actionPerformed(ActionEvent e) {
        // Redirecionamento para a tela "Itinerario"
        SwingUtilities.invokeLater(() -> {
            new ItinerarioView();
        });
    }
}