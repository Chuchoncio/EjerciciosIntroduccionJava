package Obligatorios;

import java.util.Scanner;

public class Ejercicio_22 {

    public static void main(String[] args) {
        
        int N, i, num, numBusc, contNumBusc = 0, cantDig, resto;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        N = leer.nextInt();

        int[] vec = new int[N],
              vecDig = new int[5];
        
        for(i = 0; i < 5; i++) {
            vecDig[i] = 0;
        }
        
        for(i = 0; i < N; i++) {
            num = (int)(Math.random()*100000);
            vec[i] = num;
        }
        
        for(i = 0; i < N; i++) {
            
            cantDig = 1;
            resto = vec[i] / 10; // Se van obteniendo las cifras
            
            while( resto != 0) {
                cantDig++;
                resto = resto / 10; // Se va dividiendo hasta que de 0
            }
            
            // Almacena en el vector segun la cantidad de digitos (con -1
            //  porque no posee posicion 5 el vector)
            vecDig[cantDig-1]++; 
        }
        
        for(i = 0; i < 5; i++) {
            System.out.println("Numeros de " + (i+1) + " cifras: " + vecDig[i]);
        }
    }

}
