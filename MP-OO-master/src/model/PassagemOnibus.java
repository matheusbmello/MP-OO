package model;

import model.enums.TipoPoltronaEnum;

public class PassagemOnibus extends Passagem {
    private TipoPoltronaEnum tipoPoltrona;

    public PassagemOnibus(String nomePassageiro, String telefone, Itinerario itinerario, String assento,
            TipoPoltronaEnum tipoPoltrona) {
        super(nomePassageiro, telefone, itinerario, assento);
        this.tipoPoltrona = tipoPoltrona;
    }

    public PassagemOnibus() {
    }

    public TipoPoltronaEnum getTipoPoltrona() {
        return tipoPoltrona;
    }

    public void setTipoPoltrona(TipoPoltronaEnum tipoPoltrona) {
        this.tipoPoltrona = tipoPoltrona;
    }
}
