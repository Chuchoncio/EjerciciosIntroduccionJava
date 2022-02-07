
package Extras;
import java.util.Scanner;

public class Extra_Ejercicio_6 {
    
    public static void main(String[] argv) {
        
        int tamVec, cantEstaturaDebajoDeDato, cantEstaturaGeneral;
        double estaturaMedia, promEstaturaDebajoDeDato, promEstaturaGeneral,
               acumEstaturaDebajoDeDato, acumEstaturaGeneral;
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese cantidad de personas a analizar");
        tamVec = entrada.nextInt();
        
        double[] alturaPersonas = new double[tamVec];
        
        estaturaMedia = 1.60;
        cantEstaturaDebajoDeDato = 0;
        cantEstaturaGeneral = tamVec;
        acumEstaturaDebajoDeDato = 0;
        acumEstaturaGeneral = 0;
        
        for(int i = 0; i < tamVec; i++) {
            System.out.println("Ingreso de persona " + (i+1));
            alturaPersonas[i] = entrada.nextDouble();
        }
        
        for(int i = 0; i < tamVec; i++) {
            if(alturaPersonas[i] < estaturaMedia) {
                cantEstaturaDebajoDeDato++;
                acumEstaturaDebajoDeDato += alturaPersonas[i];
            }
            acumEstaturaGeneral += alturaPersonas[i];
        }
        
        promEstaturaDebajoDeDato = acumEstaturaDebajoDeDato /
                                   cantEstaturaDebajoDeDato;
        
        promEstaturaGeneral = acumEstaturaGeneral / cantEstaturaGeneral;
        
        System.out.println("Promedio estaturas debajo de 1.60 mts: " +
                            promEstaturaDebajoDeDato);
        System.out.println("Promedio general estaturas: " + promEstaturaGeneral);
    }
    
}
