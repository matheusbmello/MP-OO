package model;

import model.enums.ClassesPassagemAviaoEnum;

public class PassagemAviao extends Passagem {
    private ClassesPassagemAviaoEnum classe;

    public PassagemAviao(ClassesPassagemAviaoEnum classe){
        this.classe = classe;
    }

    public PassagemAviao(String string, String string2, Itinerario itinerario, String string3, String string4) {
    }

    public ClassesPassagemAviaoEnum getClasse() {
        return classe;
    }

    public void setClasse(ClassesPassagemAviaoEnum classe) {
        this.classe = classe;
    }
    
}
