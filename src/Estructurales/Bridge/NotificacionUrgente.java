package Estructurales.Bridge;

public class NotificacionUrgente extends Notificacion {

    public NotificacionUrgente(Canal canal){
        super(canal);
    }

    @Override 
    public void notificar(String destinatario, String mensaje){
        canal.enviar(destinatario, "[URGENTE] " + mensaje.toUpperCase());
    }
}
