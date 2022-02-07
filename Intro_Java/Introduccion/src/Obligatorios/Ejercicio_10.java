package Obligatorios;

import java.util.Scanner;

/**
 *
 * @author Juan Manuel
 */
public class Ejercicio_10 {

    public static void main(String[] args) {

        String frase;
        char primerLetra, letra = 'A';
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese frase");
        frase = leer.nextLine();
        
        primerLetra = frase.charAt(0);
        
//        if(frase.startsWith("A"))
//        {
//            System.out.println("CORRECTO");
//        }
//        else
//        {
//            System.out.println("INCORRECTO");
//        }

        if(letra == primerLetra){
            System.out.println("CORRECTO");
        }
        else
        {
            System.out.println("INCORRECTO");
        }
    }

}
