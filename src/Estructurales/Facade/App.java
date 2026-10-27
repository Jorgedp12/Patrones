package Estructurales.Facade;

// App.java
public class App {
    public static void main(String[] args) {
        // El cliente usa UNA llamada en lugar de coordinar cuatro servicios.
        TiendaFachada tienda = new TiendaFachada();

        System.out.println("-- Compra normal --");
        tienda.comprar("Ana", "Monitor", 750000, "Cra 7 # 45-10");

        System.out.println("-- Compra rechazada --");
        tienda.comprar("Luis", "Portatil", 3500000, "Calle 80 # 20-5");
    }
}
