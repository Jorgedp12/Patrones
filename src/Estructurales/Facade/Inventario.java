package Estructurales.Facade;

// Inventario.java
// --- Subsistema complejo: estas clases no conocen la fachada ---
public class Inventario {
    public boolean hayStock(String producto) {
        System.out.println("[Inventario] Verificando stock de " + producto);
        return true;
    }

    public void reservar(String producto) {
        System.out.println("[Inventario] Reservando " + producto);
    }
}
