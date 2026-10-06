package Creacionales.Prototype;

public class App {
    public static void main(String[] args) {

        Documento plantillaInforme = new Documento("Informe mensual", "2.5 cm");
        plantillaInforme.agregarSeccion("Introduccion");
        plantillaInforme.agregarSeccion("Resultados");
        plantillaInforme.agregarSeccion("Conclusiones");

        // Clonamos la plantilla en lugar de reconstruirla desde cero.
        Documento informeSeptiembre = plantillaInforme.clonar();
        informeSeptiembre.setTitulo("Informe septiembre 2026");
        informeSeptiembre.agregarSeccion("Anexos");

        System.out.println("--- Plantilla original ---");
        plantillaInforme.mostrar();

        System.out.println("\n--- Copia modificada ---");
        informeSeptiembre.mostrar();
    }
}
