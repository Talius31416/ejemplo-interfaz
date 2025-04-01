package Java.Principiantes;

public class Circulo implements Figura {
    private final double pi = 3.1416;
    private int radio;
    public Circulo(int radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return radio*pi*radio;
    }
    @Override
    public double calcularPerimetro() {
        return 2*pi*radio;
    }
}
