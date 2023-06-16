package view;

import javax.swing.*;

import control.ItinerarioControl;

import java.awt.event.*;

public class ItinerarioView implements ActionListener {

    private static JFrame f;
    private static JLabel origemLabel;
    private static JLabel destinoLabel;
    private static JList<String> origem;
    private static JList<String> destino;
    private static JButton continuar;
    private static JScrollPane so, sd;

    public ItinerarioView() {
        // Crie um vetor com as possibilidades de classes
        String Cidades[] = { "Aracaju - SE", "Belém - PA", "Belo Horizonte - MG", "Boa Vista - RR", "Brasília - DF",
                "Campo Grande - MS", "Cuiabá - MT", "Curitiba - PR", "Florianópolis - SC", "Fortaleza - CE",
                "Goiânia - GO", "João Pessoa - PB", "Macapá - AP", "Maceió - AL", "Manaus - AM", "Natal - RN",
                "Palmas - TO", "Porto Alegre - RS", "Porto Velho - RO", "Recife - PE", "Rio Branco - AC",
                "Rio de Janeiro - RJ", "Salvador - BA", "São Luís - MA", "São Paulo - SP", "Teresina - PI",
                "Vitória - ES" };

        // Mostrar as possibilidades e a tela
        f = new JFrame("Escolha de Origem e Destino");
        origemLabel = new JLabel("Origem: ");
        destinoLabel = new JLabel("Destino: ");
        origem = new JList<String>(Cidades);
        destino = new JList<String>(Cidades);
        continuar = new JButton("Continuar");
        so = new JScrollPane();
        sd = new JScrollPane();

        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        so.setViewportView(origem);
        sd.setViewportView(destino);

        // Posicionar na tela
        f.setSize(800, 600);
        origemLabel.setBounds(30, 30, 100, 30);
        destinoLabel.setBounds(30, 200, 100, 30);
        so.setBounds(120, 30, 150, 100);
        sd.setBounds(120, 200, 150, 100);
        continuar.setBounds(340, 500, 120, 20);

        // Adicionar ao Frame
        f.setLayout(null);
        f.add(origemLabel);
        f.add(destinoLabel);
        f.add(continuar);
        f.add(so);
        f.add(sd);
        f.setLocationRelativeTo(null);
        origem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        destino.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        f.setVisible(true);
        continuar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String selectedOrigem = origem.getSelectedValue();
        String selectedDestino = destino.getSelectedValue();

        if (selectedOrigem != null && selectedDestino != null) {
            if (ItinerarioControl.checkDestino(selectedOrigem, selectedDestino)) {
                SwingUtilities.invokeLater(() -> {
                    new TelaFinalView();
                });
            }
        }
    }
}
