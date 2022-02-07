package Obligatorios;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        System.out.println("El doble del numero: " + 2*num);
        System.out.println("El triple del numero: " + 3*num);
        System.out.println("Raiz cuadrada del numero: " + Math.sqrt(num));
    }
    
}
