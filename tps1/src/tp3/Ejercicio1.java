package tp3;

/**
 *•	

 * @author guada
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //consumo
        double consumoAntes = 5000 ;
        double consumoAhora = 2500 ;
        
        double Ahorro = consumoAntes - consumoAhora ;
        double energia = Math.sqrt(Ahorro); // Devuelve 50.0
        System.out.println("El ahorro es de " + energia);
        
        //maximo y minimos
        int consumoLavadora = 2030 ;
        int consumoPc = 5000 ;
        int consumoHeladera = 4000 ;
        int consumoTv=7000 ;
        
        int consumoMax = Math.max(Math.max(consumoLavadora,consumoPc ), Math.max(consumoTv ,consumoHeladera));
        int consumoMin = Math.min(Math.min(consumoLavadora,consumoPc ), Math.min(consumoTv ,consumoHeladera));
        
        System.out.println("El consumo maximo es de " + consumoMax );
         System.out.println("El consumo minimo es de " + consumoMin );
        
    }
    
}
