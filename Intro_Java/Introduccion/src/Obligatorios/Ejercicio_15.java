package Obligatorios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_15 {

    public static void main(String[] args) {

        int num1, num2, opc, operationsResul;
        double divOperation;
        char confirm;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros positivos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        confirm = 'N';

        do {

            menu();
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    operationsResul = sumar(num1, num2);
                    System.out.println("Procesando suma...");
                    System.out.println(num1 + " + " + num2 + " = " + operationsResul);
                    break;
                case 2:
                    operationsResul = restar(num1, num2);
                    System.out.println("Procesando resta...");
                    System.out.println(num1 + " - " + num2 + " = " + operationsResul);
                    break;
                case 3:
                    operationsResul = multiplicar(num1, num2);
                    System.out.println("Procesando multiplicacion...");
                    System.out.println(num1 + " * " + num2 + " = " + operationsResul);
                    break;
                case 4:
                    divOperation = dividir(num1, num2);
                    System.out.println(num1 + " / " + num2 + " = " + divOperation);
                    break;
                case 5:
                    System.out.println("Desea salir del programa?");
                    confirm = leer.next().toUpperCase().charAt(0);
                    break;
                default:
                    System.out.println("Opcion inexistente.");
            }
            
            System.out.print("\033[H\033[2J");
            System.out.flush();

        } while (confirm != 'S');
    }

    public static void menu() {

        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Opcion: ");
    }

    public static int sumar(int num1, int num2) {

        int suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {

        int resta = num1 - num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {

        int multi = num1 * num2;
        return multi;
    }

    public static double dividir(int num1, int num2) {
        double divisRes = 0;
        
        if (num2 == 0) {
            System.out.println("Syntax Error");
        } else {
            DecimalFormat df = new DecimalFormat("###.##");
            divisRes = (float)num1 / num2;
        }
        
        return divisRes;
    }
}
