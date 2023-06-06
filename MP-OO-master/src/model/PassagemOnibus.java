package model;

import model.enums.TipoPoltronaEnum;

public class PassagemOnibus extends Passagem {
    private TipoPoltronaEnum tipoPoltrona;

    public PassagemOnibus(TipoPoltronaEnum tipoPoltrona){
        this.tipoPoltrona = tipoPoltrona;
    }

    public PassagemOnibus(String string, String string2, Itinerario itinerario, String string3, String string4) {
    }

    public TipoPoltronaEnum getTipoPoltrona() {
        return tipoPoltrona;
    }

    public void setTipoPoltrona(TipoPoltronaEnum tipoPoltrona) {
        this.tipoPoltrona = tipoPoltrona;
    }
}
