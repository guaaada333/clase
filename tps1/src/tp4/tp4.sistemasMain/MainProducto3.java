package tp4.SISTEMAS;
import java.util.ArrayList;
import java.util.Collections;
import tp4.Producto3;

/**
 *
 * @author churo
 */
public class MainProducto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Producto3> lista = new ArrayList<>();

        lista.add(new Producto3("Pan", 200, true));
        lista.add(new Producto3("Leche", 500, true));
        lista.add(new Producto3("Queso", 300, false));

        Collections.sort(lista, new Producto3.comparadorPorEstado());

        // Mostrar productos ordenados por nombre
        for (Producto3 p : lista) {
            System.out.println(p);
        }
    }
}
    