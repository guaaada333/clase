package tp4.SISTEMAS;
import java.util.ArrayList;
import java.util.Collections;
import tp4.Producto2;

/**
 *
 * @author churo
 */
public class MainProducto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Producto2> lista = new ArrayList<>();

        lista.add(new Producto2("Pan", 200, true));
        lista.add(new Producto2("Leche", 500, true));
        lista.add(new Producto2("Queso", 300, false));

        Collections.sort(lista, new Producto2.comparadorPorNombre());

        // Mostrar productos ordenados por nombre
        for (Producto2 p : lista) {
            System.out.println(p);
        }
    }
}
        
    
    
    

