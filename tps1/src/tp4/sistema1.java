package tp4;

import java.util.Scanner;

/**
 *
 * @author churo
 */
public class sistema1 {
    
    public int [] ponerArreglo(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Cuantos elementos tendra el arreglo :");
    int cantidad = entrada.nextInt();
    int A[]= new int[cantidad];
    
    for(int i=0 ; i<A.length ; i++){
            System.out.println("Ingrese elemento:");
            A[i]=entrada.nextInt();
    }return A ; 
    }
    
     public int Suma(int A[]){
      int suma = 0;
      for(int i=0 ; i<A.length ;i++){
          suma += A[i] ;
          System.out.println(" ");
          

      }  return suma ;
     }
     
    public int encontrarMayor(int[] arr) {
        int mayor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > mayor) {
                mayor = arr[i];
            }
        }
        return mayor;
    }

    public int encontrarMenor(int[] arr) {
        int menor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
            }
        }
        return menor;
    }
    
    public void mostrar(int A[]){
        for(int i=0 ; i<A.length ; i++){
            System.out.println("El arreglo es "+ A[i]);
        }
    }

    
public void bubbleSort(int[] A) {
    int n = A.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (A[j] > A[j + 1]) {
                // Intercambia A[j] y arr[j+1]
                int temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
            }
        }
    }
}

    }
    
    

    
    
    
    

