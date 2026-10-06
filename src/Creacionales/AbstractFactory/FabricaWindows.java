package Creacionales.AbstractFactory;

public class FabricaWindows implements FabricaUI {
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new CheckboxWindows();
    }
}
