/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema1;

import java.util.Scanner;

/**
 *
 * @author churo
 */

public class Sistema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int nota; 
        
        for(int i=0 ; i<1 ; i++){
        System.out.print("Ingrese la nota : ");
        nota = scanner.nextInt();
        if(nota ==10){
            System.out.print("Tiene sobresaliente");
        }else if(nota>=4){
            System.out.print("Esta aprobado ");
        }else if(nota<4){
            System.out.print("Esta desaprobado ");
        }
        }
        
        }
        
        
        
    }
    
}
