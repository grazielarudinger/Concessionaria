import java.util.List;

public class Main {
    public static void main(String[] args) {
  
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 75000, 4);
        Motocicleta moto1 = new Motocicleta("Honda", "CBR500R", 2021, 10000, 500);

        Armazenamento bancoDeDados = new BancoDeDadosArmazenamento();
        Armazenamento arquivo = new ArquivoArmazenamento();

        Concessionaria concessionaria1 = new Concessionaria(bancoDeDados);

        concessionaria1.adicionarVeiculo(carro1);
        concessionaria1.adicionarVeiculo(moto1);


        List<Veiculo> veiculosConcessionaria1 = concessionaria1.recuperarVeiculos();
        System.out.println("Veículos na concessionária (Banco de Dados):");
        for (Veiculo veiculo : veiculosConcessionaria1) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getAnoFabricacao() + ") - R$" + veiculo.getPreco());
        }

        Concessionaria concessionaria2 = new Concessionaria(arquivo);


        concessionaria2.adicionarVeiculo(carro1);
        concessionaria2.adicionarVeiculo(moto1);

    
        List<Veiculo> veiculosConcessionaria2 = concessionaria2.recuperarVeiculos();
        System.out.println("\nVeículos na concessionária (Arquivo):");
        for (Veiculo veiculo : veiculosConcessionaria2) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getAnoFabricacao() + ") - R$" + veiculo.getPreco());
        }
    }
}