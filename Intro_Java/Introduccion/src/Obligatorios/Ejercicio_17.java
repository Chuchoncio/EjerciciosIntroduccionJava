package Obligatorios;

import java.util.Scanner;


public class Ejercicio_17 {

    public static void main(String[] args) {
        
        char elem = '*';
        int num, i, j;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        for(i = 0; i < num; i++) {
            for(j = 0; j < num; j++) {
                if( (i == 0 || i == num-1) || (j == 0 || j == num-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }

}
