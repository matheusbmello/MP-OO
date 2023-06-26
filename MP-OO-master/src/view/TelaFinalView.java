package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.Dados;
import model.Passagem;
import model.PassagemAviao;
import model.PassagemOnibus;

public class TelaFinalView implements ActionListener {
    private static JFrame frame;
    private static JLabel mensagemFinal, verifica, nome, telefone, laAviao;
    private static JButton confirmarCadastrto, cancelarCadastro;

    private Passagem dadosNovaPassagem;

    public TelaFinalView(Passagem dadosNovaPassagem) {
        this.dadosNovaPassagem = dadosNovaPassagem;
        // Configuração da tela
        frame = new JFrame("Confirmar Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Criação dos componentes
        mensagemFinal = new JLabel("Viagem cadastrada com sucesso!");
        verifica = new JLabel("Verifique abaixo os dados cadastrados:");
        nome = new JLabel("Nome: " + dadosNovaPassagem.getNomePassageiro());
        telefone = new JLabel("Telefone: " + dadosNovaPassagem.getTelefone());
        if (dadosNovaPassagem instanceof PassagemAviao) {
            laAviao = new JLabel("Classe: " + ((PassagemAviao) dadosNovaPassagem).getClasse().toString());
        } else if (dadosNovaPassagem instanceof PassagemOnibus) {
            laAviao = new JLabel(
                    "Tipo de Assento: " + ((PassagemOnibus) dadosNovaPassagem).getTipoPoltrona().toString());
        }

        confirmarCadastrto = new JButton("Confirmar");
        cancelarCadastro = new JButton("Cancelar");

        // definição de tamanhos
        frame.setSize(800, 600);
        mensagemFinal.setBounds(30, 30, 200, 30);
        verifica.setBounds(30, 50, 400, 200);
        confirmarCadastrto.setBounds(260, 300, 150, 30);
        cancelarCadastro.setBounds(460, 300, 150, 30);
        nome.setBounds(30, 100, 200, 30);
        telefone.setBounds(30, 130, 200, 30);
        laAviao.setBounds(30, 160, 200, 30);

        // Configuração do layout
        frame.setLayout(null);

        // Adição dos componentes ao frame
        frame.add(mensagemFinal);
        frame.add(verifica);
        frame.add(nome);
        frame.add(telefone);
        frame.add(laAviao);
        frame.setLocationRelativeTo(null);
        frame.add(confirmarCadastrto);
        frame.add(cancelarCadastro);
        // Exibição da janela
        confirmarCadastrto.addActionListener(this);
        cancelarCadastro.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmarCadastrto) {
            Dados.getPassagens().add(dadosNovaPassagem);
            JOptionPane.showMessageDialog(confirmarCadastrto, "Passagem cadastrada com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == cancelarCadastro) {
            JOptionPane.showMessageDialog(cancelarCadastro, "Cadastro cancelado!", "Cancelamento",
                    JOptionPane.WARNING_MESSAGE);
        }
        frame.dispose();
    }

}