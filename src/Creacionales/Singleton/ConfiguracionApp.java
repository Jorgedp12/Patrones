package Creacionales.Singleton;

// ConfiguracionApp.java
public class ConfiguracionApp {

    // La única instancia existente. Empieza en null: todavía no se ha creado.
    private static ConfiguracionApp instancia;

    private boolean modoOscuro;
    private String idiomaPredeterminado;

    // El constructor es privado: nadie fuera de esta clase puede hacer "new".
    private ConfiguracionApp() {
        this.modoOscuro = false;
        this.idiomaPredeterminado = "es";
        System.out.println("Creando la unica instancia de ConfiguracionApp...");
    }

    // Punto de acceso global. La instancia se crea la PRIMERA VEZ que se pide.
    public static ConfiguracionApp obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionApp();
        }
        return instancia;
    }

    public boolean isModoOscuro() {
        return modoOscuro;
    }

    public void setModoOscuro(boolean modoOscuro) {
        this.modoOscuro = modoOscuro;
    }

    public String getIdiomaPredeterminado() {
        return idiomaPredeterminado;
    }
}
