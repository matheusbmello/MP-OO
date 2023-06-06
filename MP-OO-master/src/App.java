import java.util.List;
import java.util.Scanner;
import model.Dados;
import model.Itinerario;
import model.Passagem;
import model.PassagemAviao;
import model.PassagemOnibus;

public class App {
    public static void main(String[] args) throws Exception {
        Itinerario itinerario = new Itinerario("São Paulo", "Rio de Janeiro", "01/01/2022");

        // Crie instâncias das classes PassagemAviao e PassagemOnibus
        Passagem passagemAviao = new PassagemAviao("João", "123456789", itinerario, "A1", "1234");
        Passagem passagemOnibus = new PassagemOnibus("Maria", "987654321", itinerario, "B2", "5678");

        List<Passagem> passagens = itinerario.getPassagens();
        System.out.println(passagens);

        // Adiciona o itinerário na lista de itinerários na classe Dados
        Dados.getItinerarios().add(itinerario);
        Dados.getPassagens().add(passagemAviao);
        Dados.getPassagens().add(passagemOnibus);

        Scanner scanner = new Scanner(System.in); // criar um objeto Scanner

        System.out.println("Seja bem-vindo à (nome da empresa)");
        System.out.println("Você deseja viajar de avião ou de ônibus?");
        System.out.println("Digite 1 para avião e 2 para ônibus");
        int escolha;
        escolha = scanner.nextInt();
        while (escolha == 1 || escolha == 2) {
            if (escolha ==  1) {
                // Imprimir os dados da passagem de avião
                System.out.println("Passagem de Avião:");
                System.out.println("Nome: " + passagemAviao.getNomePassageiro());
                System.out.println("Telefone: " + passagemAviao.getTelefone());
                System.out.println("Itinerario: " + passagemAviao.getItinerario());
                System.out.println("Assento: " + passagemAviao.getAssento());
            }else if(escolha == 2){
                // Imprimir os dados da passagem de ônibus
                System.out.println("Passagem de Ônibus:");
                System.out.println("Nome: " + passagemOnibus.getNomePassageiro());
                System.out.println("Telefone: " + passagemOnibus.getTelefone());
                System.out.println("Itinerario: " + passagemOnibus.getItinerario());
                System.out.println("Assento: " + passagemOnibus.getAssento());
            }else
                System.out.println("Digite uma opção válida.");
        }

        // Imprimir os dados do itinerário
        System.out.println("Dados do itinerário:");
        System.out.println("Origem: " + itinerario.getOrigem());
        System.out.println("Destino: " + itinerario.getDestino());
        System.out.println("Data: " + itinerario.getData());
        System.out.println("Passagens: " + itinerario.getPassagens());

        scanner.close(); // fechar o objeto Scanner
    }
}
