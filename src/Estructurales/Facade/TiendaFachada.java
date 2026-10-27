package Estructurales.Facade;

// TiendaFachada.java
// FACHADA: ofrece una operacion simple que sabe en que orden usar cada pieza del subsistema.
public class TiendaFachada {

    private final Inventario inventario = new Inventario();
    private final ServicioPago pago = new ServicioPago();
    private final ServicioEnvio envio = new ServicioEnvio();
    private final ServicioCorreo correo = new ServicioCorreo();

    public boolean comprar(String cliente, String producto, double precio, String direccion) {
        if (!inventario.hayStock(producto)) {
            correo.enviar(cliente, "Producto agotado");
            return false;
        }
        if (!pago.cobrar(cliente, precio)) {
            correo.enviar(cliente, "Pago rechazado");
            return false;
        }
        inventario.reservar(producto);
        String guia = envio.programar(producto, direccion);
        correo.enviar(cliente, "Compra exitosa. Guia " + guia);
        return true;
    }
}
