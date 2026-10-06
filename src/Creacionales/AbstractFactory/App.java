package Creacionales.AbstractFactory;

public class App {

    // El cliente solo conoce FabricaUI: nunca sabe si esta usando
    // componentes de Windows o de Mac.
    private static void construirInterfaz(FabricaUI fabrica) {
        Boton boton = fabrica.crearBoton();
        Checkbox checkbox = fabrica.crearCheckbox();
        boton.renderizar();
        checkbox.renderizar();
    }

    public static void main(String[] args) {
        String sistemaOperativo = "Windows"; // esto normalmente vendria detectado en tiempo de ejecucion

        FabricaUI fabrica = sistemaOperativo.equals("Windows")
                ? new FabricaWindows()
                : new FabricaMac();

        construirInterfaz(fabrica);
    }
}
