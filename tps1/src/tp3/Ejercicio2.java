/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author churo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inversionInicial = 10000 ;
        double interes = 0.06 ;
        int años = 3 ;
        
        
        double valorFuturo = inversionInicial* Math.pow(1+interes,3);
        System.out.println("Valor a futuro de la inversion "+ valorFuturo);
        System.out.println("Valor redondeado " + Math.round(valorFuturo));
        
                
    }
    
}
