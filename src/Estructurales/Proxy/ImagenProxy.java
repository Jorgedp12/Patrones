package Estructurales.Proxy;

// ImagenProxy.java
// PROXY (carga diferida): controla el acceso y crea el servicio real solo cuando hace falta.
public class ImagenProxy implements Imagen {

    private final String archivo;
    private ImagenReal real;          // null hasta que alguien pida mostrar()

    public ImagenProxy(String archivo) {
        this.archivo = archivo;       // crear el proxy es barato: no toca el disco
    }

    @Override
    public void mostrar() {
        if (real == null) {
            real = new ImagenReal(archivo);   // primera vez: se crea el servicio
        }
        real.mostrar();                       // despues delega la solicitud
    }
}
