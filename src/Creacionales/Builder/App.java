package Creacionales.Builder;

public class App {
    public static void main(String[] args) {

        // Cada llamada se lee como una frase: queda claro que representa cada valor.
        Computador computadorGamer = new Computador.ComputadorBuilder()
                .conProcesador("Intel i7")
                .conRAM(16)
                .conAlmacenamiento(512)
                .conTarjetaGrafica("RTX 4060")
                .construir();

        Computador computadorOficina = new Computador.ComputadorBuilder()
                .conProcesador("Intel i3")
                .conRAM(8)
                .conAlmacenamiento(256)
                .construir(); // sin tarjeta grafica: se omite ese metodo

        computadorGamer.mostrarEspecificaciones();
        System.out.println();
        computadorOficina.mostrarEspecificaciones();
    }
}