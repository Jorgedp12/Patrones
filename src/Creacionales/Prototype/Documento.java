package Creacionales.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Documento implements PrototipoDocumento {

    private String titulo;
    private String margenes;
    private List<String> secciones;

    public Documento(String titulo, String margenes) {
        this.titulo = titulo;
        this.margenes = margenes;
        this.secciones = new ArrayList<>();
    }

    public void agregarSeccion(String seccion) {
        secciones.add(seccion);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Constructor de copia: usado internamente por clonar().
    private Documento(Documento original) {
        this.titulo = original.titulo;
        this.margenes = original.margenes;
        // Copia PROFUNDA de la lista: si copiaramos la referencia,
        // ambos documentos terminarian compartiendo la misma lista de secciones.
        this.secciones = new ArrayList<>(original.secciones);
    }

    @Override
    public Documento clonar() {
        return new Documento(this);
    }

    public void mostrar() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Margenes: " + margenes);
        System.out.println("Secciones: " + secciones);
    }
}