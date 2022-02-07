package Obligatorios;

import java.util.Scanner;


public class Ejercicio_3 {

    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        System.out.println("Frase en mayusculas: " + frase.toUpperCase());
        System.out.println("Frase en minusculas: " + frase.toLowerCase());
    }
    
}
