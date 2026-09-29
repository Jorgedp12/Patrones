package Creacionales.Singleton;

// App.java
public class App {
    public static void main(String[] args) {

        ConfiguracionApp config1 = ConfiguracionApp.obtenerInstancia();
        config1.setModoOscuro(true);
        
        // Desde otro punto del programa, totalmente distinto:
        ConfiguracionApp config2 = ConfiguracionApp.obtenerInstancia();

        System.out.println("¿config1 y config2 son el mismo objeto? " + (config1 == config2));
        System.out.println("Modo oscuro visto desde config2: " + config2.isModoOscuro());
    }
}