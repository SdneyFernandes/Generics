public class Main {
    public static void main(String[] args) {
        Veiculos<Carro> listaDeCarros = new Veiculos<>();
        listaDeCarros.addVeiculo(new Carro("Ford", "Focus", 4));
        listaDeCarros.addVeiculo(new Carro("Volkswagen", "Golf", 5));
        listaDeCarros.imprimirVeiculos();

        Veiculos<Moto> listaDeMotos = new Veiculos<>();
        listaDeMotos.addVeiculo(new Moto("Honda", "CG 160", 160));
        listaDeMotos.addVeiculo(new Moto("Yamaha", "Fazer 250", 250));
        listaDeMotos.imprimirVeiculos();

        Veiculos<Caminhao> listaDeCaminhoes = new Veiculos<>();
        listaDeCaminhoes.addVeiculo(new Caminhao("Mercedes-Benz", "Actros", 20));
        listaDeCaminhoes.addVeiculo(new Caminhao("Scania", "R 450", 30));
        listaDeCaminhoes.imprimirVeiculos();
    }
}