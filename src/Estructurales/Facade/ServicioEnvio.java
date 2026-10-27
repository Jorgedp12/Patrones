package Estructurales.Facade;

// ServicioEnvio.java
public class ServicioEnvio {
    public String programar(String producto, String direccion) {
        System.out.println("[Envio] Programando " + producto + " hacia " + direccion);
        return "GUIA-1001";
    }
}
