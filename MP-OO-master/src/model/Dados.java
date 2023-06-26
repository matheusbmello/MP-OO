package model;

import java.util.ArrayList;

public class Dados {
    private static final ArrayList<Passagem> passagens = new ArrayList<Passagem>();
    private static final ArrayList<Itinerario> voos = new ArrayList<Itinerario>();
    private static final ArrayList<Itinerario> translados = new ArrayList<Itinerario>();

    private Dados() {
    }

    public static ArrayList<Passagem> getPassagens() {
        return passagens;
    }

    public static ArrayList<Itinerario> getVoos() {
        return voos;
    }

    public static ArrayList<Itinerario> getTranslados() {
        return translados;
    }
}
