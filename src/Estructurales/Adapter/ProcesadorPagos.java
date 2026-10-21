// ProcesadorPagos.java
// Interfaz que el codigo cliente (Tienda) ya conoce y usa.
public interface ProcesadorPagos {
    boolean pagar(double montoPesos);
}