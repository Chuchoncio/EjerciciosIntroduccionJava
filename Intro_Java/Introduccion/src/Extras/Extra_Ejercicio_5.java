package Extras;

import java.util.Scanner;

public class Extra_Ejercicio_5 {

    public static void main(String[] argv) {
        
        char letraIng;
        double costoIng;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese tipo de obra social: ");
        letraIng = entrada.next().toUpperCase().charAt(0);
        
        System.out.println("Ingrese el costo del tratamiento");
        costoIng = entrada.nextDouble();
        
        imprimirCostoTotal(letraIng, costoIng);
    }
    
    public static void imprimirCostoTotal(char tipoObraSoc,
                                              double costoTramto) {
        
        double costoTotal;
        
        costoTotal = calcularCostoTramto(tipoObraSoc, costoTramto);
        System.out.println("El costo del tratamiento es de: $" + costoTotal +
                            " pesos.");
    }
    
    public static double calcularCostoTramto(char tipoObraSoc,
                                           double costoTramto) {
        
        double costoTotal = 0;
        
        switch(tipoObraSoc) {
            case 'A':
                costoTotal = costoTramto - (costoTramto*0.50);
                break;
            case 'B':
                costoTotal = costoTramto - (costoTramto*0.35);
                break;
            case 'C':
                costoTotal = costoTramto;
                break;
            default:
                System.out.println("Tipo de obra social no reconocida");
        }
        
        return costoTotal;
    }

}
