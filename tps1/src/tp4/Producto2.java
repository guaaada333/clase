package tp4;
import java.util.Comparator;
        
/**
 *
 * @author churo
 */
public class  Producto2 {
    private String nombre;
    private int precio;
    private boolean estado;

    // Constructor de ordenador por nombre
    public Producto2(String nombre, int precio, boolean estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }
    public String getNombre(){
        return nombre;
    }
        public int getPrecio(){
        return precio ;
    }
    public boolean isEstado(){
        return estado ;
    }
    
    //setters
    public void setNombre(){
        this.nombre=nombre ;
    }
    public void setPrecio(){
        this.precio=precio;
    }
    public void setEstado(){
        this.estado=estado ;
    }
    
    public static class comparadorPorNombre implements Comparator<Producto2>{

        @Override
        public int compare(Producto2 o1, Producto2 o2) {
            return o1.nombre.compareTo(o2.nombre);
        }
    }    
        
     @Override
    public  String toString() {
        return "Producto2{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", estado=" + estado +
                '}';
    }
    
    
    }

