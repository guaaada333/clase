package tp3;
import java.util.Scanner;

/**
 *
 * @author churo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //comprobacion de longitud de contraseña
        Scanner comprobacion = new Scanner(System.in);
        System.out.print("Ingrese contraseña : ");
        String contraseña = comprobacion.nextLine();
        
        int longitud = contraseña.length();
        
        if(longitud>=8){
            System.out.println("Contraseña guardada ");
    }else{
            System.out.println("Error contraseña corta ");
        }
        
        comprobacion.close();
        boolean tieneEspecial = false;
         String especiales = "!@#$%^&*";
          for (int i = 0; i < contraseña.length(); i++) {
           if (especiales.contains(String.valueOf(contraseña.charAt(i)))) {
          tieneEspecial = true;
          break;
    }
}
 if (tieneEspecial) {
    System.out.println("✅ Contiene carácter especial");
} else {
    System.out.println("❌ No contiene carácter especial");
}
 //metodo para ver si hay numeros 
        boolean tieneNumero = false;
      for (int i = 0; i < contraseña.length(); i++) {
      if (Character.isDigit(contraseña.charAt(i))) {
        tieneNumero = true;
        break;
    }
}
  if (tieneNumero) {
    System.out.println("✅ Contiene al menos un número");
} else {
    System.out.println("❌ No contiene números");
}     
   }
    
}
