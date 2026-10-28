package Estructurales.Flyweight;

public class App {
    public static void main(String[] args){
        Bosque bosque = new Bosque();

        for (int i = 0; i < 10000; i++){
            switch (i % 3) {
                case 0 -> bosque.plantar(i, i * 2, "Roble", "verde", "textura-roble.png");
                case 1 -> bosque.plantar(i, i*2, "Pino", "verde oscuro", "textura-pino.png");
            
                default -> bosque.plantar(i, i*2, "Abedul", "blanco", "textura-abedul.png");
            }
        }

        System.out.println("Arboles en el bosque: " + bosque.getArboles().size());
        System.out.println("Objetos TipoArbol (flyweights): " + FabricaTipoArbol.cantidadTipos());
        
        Arbol a0 = bosque.getArboles().get(0);
        Arbol a3 = bosque.getArboles().get(3);
        System.out.println("Arbol 0 y arbol 3 comparten el mismo tipo: " + (a0.getTipo() == a3.getTipo()));

        a0.dibujar();
        a3.dibujar();
    }
}
