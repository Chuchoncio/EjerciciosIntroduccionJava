package Obligatorios;

import java.util.Scanner;

public class Ejercicio_21 {

    public static void main(String[] args) {
        
        int N, i, num, numBusc, contNumBusc = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        N = leer.nextInt();

        int[] vec = new int[N];
        
        for(i = 0; i < N; i++) {
            num = (int)(Math.random()*10);
            vec[i] = num;
        }
        
        System.out.println("Ingrese el numero que desea buscar");
        numBusc = leer.nextInt();
        
        for(i = 0; i < N; i++) {
            if(numBusc == vec[i]) {
                System.out.println("El numero se encuentra en la posicion "
                                   + (i+1));
                contNumBusc++;
            }     
        }
        
        if(contNumBusc > 1) {
            System.out.println("El numero se encuentra repetido");
        }
    }

}
