package tps2.SistemasDeTp2;

 
import tps2.Libro ;

public class sistema4 {
    public static void main(String[] args) {
        // Crear instancias de la clase Libro
        Libro libro1 = new Libro("1984", "George Orwell", "1234567890", true);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "0987654321", true);

        // Mostrar los detalles de los libros
        System.out.println("Datos del libro 1:");
        libro1.mostrardatos();
        System.out.println();
        
        System.out.println("Datos del libro 2:");
        libro2.mostrardatos();
        System.out.println();

        // Probar la funcionalidad de prestar libros
        System.out.println("Intentando prestar el libro 1...");
        libro1.prestar();  // El libro 1 se prestará
        libro1.mostrardatos();
        System.out.println();

        // Intentar prestar el libro 1 nuevamente
        System.out.println("Intentando prestar nuevamente el libro 1...");
        libro1.prestar();  // El libro 1 ya no está disponible
        libro1.mostrardatos();
        System.out.println();

        // Devolver el libro 1
        System.out.println("Devolviendo el libro 1...");
        libro1.devolver();
        libro1.mostrardatos();
        System.out.println();

        // Prestar el libro 2
        System.out.println("Prestando el libro 2...");
        libro2.prestar();  // El libro 2 se prestará
        libro2.mostrardatos();
    }
}