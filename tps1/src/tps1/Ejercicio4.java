/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tps1;
import java.util.Scanner ;

/**
 *
 * @author guadalupe villafañe
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner trimestres = new Scanner(System.in);
        int dia;
        int mes;
        int año;
        
        System.out.print("Dia : ");
        dia = trimestres.nextInt();
        System.out.print("Mes : ");
        mes = trimestres.nextInt();
        System.out.print("Año : ");
        año = trimestres.nextInt();
        
        if(mes<=3){
            System.out.println("Corresponde al primer trimestre del año");
        }else if(mes<=6){
            System.out.println("Corresponde al segundo trimestre del año ");
        }else if(mes<=9){
            System.out.println("Corresponde al tercer trimestre del año ");
        }else{
            System.out.println("Corresponde al cuarto trimstre del año ");
        }
        trimestres.close();
        }
        
        
    }
    
