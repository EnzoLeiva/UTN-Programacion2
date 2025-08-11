package trabajopractico2;

import java.util.Scanner;

public class TrabajoPractico2 {

    static Scanner sc = new Scanner(System.in);
    static double descuentoEspecial = 0.10;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- TRABAJO PRÁCTICO 2 ---");
            System.out.println("1. Año Bisiesto");
            System.out.println("2. Mayor de Tres Números");
            System.out.println("3. Clasificación de Edad");
            System.out.println("4. Calculadora de Descuento según Categoría");
            System.out.println("5. Suma de Números Pares");
            System.out.println("6. Contador de Positivos, Negativos y Ceros");
            System.out.println("7. Validación de Nota");
            System.out.println("8. Precio Final con impuesto y descuento");
            System.out.println("9. Costo de envío y total de compra");
            System.out.println("10. Actualización de stock");
            System.out.println("11. Descuento especial");
            System.out.println("12. Array de precios y modificación");
            System.out.println("13. Impresión recursiva de array");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // 1. Verificación de Año Bisiesto
    static void ejercicio1() {
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    // 2. Mayor de tres números
    static void ejercicio2() {
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El mayor es: " + mayor);
    }

    // 3. Clasificación de Edad
    static void ejercicio3() {
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }

    // 4. Calculadora de Descuento según Categoría
    static void ejercicio4() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0);
        double descuento = switch (categoria) {
            case 'A' -> 0.10;
            case 'B' -> 0.15;
            case 'C' -> 0.20;
            default -> 0;
        };
        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    // 5. Suma de Números Pares (while)
    static void ejercicio5() {
        int num, suma = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = sc.nextInt();
            if (num % 2 == 0 && num != 0) {
                suma += num;
            }
        } while (num != 0);
        System.out.println("La suma de los números pares es: " + suma);
    }

    // 6. Contador de Positivos, Negativos y Ceros (for)
    static void ejercicio6() {
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = sc.nextInt();
            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else ceros++;
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    // 7. Validación de Nota (do-while)
    static void ejercicio7() {
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }

    // 8. Precio Final con impuesto y descuento
    static void ejercicio8() {
        System.out.print("Ingrese el precio base del producto: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el impuesto en %: ");
        double impuesto = sc.nextDouble() / 100;
        System.out.print("Ingrese el descuento en %: ");
        double descuento = sc.nextDouble() / 100;
        double finalPrecio = calcularPrecioFinal(base, impuesto, descuento);
        System.out.println("El precio final del producto es: " + finalPrecio);
    }
    static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        return base + (base * impuesto) - (base * descuento);
    }

    // 9. Costo de envío y total de compra
    static void ejercicio9() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.next();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, costoEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
    static double calcularCostoEnvio(double peso, String zona) {
        return zona.equalsIgnoreCase("Nacional") ? peso * 5 : peso * 10;
    }
    static double calcularTotalCompra(double precio, double envio) {
        return precio + envio;
    }

    // 10. Actualización de stock
    static void ejercicio10() {
        System.out.print("Ingrese el stock actual del producto: ");
        int stock = sc.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = sc.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = sc.nextInt();
        int nuevoStock = actualizarStock(stock, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    static int actualizarStock(int actual, int vendida, int recibida) {
        return actual - vendida + recibida;
    }

    // 11. Descuento especial con variable global
    static void ejercicio11() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        double descuentoAplicado = precio * descuentoEspecial;
        double finalPrecio = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + finalPrecio);
    }

    // 12. Array de precios y modificación
    static void ejercicio12() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (double p : precios) System.out.println("Precio: $" + p);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        for (double p : precios) System.out.println("Precio: $" + p);
    }

    // 13. Impresión recursiva de array
    static void ejercicio13() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }
    static void imprimirArrayRecursivo(double[] arr, int index) {
        if (index < arr.length) {
            System.out.println("Precio: $" + arr[index]);
            imprimirArrayRecursivo(arr, index + 1);
        }
    }
}

