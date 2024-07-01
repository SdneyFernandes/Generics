public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void imprimirVeiculos() {
        System.out.print(" Carro: " + getMarca() + " " + getModelo() + " com " + numeroDePortas + " portas");;
    }
}
