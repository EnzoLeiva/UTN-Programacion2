package Kata2;

public class Main {
     public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6)
        };

        for (Figura f : figuras) {
            System.out.println(f.nombre + " área: " + f.calcularArea());
        }
    }
}
