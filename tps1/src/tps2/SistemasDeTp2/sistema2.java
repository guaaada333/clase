package tps2.SistemasDeTp2;


import tps2.Reloj ;
public class sistema2 {
    public static void main(String[] args) {
        // Crear un objeto Reloj con hora inicial 23:59:59
        Reloj miReloj = new Reloj(23, 59, 59);
        
        // Mostrar la hora actual
        System.out.print("Hora actual: ");
        miReloj.mostrarHora();

        // Avanzar un segundo
        miReloj.avanzarSegundo();

        // Mostrar la hora después de avanzar un segundo
        System.out.print("Después de avanzar un segundo: ");
        miReloj.mostrarHora();
    }
}
