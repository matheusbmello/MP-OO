package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaFinalView {
    private JFrame frame;
    private JLabel mensagemFinal, dados;
    private JButton alterar, excluir;

    public TelaFinalView() {
        // Configuração da tela
        frame = new JFrame("Cadastro finalizado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Criação dos componentes
        mensagemFinal = new JLabel("Viagem cadastrada com sucesso!");
        dados = new JLabel("Verifique abaixo os dados cadastrados:\nNome:\nTelefone:\nLaAviao:");

        alterar = new JButton("Alterar");
        excluir = new JButton("Excluir");

                //definição de tamanhos
                frame.setSize(800, 600);
                mensagemFinal.setBounds(30, 30, 200, 30);
                dados.setBounds(30, 50, 400, 200);
                alterar.setBounds(260, 300, 100, 30);
                excluir.setBounds(460, 300, 100, 30);

        // Configuração do layout
        frame.setLayout(null);

        // Adição dos componentes ao frame
        frame.add(mensagemFinal);
        frame.add(dados);
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
}