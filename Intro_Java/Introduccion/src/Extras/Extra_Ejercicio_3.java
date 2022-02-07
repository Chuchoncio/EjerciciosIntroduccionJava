package Extras;

import java.util.Scanner;

public class Extra_Ejercicio_3 {

    public static void main(String[] args) {
        
        String letraIngresada;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una letra (si es una frase,"
                            + " toma la primera letra");
        letraIngresada = (entrada.next()).substring(0,1);
        
        if(esVocal(letraIngresada)) {
            System.out.println("Su letra es una vocal");
        } else {
            System.out.println("Su letra NO es una vocal");
        }
    }
    
    public static boolean esVocal(String letra) {
        letra = letra.toLowerCase();
        switch(letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                return true;
            default:
                return false;
        }
    }

}
