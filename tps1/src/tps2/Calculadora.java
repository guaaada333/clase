package tps2;

/**
 *
 * @author guada 
 */
public class Calculadora {
    public double sumar(double a , double b){
        return a + b ;
    }
    public double restar(double a , double b){
        return a - b ;
    }
    public double dividir(double a , double b){
       if(b !=0){
       return a / b ;
        } else {
                System.out.println("No se puede dividir en 0");
                return 0;
                }
    }
    public double multiplicar(double a , double b){
        return a * b ;
    }
}

