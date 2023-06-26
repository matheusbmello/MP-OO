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

    public static String[] toArray() {
        String[] array = new String[ClassesPassagemAviaoEnum.values().length];
        for (int i = 0; i < ClassesPassagemAviaoEnum.values().length; i++) {
            array[i] = ClassesPassagemAviaoEnum.values()[i].getValue();
        }
        return array;
    }

    public static ClassesPassagemAviaoEnum getEnum(String value) {
        for (ClassesPassagemAviaoEnum classe : ClassesPassagemAviaoEnum.values()) {
            if (classe.getValue().equals(value)) {
                return classe;
            }
        }
        return null;
    }

}
