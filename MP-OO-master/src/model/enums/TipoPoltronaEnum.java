package model.enums;

public enum TipoPoltronaEnum {
    CAMA_LEITO("Cama Leito"),
    SEMI_LEITO("Semi Leito"),
    EXECUTIVA("Executiva"),
    CONVENCIONAL("Convencional");

    private String descricao;

    TipoPoltronaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String[] toArray() {
        String[] array = new String[TipoPoltronaEnum.values().length];
        for (int i = 0; i < TipoPoltronaEnum.values().length; i++) {
            array[i] = TipoPoltronaEnum.values()[i].getDescricao();
        }
        return array;
    }

    public static TipoPoltronaEnum getEnum(String value) {
        for (TipoPoltronaEnum tipoPoltrona : TipoPoltronaEnum.values()) {
            if (tipoPoltrona.getDescricao().equals(value)) {
                return tipoPoltrona;
            }
        }
        return null;
    }
}
