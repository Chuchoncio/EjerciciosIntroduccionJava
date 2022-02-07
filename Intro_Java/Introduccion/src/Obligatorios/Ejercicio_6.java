package Obligatorios;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        
        Boolean cond;
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        num2 = leer.nextInt();
        
        cond = num1 >= num2;
        
        System.out.println("Numero mayor");
        if(cond){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }    
    }
    
}
