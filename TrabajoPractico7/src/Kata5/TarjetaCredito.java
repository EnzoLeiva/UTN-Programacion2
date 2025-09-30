package Kata5;

public class TarjetaCredito implements Pagable {
    
    @Override
    public void pagar(double monto) {
        System.out.println("Pago con tarjeta de crédito: $" + monto);
    }
}
