package Creacionales.FactoryMethod;

public class Barco implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por mar, en barco.");
    }
}