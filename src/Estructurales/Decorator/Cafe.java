package Estructurales.Decorator;

// Cafe.java
// COMPONENTE CONCRETO: comportamiento basico que los decoradores pueden alterar.
public class Cafe implements Bebida {
    @Override
    public String descripcion() {
        return "Cafe";
    }

    @Override
    public double costo() {
        return 3000;
    }
}