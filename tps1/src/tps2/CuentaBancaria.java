package tps2 ;
public class CuentaBancaria{
   private int numeroCuenta;
   private String nombre ;
   private float saldo;
    
    //constructor
    public CuentaBancaria(int numeroCuenta , String nombre , float saldo){
        this.numeroCuenta= numeroCuenta ;
        this.nombre = nombre ;
        this.saldo = saldo ;
        
    }
        // Método para depositar dinero en la cuenta
    public void depositar(float cantidad){
        if(cantidad>0){
            saldo+= cantidad ;// Aumentar el saldo con la cantidad depositada
        }else{
            System.out.println("Error al depositar");
        }
    }
    public void retirarDinero(float retiro){
        if(retiro<=saldo && retiro!=0 ){
            saldo-=retiro ;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        }else{
            System.out.println("Error dinero insuficiente");
        }
    }
    // Getter para consultar el saldo
    public float consultarSaldo() {
        return saldo;
    }
    
    // Método para mostrar los datos de la cuenta 
    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + nombre);
        System.out.println("Saldo actual: " + saldo);
    }
    
}
