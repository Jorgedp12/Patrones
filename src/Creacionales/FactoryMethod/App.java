package Creacionales.FactoryMethod;

public class App {
    public static void main(String[] args) {

        Logistica logisticaTerrestre = new LogisticaTerrestre();
        logisticaTerrestre.planificarEntrega();

        System.out.println();

        // Agregar transporte maritimo NO modifico Logistica, Camion, ni el codigo anterior.
        Logistica logisticaMaritima = new LogisticaMaritima();
        logisticaMaritima.planificarEntrega();
    }
}
