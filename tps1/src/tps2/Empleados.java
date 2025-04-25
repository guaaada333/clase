package tps2;

public class Empleados {
    private static int cantidadDeEmpleados = 0; // Atributo estático que lleva el conteo de empleados
    private final int legajo;
    private final String nombre;
    private double salario;
    private String motivoAumento;
    
    // Constructor
    public Empleados(String nombre, double salario) {
        this.legajo = ++cantidadDeEmpleados; // Asigna un legajo único e incrementa la cantidad de empleados
        this.nombre = nombre;
        this.salario = salario;
        this.motivoAumento = "No tiene aumento registrado"; // Inicialmente no tiene motivo de aumento
    }
    
    // Método para aumentar el salario por porcentaje
    public void aumentarSalarioPorPorcentaje(double porcentaje, String motivo) {
        double aumento = salario * (porcentaje / 100);
        salario += aumento;
        motivoAumento = motivo; // Registrar el motivo del aumento
        System.out.println("Salario de " + nombre + " aumentado en un " + porcentaje + "% por: " + motivo);
    }

    // Método para aumentar el salario por un monto fijo
    public void aumentarSalarioPorMonto(double monto, String motivo) {
        salario += monto;
        motivoAumento = motivo; // Registrar el motivo del aumento
        System.out.println("Salario de " + nombre + " aumentado en " + monto + " por: " + motivo);
    }
    
    // Método para obtener la cantidad total de empleados
    public static int obtenerCantidadDeEmpleados() {
        return cantidadDeEmpleados;
    }

    // Método para mostrar la información del empleado
    public void mostrarDatos() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Motivo de aumento: " + motivoAumento);
        System.out.println();
    }
}
