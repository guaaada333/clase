package tp4;
import java.util.Arrays;
import java.util.Scanner;

public class sistema3 {
     Scanner entrada = new Scanner(System.in); 

    // Método para llenar el arreglo
    public String[] ponerArreglo() {
        System.out.println("Cuántos elementos tendrá el arreglo:");
        int cantidad = entrada.nextInt();
        entrada.nextLine(); 

        String[] M = new String[cantidad];

        for (int i = 0; i < M.length; i++) {
            System.out.print("Ingrese elemento :");
            M[i] = entrada.nextLine();
        }

        // Ordenamos el arreglo alfabéticamente
        Arrays.sort(M);
        return M;
    }

    // Método para buscar una cadena
    public void buscarElemento(String[] M) {
        System.out.print("Ingrese una cadena para buscar en el arreglo: ");
        String buscar = entrada.nextLine();

        int posicion = Arrays.binarySearch(M, buscar);

        if (posicion >= 0) {
            System.out.println("Cadena encontrada en la posición: " + posicion);
        } else {
            System.out.println("Cadena no encontrada en el arreglo.");
        }
    }

    // Método para mostrar el arreglo
    public void mostrarArreglo(String[] M) {
        System.out.println("Contenido del arreglo:");
        for (String elemento : M) {
            System.out.println(elemento);
        }
    }
}
