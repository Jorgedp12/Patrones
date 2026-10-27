package Estructurales.Decorator;

// AdicionBebida.java
// DECORADOR BASE: envuelve otra Bebida y por defecto le delega todo.
public abstract class AdicionBebida implements Bebida {

    protected final Bebida bebida;

    protected AdicionBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion();
    }

    @Override
    public double costo() {
        return bebida.costo();
    }
}
