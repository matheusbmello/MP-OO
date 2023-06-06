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
}
