public class App {
    public static void main(String[] args){
        PasarelaLegada legada = new PasarelaLegada();
        ProcesadorPagos adaptador = (ProcesadorPagos) new AdaptadorPasarelaLegada(legada);

        Tienda tienda = new Tienda(adaptador);
        tienda.vender("Teclado", 85000.50);
    }
}
