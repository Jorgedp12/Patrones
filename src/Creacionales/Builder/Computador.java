package Creacionales.Builder;

public class Computador {

    private final String procesador;
    private final int ramGB;
    private final int almacenamientoGB;
    private final String tarjetaGrafica; // puede ser null si no tiene

    // El constructor es privado: solo el Builder puede construir un Computador.
    private Computador(ComputadorBuilder builder) {
        this.procesador = builder.procesador;
        this.ramGB = builder.ramGB;
        this.almacenamientoGB = builder.almacenamientoGB;
        this.tarjetaGrafica = builder.tarjetaGrafica;
    }

    public void mostrarEspecificaciones() {
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Almacenamiento: " + almacenamientoGB + " GB");
        System.out.println("Tarjeta grafica: " + (tarjetaGrafica != null ? tarjetaGrafica : "integrada"));
    }

    // El Builder vive como clase estatica interna: agrupa la construccion
    // junto a la clase que construye.
    public static class ComputadorBuilder {
        private String procesador;
        private int ramGB;
        private int almacenamientoGB;
        private String tarjetaGrafica;

        public ComputadorBuilder conProcesador(String procesador) {
            this.procesador = procesador;
            return this;
        }

        public ComputadorBuilder conRAM(int ramGB) {
            this.ramGB = ramGB;
            return this;
        }

        public ComputadorBuilder conAlmacenamiento(int almacenamientoGB) {
            this.almacenamientoGB = almacenamientoGB;
            return this;
        }

        public ComputadorBuilder conTarjetaGrafica(String tarjetaGrafica) {
            this.tarjetaGrafica = tarjetaGrafica;
            return this;
        }

        public Computador construir() {
            return new Computador(this);
        }
    }
}
