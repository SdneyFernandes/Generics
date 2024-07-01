public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void imprimirVeiculos() {
        System.out.print(" Moto: " + getMarca() + " " + getModelo() + " com " + cilindrada + "cc");;
    }
}
