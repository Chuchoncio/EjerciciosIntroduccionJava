package Obligatorios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_19 {

    public static void main(String[] args) {

        double cantEuros;
        String divisa;

        System.out.println("Ingrese euros a convertir");
        cantEuros = Double.valueOf((JOptionPane.showInputDialog("Ingrese euros a convertir")));
        System.out.println("Ingrese el tipo de divisa a convertir");
        System.out.println("(Dolar, Yen, Libra)");
        divisa = JOptionPane.showInputDialog("Ingrese la divisa a convertir");

        imprimirCambio(cantEuros, divisa);
    }

    public static void imprimirCambio(double cantEuros, String divisa) {

        double cambioFinal;

        divisa = divisa.toLowerCase();

        cambioFinal = Math.round(obtencionCambio(cantEuros, divisa));
        
        System.out.println("Usted posee $" + cambioFinal + " " + divisa);
    }
    
    public static double obtencionCambio(double cantEuros, String divisa) {
        
        double cambio, valorLibra, valorDolar, valorYen;
        
        cambio = 0;
        valorLibra = 0.86;
        valorDolar = 1.28611;
        valorYen = 129.852;
        
        switch (divisa) {
            case "libra":
            case "libras":
                cambio =  conversionDivisas(cantEuros, valorLibra);
                break;
            case "dolar":
            case "dolares":
                cambio =  conversionDivisas(cantEuros, valorDolar);
                break;
            case "yen":
            case "yenes":
                cambio =  conversionDivisas(cantEuros, valorYen);
                break;
            default:
                System.out.println("Tipo de cambio incorrecto");
                break;
        }
        
        return cambio;
    }
    
    public static double conversionDivisas(double cantEuros, double valorDivisa) {
        return valorDivisa * cantEuros;
    }
}
