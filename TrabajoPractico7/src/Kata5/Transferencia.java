package Kata5;

public class Transferencia implements Pagable {
    
    @Override
    public void pagar(double monto) {
        System.out.println("Pago con transferencia bancaria: $" + monto);
    }   
}
