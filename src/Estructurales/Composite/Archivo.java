package Estructurales.Composite;

public class Archivo implements ElementoArchivo{
    private final String nombre; 
    private final long tamanoKb;

    public Archivo(String nombre, long tamanoKb){
        this.nombre = nombre;
        this.tamanoKb = tamanoKb;
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public long getTamano(){
        return tamanoKb;
    }

    @Override 
    public void mostrar(String sangria){
        System.out.println(sangria + nombre + " (" + tamanoKb + " KB");
    }
}   
