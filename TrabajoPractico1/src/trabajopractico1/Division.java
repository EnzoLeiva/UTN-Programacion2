package trabajopractico1;

import java.util.Scanner;

public class Division {
    //División con int
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingrese el dividendo: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Ingrese el divisor: ");
//        int b = scanner.nextInt();
//
//        int resultado = a / b;
//        System.out.println("Resultado: " + resultado);
//    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el divisor: ");
        double b = scanner.nextDouble();

        double resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }
}
