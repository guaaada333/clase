package tp4.SISTEMAS;
import tp4.sistema3;

/**
 *
 * @author churo
 */
public class mainDeSistema3 {

    public static void main(String[] args) {
        sistema3 sistema= new sistema3();
        
        String arreglo []= sistema.ponerArreglo();
        
        sistema.mostrarArreglo(arreglo);
        sistema.buscarElemento(arreglo);
        
        
        
        
    }
    
}
