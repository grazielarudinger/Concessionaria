import java.util.ArrayList;
import java.util.List;

class BancoDeDadosArmazenamento implements Armazenamento {
    private List<Veiculo> estoque = new ArrayList<>();

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        estoque.add(veiculo);
    }

    @Override
    public List<Veiculo> recuperarVeiculos() {
        return estoque;
    }
}
