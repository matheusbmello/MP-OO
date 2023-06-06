package view;

import javax.swing.*;
import java.awt.event.*;

public class OnibusView {

    private static JFrame f;
    private static JLabel nome, telefone, laOnibus;
    private static JTextField tfNome, tfTelefone;
    private static JList<String> liOnibus;
    private static JButton continuar;




    //Mostrar escrito
    public static void main(String[] args) {
        f = new JFrame("Ônibus");
        nome = new JLabel("Digite seu nome: ");
        telefone = new JLabel("Digite seu telefone: ");
        laOnibus = new JLabel("Escolha a classe desejada: ");
        tfNome = new JTextField(50);
        tfTelefone = new JTextField(12);

        //criar vetor
        String classes[] = {"Convencional", "Executiva", "Semi Leito","Cama Leito"};
        liOnibus = new JList<String>(classes);
        continuar = new JButton("Continuar");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //definindo tamanhos (tem que conferir se estao certos)
        f.setSize(800, 600);
        nome.setBounds(30, 30, 100, 30);
        telefone.setBounds(30, 65, 120, 30);
        laOnibus.setBounds(30, 100, 170, 30);
        tfNome.setBounds(130, 30, 200, 30);
        tfTelefone.setBounds(145, 65, 100, 30);
        liOnibus.setBounds(200, 100, 120, 80);
        continuar.setBounds(340, 500, 120, 20);

        //adicionando ao Frame
        f.setLayout(null);
        f.add(nome);
        f.add(telefone);
        f.add(laOnibus);
        f.add(tfNome);
        f.add(tfTelefone);
        f.add(liOnibus);
        f.add(continuar);
        f.setVisible(true);
    }
         
}

