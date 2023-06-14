package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaInicialView implements ActionListener{
    private static JFrame f;
    private static JLabel texto;
    private static JButton cadastrar, listPassagem, listItinerario;

    // Mostrar escrito
    public TelaInicialView() {
        f = new JFrame("Seja bem-vindo á Tripper!");
        texto = new JLabel(" ");
        cadastrar = new JButton("Cadastrar");
        listPassagem = new JButton("Listagem de passagens");
        listItinerario = new JButton("Listagem de itinerário");

        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Dimensionar na Tela
        f.setSize(800, 600);
        texto.setBounds(30, 30, 100, 30);
        cadastrar.setBounds(30, 200, 100, 30);
        listPassagem.setBounds(120, 30, 150, 100);
        listItinerario.setBounds(120, 200, 150, 100);

         //Adicionar ao Frame
         f.setLayout(null);
         f.add(texto);
         f.add(listPassagem);
         f.add(listItinerario);
         f.setLocationRelativeTo(null);
         f.setVisible(true);
         cadastrar.addActionListener(this);
         listPassagem.addActionListener(this);
         listItinerario.addActionListener(this);
    }

    //Clicar no botão Continuar   
    public void actionPerformed(ActionEvent e) {
        // Redirecionamento para a tela "Itinerario"
        SwingUtilities.invokeLater(() -> {
            new CadastroView();
        });
    }
}
