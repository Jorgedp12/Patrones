public class AdaptadorPasarelaLegada {

        private final PasarelaLegada legada;
        
        public AdaptadorPasarelaLegada(PasarelaLegada legada){
            this.legada = legada;
        }

        public boolean pagar(double montoPesos){
            long centavos = Math.round(montoPesos * 100);
            String respuesta = legada.realizarTransaccion(centavos,"COP");
            return respuesta.startsWith("OK");
        }
}
