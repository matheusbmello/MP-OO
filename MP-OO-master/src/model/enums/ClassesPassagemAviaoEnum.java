package model.enums;

public enum ClassesPassagemAviaoEnum {
    ECONOMICA("Economica"),
    EXECUTIVA("Executiva"),
    PRIMEIRA_CLASSE("Primeira Classe");

    private String classe;

    ClassesPassagemAviaoEnum(String classe) {
        this.classe = classe;
    }

    public String getValue() {
        return classe;
    }

}
