class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int anoFabricacao, double preco, int numPortas) {
        super(marca, modelo, anoFabricacao, preco);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }
}
