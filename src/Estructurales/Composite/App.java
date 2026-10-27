package Estructurales.Composite;

// App.java
public class App {
    public static void main(String[] args) {
        Carpeta raiz = new Carpeta("proyecto");
        Carpeta src = new Carpeta("src");
        Carpeta docs = new Carpeta("docs");

        src.agregar(new Archivo("App.java", 4));
        src.agregar(new Archivo("Pedido.java", 7));
        docs.agregar(new Archivo("manual.pdf", 1200));
        docs.agregar(new Archivo("logo.png", 300));

        raiz.agregar(src);
        raiz.agregar(docs);
        raiz.agregar(new Archivo("README.md", 2));

        // El cliente trata igual a una carpeta y a un archivo.
        raiz.mostrar("");
        System.out.println("Tamano de docs: " + docs.getTamano() + " KB");
        System.out.println("Tamano de README.md: " + new Archivo("README.md", 2).getTamano() + " KB");
    }
}
