package Obligatorios;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        
        int tipoMotor;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese tipo de motor (1 a 4)");
        tipoMotor = leer.nextInt();
        
        switch(tipoMotor)
        {
            case 1: System.out.println("La bomba es una bomba de agua");
                    break;
            case 2: System.out.println("La bomba es una bomba de gasolina");
                    break;
            case 3: System.out.println("La bomba es una bomba de hormigon");
                    break;
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
            default: System.out.println("No existe un valor valido para tipo de bomba");
        }
    }

}
