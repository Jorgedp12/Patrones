package Estructurales.Bridge;

public class CanalSms implements Canal {
    @Override 
    public void enviar(String destinatario, String texto){
        System.out.println("[SMS a " + destinatario + "] " + texto);
    }
}
