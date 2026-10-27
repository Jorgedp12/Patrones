package Estructurales.Facade;

// ServicioPago.java
public class ServicioPago {
    public boolean cobrar(String cliente, double monto) {
        System.out.println("[Pago] Cobrando $" + (long) monto + " a " + cliente);
        return monto <= 1000000;
    }
}
