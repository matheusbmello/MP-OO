package view;

import javax.swing.*;
import java.awt.event.*;

public class TelaFinalView implements ActionListener{
    private static JFrame frame;
    private static JLabel mensagemFinal, verifica, nome, telefone, laAviao;
    private static JButton alterar;
    private static JButton excluir;

    public TelaFinalView() {
        // Configuração da tela
        frame = new JFrame("Cadastro finalizado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Criação dos componentes
        mensagemFinal = new JLabel("Viagem cadastrada com sucesso!");
        verifica = new JLabel("Verifique abaixo os dados cadastrados:");
        nome = new JLabel("Nome: ");
        telefone = new JLabel("Telefone: ");
        laAviao = new JLabel("Classe: ");

        alterar = new JButton("Alterar");
        excluir = new JButton("Excluir");

            //definição de tamanhos
            frame.setSize(800, 600);
            mensagemFinal.setBounds(30, 30, 200, 30);
            verifica.setBounds(30, 50, 400, 200);
            alterar.setBounds(260, 300, 100, 30);
            excluir.setBounds(460, 300, 100, 30);

        // Configuração do layout
        frame.setLayout(null);

        // Adição dos componentes ao frame
        frame.add(mensagemFinal);
        frame.add(verifica);
        frame.add(nome);
        frame.add(telefone);
        frame.add(laAviao);
        frame.add(alterar);
        frame.add(excluir);

        // Exibição da janela
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TelaFinalView();
            }
        });
    }

    // Clicar no botão Alterar
    public static void mainA(String args[]) {
        TelaFinalView a = new TelaFinalView();
        alterar.addActionListener(a);
        // redirecionar para a tela "itinerario"
    }

    public void actionPerformed(ActionEvent e) {

    }

    // Clicar no botão Excluir
    public static void mainB(String args[]) {
        TelaFinalView e = new TelaFinalView();
        excluir.addActionListener(e);
        // redirecionar para a tela "telaInicial"
    }
    /*
     * public void actionPerformed(ActionEvent e){
     * 
     * }
     */

    // não é possível utilizar o acrionPerformed mais de uma vez na classe
    // encontrar uma forma de diferenciar as açoes dos botões de alterrar e excluir
}