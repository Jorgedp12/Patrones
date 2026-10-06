package Creacionales.FactoryMethod;

public abstract class Logistica {

    public abstract Transporte crearTransporte();

    public void planificarEntrega() {
        Transporte transporte = crearTransporte();
        System.out.println("Planificando entrega...");
        transporte.entregar();
    }
}
