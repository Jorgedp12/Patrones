// App.java
public class App {
    public static void main(String[] args) {
        PasarelaLegada legada = new PasarelaLegada();
        ProcesadorPagos adaptador = new AdaptadorPasarelaLegada(legada);

        Tienda tienda = new Tienda(adaptador);   // la Tienda no sabe que hay una clase legada detras
        tienda.vender("Teclado", 85000.50);
    }
}
