// AdaptadorPasarelaLegada.java
// Adaptador: implementa la interfaz que espera el cliente
// y por dentro traduce cada llamada al formato de la clase legada.
public class AdaptadorPasarelaLegada implements ProcesadorPagos {

    private final PasarelaLegada legada;

    public AdaptadorPasarelaLegada(PasarelaLegada legada) {
        this.legada = legada;
    }

    @Override
    public boolean pagar(double montoPesos) {
        long centavos = Math.round(montoPesos * 100);              // pesos -> centavos
        String respuesta = legada.realizarTransaccion(centavos, "COP");
        return respuesta.startsWith("OK");                          // texto -> boolean
    }
}