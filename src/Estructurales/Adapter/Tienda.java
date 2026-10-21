// Tienda.java
// Cliente: contiene la logica de negocio y solo conoce ProcesadorPagos.
public class Tienda {

    private final ProcesadorPagos procesador;

    public Tienda(ProcesadorPagos procesador) {
        this.procesador = procesador;
    }

    public void vender(String producto, double precio) {
        boolean ok = procesador.pagar(precio);
        System.out.println("Venta de " + producto + ": " + (ok ? "exitosa" : "fallida"));
    }
}