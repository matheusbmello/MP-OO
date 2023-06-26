package model;

import model.enums.ClassesPassagemAviaoEnum;

public class PassagemAviao extends Passagem {
    private ClassesPassagemAviaoEnum classe;

    public PassagemAviao(String nomePassageiro, String telefone, Itinerario itinerario, String assento,
            ClassesPassagemAviaoEnum classe) {
        super(nomePassageiro, telefone, itinerario, assento);
        this.classe = classe;
    }

    public PassagemAviao() {
    }

    public ClassesPassagemAviaoEnum getClasse() {
        return classe;
    }

    public void setClasse(ClassesPassagemAviaoEnum classe) {
        this.classe = classe;
    }

}
