package Obligatorios;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        
        float gradosC, gradosF;
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese temperatura en grados celsius: ");
        gradosC = leer.nextFloat();
        
        gradosF = 32 + ((9 * gradosC)/5);
        System.out.println("Conversion a Fahrenheit: " + gradosF);
    }
    
}
