package Obligatorios;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        
        int num;
        Boolean condicion;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        condicion = num%2 == 0;
        
        if(condicion)   
        {
            System.out.println("El numero es par");
        }
        else
        {
            System.out.println("El numero es impar");
        }
    }
    
}
