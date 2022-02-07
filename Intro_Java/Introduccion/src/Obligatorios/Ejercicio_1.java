package Obligatorios;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero entero");
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("El resultado de la suma es: " + suma);
    }
    
}
