package Obligatorios;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        
        int limite = 20, num, suma = 0;
        Scanner leer = new Scanner(System.in);
        
        do
        {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            if(num > 0)
                suma += num;
            
            if(num == 0)
            {
                System.out.println("Se capturo el numero cero");
                break;
            }
            
            limite--;
        }while(limite > 0);
        
        System.out.println("La suma dio: " + suma);
    }

}
