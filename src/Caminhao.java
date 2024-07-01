public class Caminhao  extends Veiculo{
    private int carga;

    public Caminhao(String marca, String modelo, int carga) {
        super(marca, modelo);
        this.carga = carga;
    }

    @Override
    public void imprimirVeiculos() {
        System.out.print(" Caminhão: " + getMarca() + " " + getModelo() + " com capacidade de carga de " + carga + " toneladas");
    }
}
