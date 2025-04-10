package tps1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;

        System.out.print("Ingresar la nota: ");
        nota = teclado.nextInt();

        if(nota < 4){
            System.out.println("Desaprobado");
        } else if(nota >= 4 && nota < 10){
            System.out.println("Aprobado");
        } else if(nota == 10){
            System.out.println("Aprobado - Sobresaliente");
        } else {
            System.out.println("Nota inválida");
        }

        teclado.close();
    }
}
