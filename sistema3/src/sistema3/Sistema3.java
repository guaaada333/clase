/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema3;
import java.util.Scanner;
/**
 *
 * @author guadalupe villafañe
 */
public class Sistema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner digitos = new Scanner(System.in);
        int numero;
        
        System.out.print("Ingrese un numero positivo: ");
        numero = digitos.nextInt() ;
        if(numero<10){
            System.out.println("El numero ingresado tiene un solo digito");
        }else if(numero>=10){
            System.out.println("El numero ingresado tiene mas de un digito");
        }
        digitos.close();
        }
        
        
    }
    

