package Obligatorios;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {

        String cadena;
        int largo = 5, contLectCorrec, contLectIncorr;
        Scanner leer = new Scanner(System.in);

        contLectCorrec = 0;
        contLectIncorr = 0;

        System.out.println("Ingrese la cadena a enviar");
        cadena = leer.nextLine();

        while (!cadena.equals("&&&&&")) {
            
            if(cadena.length() == largo && cadena.startsWith("X") && cadena.endsWith("O")) {
                System.out.println("Cadena correcta");
                contLectCorrec += 1;
            } else {
                System.out.println("Cadena incorrecta");
                contLectIncorr += 1;
            }

            System.out.println("Ingrese otra cadena a enviar");
            cadena = leer.nextLine();
        }
        
        System.out.println("Lecturas correctas: " + contLectCorrec);
        System.out.println("Lecturas incorrectas: " + contLectIncorr);
    }

}
