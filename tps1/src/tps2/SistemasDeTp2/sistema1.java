package tps2.SistemasDeTp2;


import tps2.Calculadora;


public class sistema1 {
    
    public static void main(String[] args) {
        Calculadora calculo = new Calculadora();

        System.out.println("Suma: " + calculo.sumar(10, 5));
        System.out.println("Resta: " + calculo.restar(10, 5));
        System.out.println("Multiplicación: " + calculo.multiplicar(10, 5));
        System.out.println("División: " + calculo.dividir(10, 5));
    }
}

