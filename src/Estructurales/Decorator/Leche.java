package Estructurales.Decorator;

// Leche.java
// DECORADOR CONCRETO: agrega comportamiento antes o despues de delegar.
public class Leche extends AdicionBebida {

    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Leche";
    }

    @Override
    public double costo() {
        return super.costo() + 1000;
    }
}
