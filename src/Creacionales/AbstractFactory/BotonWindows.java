package Creacionales.AbstractFactory;

public class BotonWindows implements Boton {
    @Override
    public void renderizar() {
        System.out.println("Renderizando boton estilo Windows.");
    }
}
