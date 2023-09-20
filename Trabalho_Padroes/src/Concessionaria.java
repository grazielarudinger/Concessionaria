import java.util.List;

class Concessionaria {
    private Armazenamento armazenamento;

    public Concessionaria(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        armazenamento.adicionarVeiculo(veiculo);
    }

    public List<Veiculo> recuperarVeiculos() {
        return armazenamento.recuperarVeiculos();
    }
}