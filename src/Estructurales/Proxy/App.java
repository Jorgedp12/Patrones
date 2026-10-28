package Estructurales.Proxy;

// App.java
public class App {
    public static void main(String[] args) {
        System.out.println("Creando galeria de 3 imagenes...");
        Imagen[] galeria = {
            new ImagenProxy("foto1.png"),
            new ImagenProxy("foto2.png"),
            new ImagenProxy("foto3.png")
        };
        System.out.println("Galeria lista (nada se ha cargado todavia).");

        System.out.println("Usuario abre la foto 2:");
        galeria[1].mostrar();

        System.out.println("Usuario vuelve a abrir la foto 2:");
        galeria[1].mostrar();
    }
}