package Extras;

import java.util.Scanner;
import java.util.Vector;

public class Extra_Ejercicio_4 {

    public static void main(String[] args) {
        
        int numIngresado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numIngresado = entrada.nextInt();
        
        mostrarNumeroEnRomano(numIngresado);   
    }
    
    public static void mostrarNumeroEnRomano(int num) {
        
        String numEnRomano;
        
        numEnRomano = convertirNumeroARomano(num);
        System.out.println("Romano: " + numEnRomano);
    }
    
    public static String convertirNumeroARomano(int num) {
        
        String numEnRomano;
        Vector<String> vectorNumRomanos = new Vector<>();
        
        rellenarVector(vectorNumRomanos);
        
        num -= 1;
        numEnRomano = vectorNumRomanos.get(num);
        return numEnRomano;
    }
    
    public static void rellenarVector(Vector<String> vector) {
        vector.add("I");
        vector.add("II");
        vector.add("III");
        vector.add("IV");
        vector.add("V");
        vector.add("VI");
        vector.add("VII");
        vector.add("VIII");
        vector.add("IX");
        vector.add("X");
    }
}
