package tp4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//ejercicio 2 ordenador por defecto(por precio)
public class Producto implements Comparable<Producto> {
    // Atributos
    private String nombre;
    private int precio;
    private boolean estado;

    // Constructor
    public Producto(String nombre, int precio, boolean estado) {
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
    public void setNombre(){
        this.nombre=nombre ;
    }
    public void setPrecio(){
        this.precio=precio;
    }
    public void setEstado(){
        this.estado=estado ;
    }
    
    // Implementación de Comparable

    @Override
    public int compareTo(Producto otroProducto) {
        return this.precio-otroProducto.precio;
       
    }

@Override
public String toString() {
    return "Producto{" +
           "nombre=" + nombre + '\'' +
           ", precio=" + precio +
           ", estado=" + (estado ? "Disponible" : "No disponible") +
           '}';
}       
         
 }



