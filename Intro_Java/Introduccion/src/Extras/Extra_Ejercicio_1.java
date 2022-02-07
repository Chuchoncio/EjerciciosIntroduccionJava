
package Extras;

import java.util.Scanner;

public class Extra_Ejercicio_1 {

    public static void main(String[] args) {
        
        final int CANT_MINUTOS_EN_HORA = 60,
                  CANT_MINUTOS_EN_DIA = 1440;
        
        int minutosRestantes, contadorDias, contadorHoras;
        Scanner entrada = new Scanner(System.in);
        
        contadorDias = 0;
        contadorHoras = 0;
        
        System.out.println("Ingrese los minutos");
        minutosRestantes = entrada.nextInt();
                
        while(minutosRestantes >= CANT_MINUTOS_EN_HORA) {
            if(minutosRestantes > CANT_MINUTOS_EN_DIA) {
                contadorDias++;
                minutosRestantes -= CANT_MINUTOS_EN_DIA;
            } else {
                contadorHoras++;
                minutosRestantes -= CANT_MINUTOS_EN_HORA;
            }
        }
        
        System.out.println("Equivalencia en dias/horas: ");
        System.out.println("Dias: " + contadorDias);
        System.out.println("Horas: " + contadorHoras);
    }

}
