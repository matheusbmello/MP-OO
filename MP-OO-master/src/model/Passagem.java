package model;
import java.util.Scanner;

public abstract class Passagem {
    private String nomePassageiro;
    private String telefone;
    private Itinerario itinerario;
    private String assento;

   public Passagem(){
        /* this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.itinerario = itinerario;
        this.assento = assento; */
    }

    public String getNomePassageiro() {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite o nome do passageiro: ");
            nomePassageiro = ler.next();
        }
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome a ser alterado: ");
        nomePassageiro = ler.next();
        this.nomePassageiro = nomePassageiro;
        ler.close();
    }

    public String getTelefone() {
        try (Scanner ler = new Scanner(System.in)){
        System.out.println("Digite o telefone do passageiro: ");
        telefone = ler.next();
        return telefone;
        }
    }

    public void setTelefone(String telefone) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o telefone a ser alterado: ");
        telefone = ler.next();
        this.telefone = telefone;
        ler.close();
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setIntinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    public String getAssento() {
        try (Scanner ler = new Scanner(System.in)){
        System.out.println("Digite o assento do passageiro: ");
        assento = ler.next();
        return assento;
        }
    }

    public void setAssento(String assento) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o assento a ser alterado: ");
        assento = ler.next();
        this.assento = assento;
        ler.close();
    }
}
