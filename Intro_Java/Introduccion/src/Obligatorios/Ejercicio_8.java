package Obligatorios;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        // Si es igual a la cadena que pasa por
        //  parametro, da verdadero.
        if(frase.equals("eureka"))
        {
            System.out.println("Correcto");
        }
        else
        {
            System.out.println("Incorrecto");   
        } 
    }
    
}
