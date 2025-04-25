package tps2.SistemasDeTp2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import tps2.CuentaBancaria ;
/**
 *
 * @author churo
 */
public class sistema3 {public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(46528196 , "Guadalupe Villafañe" , (float) 20000.00);
 // Mostrar los datos de la cuenta
        cuenta.mostrarDatos();

        // Depositar dinero
        cuenta.depositar(500.0f);
        System.out.println("Después de depositar:");
        cuenta.mostrarDatos();

        // Retirar dinero
        cuenta.retirarDinero(300.0f);

        // Consultar el saldo
        float saldoActual = cuenta.consultarSaldo();
        System.out.println("Saldo consultado: " + saldoActual);
}
}
    

