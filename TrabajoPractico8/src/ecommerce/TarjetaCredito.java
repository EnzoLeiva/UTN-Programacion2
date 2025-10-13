package ecommerce;

public class TarjetaCredito implements PagoConDescuento {
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito de " + titular + " por $" + monto);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento del " + porcentaje + "% con tarjeta de crédito");
        return porcentaje;
    }
}
