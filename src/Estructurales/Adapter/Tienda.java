public class Tienda {

    private final ProcesadorPagos procesador;

    public Tienda(ProcesadorPagos procesador){
        this.procesador = procesador;
    }

    public void vender(String producto, double precio){
        boolean ok = procesador.pagar(precio);
        System.out.println("Venta de " + producto + ": " + (ok ? "exitosa" : "fallida"));
    }
}
