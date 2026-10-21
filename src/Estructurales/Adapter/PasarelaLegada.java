// PasarelaLegada.java
// Clase de un tercero (o heredada). No podemos modificarla.
// Su interfaz es incompatible: trabaja en centavos y exige el codigo de moneda.
public class PasarelaLegada {

    public String realizarTransaccion(long centavos, String codigoMoneda) {
        System.out.println("[Legada] Cobrando " + centavos + " centavos en " + codigoMoneda);
        return "OK-" + centavos;
    }
}