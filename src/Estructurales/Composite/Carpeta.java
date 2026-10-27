package Estructurales.Composite;

// Carpeta.java
import java.util.ArrayList;
import java.util.List;

// CONTENEDOR (compuesto): guarda hijos que pueden ser archivos u otras carpetas.
// Solo los conoce a traves de la interfaz ElementoArchivo.
public class Carpeta implements ElementoArchivo {

    private final String nombre;
    private final List<ElementoArchivo> hijos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ElementoArchivo elemento) {
        hijos.add(elemento);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    // Delega en los hijos y suma los resultados (recursion implicita).
    @Override
    public long getTamano() {
        long total = 0;
        for (ElementoArchivo hijo : hijos) {
            total += hijo.getTamano();
        }
        return total;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + nombre + "/ (" + getTamano() + " KB)");
        for (ElementoArchivo hijo : hijos) {
            hijo.mostrar(sangria + "  ");
        }
    }
}