public class PasarelaLegada {
   
    public String realizarTransaccion(long centavos, String codigoMoneda){
        System.out.println("[Legada] Cobrando " + centavos + " centavos en " + codigoMoneda);
        return "OK-" + centavos;
    }
}
