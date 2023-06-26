import model.Dados;
import model.Itinerario;
import view.TelaInicialView;

public class App {
    public static void main(String[] args) throws Exception {
        Dados.getVoos().add(new Itinerario("São Paulo", "Rio de Janeiro", "Avião"));
        new TelaInicialView();
    }
}
