package Java.Principiantes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String texto = "Ingrese los lados o radio de la figura";
        String texto2 = "Ingrese la altura de la figura";
        String texto3 = "Ingrese la base de la figura";
        Triangulo triangulo = new Triangulo(ingresarNumero(texto), ingresarNumero(texto), ingresarNumero(texto), ingresarNumero(texto2), ingresarNumero(texto3));
        Circulo circulo = new Circulo(ingresarNumero(texto));
        Cuadrado cuadrado = new Cuadrado(ingresarNumero(texto));
        JOptionPane.showMessageDialog(null, "Area triangulo: "+triangulo.calcularArea());
        JOptionPane.showMessageDialog(null, "Perimetro triangulo: "+triangulo.calcularPerimetro());
        JOptionPane.showMessageDialog(null, "Area circulo: "+circulo.calcularArea());
        JOptionPane.showMessageDialog(null, "Perimetro circulo: "+circulo.calcularPerimetro());
        JOptionPane.showMessageDialog(null, "Area cuadrado: "+cuadrado.calcularArea());
        JOptionPane.showMessageDialog(null, "Perimetro cuadrado: "+cuadrado.calcularPerimetro());

    }
    public static int ingresarNumero(String texto) {
        int numero = 0;
        boolean salida = false;
        while (!salida) {
            try{
                numero = Integer.parseInt(JOptionPane.showInputDialog(texto));
                salida = true;
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero");
            }
        }
        return numero;
    }
}