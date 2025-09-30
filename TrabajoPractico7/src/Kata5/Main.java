package Kata5;

public class Main {
    public static void procesarPago(Pagable medio, double monto) {
        medio.pagar(monto);
    }

    public static void main(String[] args) {
        procesarPago(new TarjetaCredito(), 500);
        procesarPago(new Transferencia(), 600);
        procesarPago(new Efectivo(), 700);
    }
}
