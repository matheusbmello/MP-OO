package model;

public abstract class Passagem {
    private String nomePassageiro;
    private String telefone;
    private Itinerario itinerario;
    private String assento;

    public Passagem(String nomePassageiro, String telefone, Itinerario itinerario, String assento) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.itinerario = itinerario;
        this.assento = assento;
    }

    public Passagem() {
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }
}
