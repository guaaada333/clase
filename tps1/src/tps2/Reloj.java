package tps2;
public class Reloj{
    int hora ;
    int segundos;
    int minutos;
    
    //constructor
    public Reloj(int hora , int minutos , int segundos){
        this.hora= hora;
        this.minutos= minutos;
        this.segundos= segundos ;
        
    }
    //metodo para establecer Hora
    public void establecerHora(int hora, int minutos, int segundos) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Error: Hora inválida");
        }

        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            System.out.println("Error: Minutos inválidos");
        }

        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            System.out.println("Error: Segundos inválidos");
        }
}
    public void mostrarHora(){
        System.out.println(String.format("%02d:%02d:%02d", hora, minutos, segundos));
        
    }
     public void avanzarSegundo() {
        segundos++;
        if (segundos == 60) {//si segundo es igual a 60 comienza de desde cero y se aumenta un minuto
            segundos = 0;
            minutos++;
            if (minutos == 60) {//si minuto es igual a 60 comienza de desde cero y se aumenta una hora
                minutos = 0;
                hora++;
                if (hora == 24) {// Si las horas llegan a 24, reinicia a 0
                    hora = 0;
                }    
            }     
        }
    } 
}