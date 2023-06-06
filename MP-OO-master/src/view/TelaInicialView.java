package view;

import javax.swing.*;
import java.awt.event.*;

public class TelaInicialView implements ActionListener{
    private static JFrame f;
    private static JButton ba, bo;
    private static JLabel l;

    public static void main(String[] args) {
        f = new JFrame("Seja bem vindo à Tripper");
        ba = new JButton("Avião");
        bo = new JButton("Ônibus");
        l = new JLabel("Escolha o tipo de transporte: ");

        f.setSize(800,600);
        ba.setBounds(315, 50, 80, 30);
        bo.setBounds(405, 50, 80, 30);
        l.setBounds(318, 20, 168, 30);
        f.setLayout(null);
        f.add(ba);
        f.add(bo);
        f.add(l);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //Clicar no botão Avião
    public static void mainA (String args[]){
        TelaInicialView Aviao = new TelaInicialView();
        ba.addActionListener(Aviao);
    }
    //Pelo que entendi aq tem que mandar pra tela avião
    public void actionPerformed(ActionEvent e){
        
    }
    //Clicar no botão ônibus
    public static void mainB (String args[]){
        TelaInicialView Onibus = new TelaInicialView();
        bo.addActionListener(Onibus);
    }
    //tem que mandar para tela Onibus
}