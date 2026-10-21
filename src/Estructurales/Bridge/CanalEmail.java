package Estructurales.Bridge;

public class CanalEmail implements Canal{
    @Override
    public void enviar(String destinatario, String texto){
        System.out.println("[Email a " + destinatario + "] " + texto);
    }
}
