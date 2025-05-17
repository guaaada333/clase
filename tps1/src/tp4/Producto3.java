package tp4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//ejercicio 2 ordenador por disponibilidad
public class Producto3 {
    // Atributos
    private String nombre;
    private int precio;
    private boolean estado;

    // Constructor
    public Producto3(String nombre, int precio, boolean estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }
//getters
    public String getNombre(){
            return nombre ;
    }
    public int getPrecio(){
        return precio ;
    }
    public boolean isEstado(){
        return estado ;
    }
    
    //setters
    public void setNombre(String nombre){
        this.nombre=nombre ;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setEstado(boolean estado){
        this.estado=estado ;
    }
    
    // Implementación de Comparable
public static class comparadorPorEstado implements Comparator<Producto3>{

        @Override
        public int compare(Producto3 o1, Producto3 o2) {
            return Boolean.compare(o1.isEstado(), o2.isEstado());
}
            
        }

@Override
public String toString() {
    return "Producto3{" +
           "nombre=" + nombre + '\'' +
           ", precio=" + precio +
           ", estado=" + (estado ? "Disponible" : "No disponible") +
           '}';
}  
}
         
 

