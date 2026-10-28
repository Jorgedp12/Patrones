package Estructurales.Proxy;

// ImagenReal.java
// SERVICIO: crearlo es costoso porque carga el archivo completo en memoria.
public class ImagenReal implements Imagen {

    private final String archivo;

    public ImagenReal(String archivo) {
        this.archivo = archivo;
        System.out.println("  [Disco] Cargando " + archivo + " (operacion costosa)...");
    }

    @Override
    public void mostrar() {
        System.out.println("  Mostrando " + archivo);
    }
}
