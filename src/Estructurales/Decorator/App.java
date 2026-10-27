package Estructurales.Decorator;

// App.java
public class App {
    public static void main(String[] args) {
        Bebida simple = new Cafe();
        mostrar(simple);

        // Las capas se apilan en tiempo de ejecucion, en cualquier combinacion y cantidad.
        Bebida especial = new Crema(new Leche(new Leche(new Cafe())));
        mostrar(especial);

        Bebida dulce = new Azucar(new Azucar(new Cafe()));
        mostrar(dulce);
    }

    private static void mostrar(Bebida b) {
        System.out.println(b.descripcion() + " = $" + (long) b.costo());
    }
}