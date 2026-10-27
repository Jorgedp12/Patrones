package Estructurales.Decorator;

// Crema.java
public class Crema extends AdicionBebida {

    public Crema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Crema";
    }

    @Override
    public double costo() {
        return super.costo() + 1500;
    }
}
