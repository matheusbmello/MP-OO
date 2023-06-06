package model;

import java.util.ArrayList;

public class Dados {
    private static final ArrayList<Passagem> passagens = new ArrayList<Passagem>();
    private static final ArrayList<Itinerario> itinerarios = new ArrayList<Itinerario>();

    private Dados() {
    }

    public static ArrayList<Passagem> getPassagens() {
        return passagens;
    }

    public static ArrayList<Itinerario> getItinerarios() {
        return itinerarios;
    }
}
