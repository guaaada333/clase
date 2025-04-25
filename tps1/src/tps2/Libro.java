package tps2;

public class Libro {
    public String titulo ;
    public String autor ;
    public String ISBN ;
    public boolean disponible ;
    
    //constructor
    public Libro(String titulo , String autor , String ISBN , boolean disponible){
         this.titulo= titulo ;
         this.autor = autor ;
         this.ISBN = ISBN ;
         this.disponible = disponible ;
    }
    
    public void prestar(){
        if(disponible){
            disponible= false ; 
            System.out.println("El libro ha sido prestado");
        }else{
            System.out.println("El libro no esta disponible");
        }
    }
    
    public void devolver(){
        disponible = true ;
                System.out.println("El libro a sido devuelto");
    }
    
    public void mostrardatos(){
        System.out.println("El titulo es " + titulo);
        System.out.println("El autor es "+ autor);
        System.out.println("El ISBN es " + ISBN);
        System.out.println("El libro esta " + (disponible ? "Disponible" : "Prestado" ) );
        
    
    }
            
    
}
