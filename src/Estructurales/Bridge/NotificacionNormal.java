package Estructurales.Bridge;

public class NotificacionNormal extends Notificacion {

    public NotificacionNormal(Canal canal){
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canal.enviar(destinatario, mensaje);
    }
}
