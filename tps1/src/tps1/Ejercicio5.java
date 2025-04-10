/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tps1;
import java.util.Scanner;
/**
 *
 * @author Guadalupe Villafañe
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner plano = new Scanner(System.in);
        int x ;
        int y ;
        
        System.out.print("Ingresar coordenada del eje x debe ser distinto de 0 : ");
        x = plano.nextInt() ;
         System.out.print("Ingresar coordenada del eje y debe ser distinto de 0 : ");
        y = plano.nextInt() ;
        
        if(x == 0 || y == 0){//si x=0 y y=0 mostrara un error 
    System.out.println("ERROR: Las coordenadas deben ser distintas de 0");
        }else if(x>0 && y>0){
        System.out.println("Estas en el primer cuadrante");
    }else if(x<0 && y>0){
        System.out.println("Estas en el segundo cuadrante");
    }else if(x<0 && y<0){
        System.out.println("Estas en el tercer cuadrante");
    }else{
        System.out.println("Estas en el cuarto cuadrante");
    }
        plano.close();
    }
    }
    

