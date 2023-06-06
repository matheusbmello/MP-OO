package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Itinerario {
    private String origem;
    private String destino;
    private String data;
    private List<Passagem> passagens = new ArrayList<>();

    public Itinerario(String origem, String destino, String data) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public String getOrigem() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Origem da passagem: ");
            origem = scanner.next();
            scanner.nextLine(); // Limpeza de buffer
        }
        return origem;
    }

    public String getDestino() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Destino da passagem: ");
            destino = scanner.next();
            scanner.nextLine(); // Limpeza de buffer
        }
        return destino;
    }

    public String getData() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Data da passagem (dd/mm/aaaa): ");
            data = scanner.next();
            scanner.nextLine(); // Limpeza de buffer
        }
        return data;
    }

    public List<Passagem> getPassagens() {
        System.out.println("Listagem dos dados das passagens:");
        for (Passagem passagem : passagens) {
            System.out.println("Nome: " + passagem.getNomePassageiro());
            System.out.println("Telefone: " + passagem.getTelefone());
            System.out.println("Itinerario: " + passagem.getItinerario());
            System.out.println("Assento: " + passagem.getAssento());
        }
        return passagens;
    }

    public void setOrigem(String novaOrigem) {
        this.origem = novaOrigem;
    }

    public void setDestino() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Destino a ser alterado: ");
            String novoDestino = scanner.next();
            scanner.nextLine(); // Limpeza de buffer
            this.destino = novoDestino;
        }
    }
}
