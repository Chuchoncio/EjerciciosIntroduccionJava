package Obligatorios;

public class Ejercicio_20 {

    public static void main(String[] args) {      
        
        int i, N = 100;
        int[] vector = new int[N];
        
        for(i = 1; i <= N; i++)
            vector[i-1] = i;
        
        for(i = N-1; i >= 0; i--) {
             // Para imprimir ordenadamente el vector
            if(i % 10 == 0)
                System.out.println("");
            System.out.print("[" + vector[i] + "]");
        }
       
        System.out.println("");
    }

}
