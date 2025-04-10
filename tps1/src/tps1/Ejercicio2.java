/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tps1;

import java.util.Scanner;//para usar la funcion scanner

/**
 *
 * @author guadalupe villafañe
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        int promedio;
        
        System.out.print("Ingrese la nota 1: ");//solicita colocar la primera nota
        nota1 = notas.nextInt();//aca se introduce la nota por teclado
        System.out.print("Ingrese la nota 2: ");
        nota2 = notas.nextInt();
        System.out.print("Ingrese la nota 3: ");
        nota3 = notas.nextInt();
        
        promedio = (nota1 + nota2 + nota3)/ 3 ;//en esto se toman las tres notas pedidas y se las div por tres para sacar el promedio
        if(promedio >= 8){
            System.out.println("Esta promocionado");
        }else if(promedio <8){
            System.out.println("No esta promocionado");
        }
        notas.close();
        
        }
    }
    
/*}*/

