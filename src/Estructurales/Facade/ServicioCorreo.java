package Estructurales.Facade;

// ServicioCorreo.java
public class ServicioCorreo {
    public void enviar(String cliente, String texto) {
        System.out.println("[Correo] Para " + cliente + ": " + texto);
    }
}
