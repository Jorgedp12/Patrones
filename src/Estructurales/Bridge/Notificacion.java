package Estructurales.Bridge;

public abstract class Notificacion {

    protected final Canal canal;

    protected Notificacion(Canal canal){
        this.canal = canal;
    }

    public abstract void notificar(String destinatario, String mensaje);
}
