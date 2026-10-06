package Creacionales.AbstractFactory;

public class FabricaMac implements FabricaUI {
    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new CheckboxMac();
    }
}
