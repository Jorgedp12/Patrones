package Creacionales.AbstractFactory;

public class BotonMac implements Boton {
    @Override
    public void renderizar() {
        System.out.println("Renderizando boton estilo macOS.");
    }
}
