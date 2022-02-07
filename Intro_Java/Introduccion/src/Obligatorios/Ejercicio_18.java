package Obligatorios;

import java.util.Scanner;

public class Ejercicio_18 {

    public static void main(String[] args) {
        
        int num, cantNum, j;
        Scanner leer = new Scanner(System.in);
        
        cantNum = 4;
        
        for(cantNum = 0; cantNum < 4; cantNum++) {
            num = leer.nextInt();
            System.out.print(num + " ");
            for(j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
