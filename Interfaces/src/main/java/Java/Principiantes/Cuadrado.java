package Java.Principiantes;

public class Cuadrado implements Figura {
    private int lado;
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado*lado;
    }
    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
}
