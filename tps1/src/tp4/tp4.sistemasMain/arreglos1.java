package tp4.SISTEMAS;
import tp4.sistema1;  


public class arreglos1 {
    public static void main(String[] args) {
        sistema1 sistema = new sistema1();

        int[] miArreglo = sistema.ponerArreglo();  // No se pasa Scanner

        System.out.println("\nArreglo ingresado:");
        sistema.mostrar(miArreglo);

        System.out.println("Suma: " + sistema.Suma(miArreglo));
        System.out.println("Mayor: " + sistema.encontrarMayor(miArreglo));
        System.out.println("Menor: " + sistema.encontrarMenor(miArreglo));

        sistema.bubbleSort(miArreglo);
        System.out.println("\nArreglo ordenado:");
        sistema.mostrar(miArreglo);
    }
}
