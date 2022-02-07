
package Extras;

public class Extra_Ejercicio_2 {

    public static void main(String[] args) {
        
        int ent_A, ent_B, ent_C, ent_D, ent_aux;
        
        ent_A = 5;
        ent_B = 20;
        ent_C = 100;
        ent_D = 600;
        
        printVariousValues(ent_A,ent_B,ent_C,ent_D);
        System.out.println("========");
        
        ent_aux = ent_B;
        ent_B = ent_C;
        ent_C = ent_A;
        ent_A = ent_D;
        ent_D = ent_aux;
        
        System.out.println("Nuevos valores:");
        printVariousValues(ent_A,ent_B,ent_C,ent_D);
    }
    
    public static void printVariousValues(int A, int B, int C, int D) {
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
}
