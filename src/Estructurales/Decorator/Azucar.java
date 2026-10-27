package Estructurales.Decorator;

// Azucar.java
public class Azucar extends AdicionBebida {

    public Azucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Azucar";
    }

    @Override
    public double costo() {
        return super.costo() + 500;
    }
}
