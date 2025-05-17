package tp4;
import java.util.Arrays;

/**
 *
 * @author churo
 */
public class sistema2 {
 int arr[];
     
//muestra en pantalla
public  void mostrar(int arr[]){
    for(int i=0 ; i<arr.length ; i++){
      System.out.print( arr[i] + " ");
      System.out.println();
      System.out.println();
        
    }
}
//acomoda el arreglo
public  void bubbleSort(int[] arr) {
 int n = arr.length;
 for (int i = 0; i < n - 1; i++) {
 for (int j = 0; j < n - i - 1; j++) {
 if (arr[j] > arr[j + 1]) {
 // Intercambia arr[j] y arr[j+1]
 int temp = arr[j];
 arr[j] = arr[j + 1];
 arr[j + 1] = temp;
 }
 }
 }
}

    
}


