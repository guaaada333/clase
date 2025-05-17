package tp4.SISTEMAS;
import tp4.Producto;
import java.util.ArrayList;
import java.util.Collections;

public class MainProducto{
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Pan", 200, true));
        productos.add(new Producto("Leche", 500, true));
        productos.add(new Producto("Queso", 300, false));

        System.out.println("Antes de ordenar:");
        for (Producto p : productos) {
            System.out.println(p);
        }

        Collections.sort(productos);  // Usa compareTo

        System.out.println("\nDespués de ordenar por precio (menor a mayor):");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

