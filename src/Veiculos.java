import java.util.ArrayList;
import java.util.List;

public class Veiculos <T extends Veiculo> {
    private List<T> lista;

    public Veiculos() {
        lista = new ArrayList<>();
    }

    public void addVeiculo(T veiculo) {
        lista.add(veiculo);
    }

    public void imprimirVeiculos() {
        for (T veiculo : lista) {
            veiculo.imprimirVeiculos();
        }
    }
}
