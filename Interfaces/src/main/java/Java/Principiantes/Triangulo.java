package Java.Principiantes;

public class Triangulo implements Figura{
    private int lado1, lado2, lado3;
    private int altura;
    private int base;
    public Triangulo(int lado1, int lado2, int lado3, int altura, int base) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double calcularArea() {
        return altura*base/2d;
    }
    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }
}
