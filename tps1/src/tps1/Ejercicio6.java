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
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner triangulos = new Scanner(System.in);
        int n; // cantidad de triángulos a ingresar
        int lado1, lado2, lado3;
        int ContEquilatero = 0;
        int ContIsosceles = 0;
        int ContEscaleno = 0;

        System.out.print("INGRESAR CANTIDAD DE TRIANGULOS: ");
        n = triangulos.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Triángulo " + i);
            System.out.print("Ingresar lado 1: ");
            lado1 = triangulos.nextInt();
            System.out.print("Ingresar lado 2: ");
            lado2 = triangulos.nextInt();
            System.out.print("Ingresar lado 3: ");
            lado3 = triangulos.nextInt();

            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("Es un triángulo equilátero");
                ContEquilatero++;
            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Es un triángulo isósceles");
                ContIsosceles++;
            }else{
                System.out.println("Es un triángulo escaleno");
                ContEscaleno++;
            }
        }

        // Mostrar la cantidad de cada tipo
        System.out.println("\nCantidad de triángulos equiláteros: " + ContEquilatero);
        System.out.println("Cantidad de triángulos isósceles: " + ContIsosceles);
        System.out.println("Cantidad de triángulos escalenos: " + ContEscaleno);

        // Ver cuál tiene menor cantidad
        if(ContEquilatero <= ContIsosceles && ContEquilatero <= ContEscaleno){
            System.out.println("El tipo de triángulo con menor cantidad es: Equilátero");
        }else if(ContIsosceles <= ContEquilatero && ContIsosceles <= ContEscaleno){
            System.out.println("El tipo de triángulo con menor cantidad es: Isósceles");
        }else{
            System.out.println("El tipo de triángulo con menor cantidad es: Escaleno");
        }

        triangulos.close();
    }
}
