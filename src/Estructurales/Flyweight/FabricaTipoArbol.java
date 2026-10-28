package Estructurales.Flyweight;
import java.util.HashMap;
import java.util.Map;

public class FabricaTipoArbol {
    private static final Map<String, TipoArbol> cache = new HashMap<>();

    public static TipoArbol obtener(String nombre, String color, String textura){
        String clave = nombre + "|" + color + "|" + textura;
        TipoArbol tipo = cache.get(clave);
        if (tipo == null){
            tipo = new TipoArbol(nombre, color, textura);
            cache.put(clave, tipo);
        }
        return tipo;
    }

    public static int cantidadTipos(){
        return cache.size();
    }
}
