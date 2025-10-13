package ecommerce;

public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Enzo", "enzo@gmail.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Auriculares", 15000));
        pedido.agregarProducto(new Producto("Mouse gamer", 12000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        pedido.cambiarEstado("Pagado");

        PagoConDescuento pago = new TarjetaCredito("Enzo");
        pago.aplicarDescuento(10);
        pago.procesarPago(pedido.calcularTotal() * 0.9);
    }
}
