package Estructurales.Flyweight;

public class TipoArbol {

    private final String nombre;
    private final String color;
    private final String textura;

    public TipoArbol(String nombre, String color, String textura){
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
    }

    public void dibujar(int x, int y){
        System.out.println("Dibujando " + nombre + " (" + color + ", " + textura + ") en (" + x + "," + y + ")");
    }
}
