package tps2.SistemasDeTp2;

import tps2.Empleados ;

public class sistema5 {
    public static void main(String[] args) {
        // Crear instancias de empleados
        Empleados empleado1 = new Empleados("Juan Pérez", 25000);
        Empleados empleado2 = new Empleados("Ana García", 28000);
        Empleados empleado3 = new Empleados("Carlos López", 30000);
        
        // Mostrar los datos iniciales de los empleados
        System.out.println("Datos iniciales del empleado 1:");
        empleado1.mostrarDatos();
        
        System.out.println("Datos iniciales del empleado 2:");
        empleado2.mostrarDatos();
        
        System.out.println("Datos iniciales del empleado 3:");
        empleado3.mostrarDatos();
        
        // Aumentar salario del empleado 1 por porcentaje
        empleado1.aumentarSalarioPorPorcentaje(10, "Aumento anual");
        empleado1.mostrarDatos();
        
        // Aumentar salario del empleado 2 por monto fijo
        empleado2.aumentarSalarioPorMonto(2000, "Aumento por desempeño");
        empleado2.mostrarDatos();
        
        // Aumentar salario del empleado 3 por porcentaje
        empleado3.aumentarSalarioPorPorcentaje(5, "Aumento por antigüedad");
        empleado3.mostrarDatos();
        
        // Mostrar la cantidad total de empleados
        System.out.println("Cantidad total de empleados: " + Empleados.obtenerCantidadDeEmpleados());
    }
}
