package Obligatorios;

import java.util.Scanner;

/**
 *
 * @author Juan Manuel
 */
public class Ejercicio_13 {

    public static void main(String[] args) {

        int techo, suma = 0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un valor limite positivo");
            techo = leer.nextInt();
        } while (techo < 0);
        
        while(techo >= suma)
        {
            System.out.println("Ingrese un numero");
            suma += leer.nextInt();
        }
        
        System.out.println("Techo: " + techo);
        System.out.println("Suma: " + suma);
        System.out.println("Limite superado!");
    }

}
