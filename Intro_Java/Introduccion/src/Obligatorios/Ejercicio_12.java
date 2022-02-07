
package Obligatorios;

import java.util.Scanner;

/**
 *
 * @author Juan Manuel
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        
        int nota;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nota");
        nota = leer.nextInt();
        
        while(nota < 0 || nota > 10)
        {
            System.out.println("Re-ingrese la nota");
            nota = leer.nextInt();
        }
        
        System.out.println("Nota ingresada correctamente!");
    }

}
