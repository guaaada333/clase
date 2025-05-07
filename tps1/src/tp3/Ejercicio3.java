package tp3;

/**
 *
 * @author guada
 */
public class Ejercicio3 {

    public static void main(String[] args) {
     String tweets = "Esta pelicula ganadora del oscar me parecio muy mala" ;
     
     //metodo de limite 
     int longitud = tweets.length();
     if(longitud<280){
         System.out.println("✅ Cumple con el limite ");
     }else{
         System.out.println("❌ Limite superado ");
     }
     
     //metodo de concatenar #
     String nuevoTweet = tweets.concat("#");
     System.out.println(nuevoTweet);
     
    //metodo arroba
    String user = "@Guada" + tweets;
    String arroba = user.substring(0,6);
    System.out.println(arroba);
    
    //StringBuilder
    StringBuilder nuevo = new StringBuilder();
    nuevo.append("@Guada ");
    nuevo.append("estoy aprendiendo Java ");
    nuevo.append("#JavaEnUNSTA ");
    
    System.out.println("Nuevo tweet construido : " + nuevo.toString());
    


    
    
    
    
    
    
    
}
}