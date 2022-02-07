package Obligatorios;

import java.util.Scanner;


public class Ejercicio_24 {

    public static void main(String[] args) {
        
        int tamMat, i, j, numeroRand;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la matriz cuadrada");
        tamMat = entrada.nextInt();
        
        int[][] matriz = new int[tamMat][tamMat],
                matrizTrasp = new int[tamMat][tamMat];
        
        System.out.println("Proceda a rellenar la matriz");
        //rellenarAleatorioMatrizYTraspuesta(matriz, matrizTrasp, tamMat);
        rellenarIngresoMatrizYTraspuesta(matriz, matrizTrasp, tamMat);
        
        if(verificarAntiSimetria(matriz, matrizTrasp, tamMat))
            System.out.println("La matriz es anti simetrica");
        else
            System.out.println("La matriz NO es anti simetrica");
        
    }
    
    public static void rellenarAleatorioMatrizYTraspuesta(int[][] matriz,
                        int[][] matrizTrasp, int tamMat) {
        
        int i, j, numeroRand;
        
        for(i = 0; i < tamMat; i++) {
            for(j = 0; j < tamMat; j++) {
                numeroRand = (int)(Math.random()*10);
                matriz[i][j] = numeroRand;
                matrizTrasp[j][i] = numeroRand;
            }
        }
    }
    
    public static boolean verificarAntiSimetria(int[][] matriz,
                            int[][] matrizTrasp, int tamMat) {
        int i, j;
        
        for(i = 0; i < tamMat; i++) {
            for(j = 0; j < tamMat; j++) {
                if(matriz[i][j] != (matrizTrasp[i][j]*(-1)))
                    return false;
            }
        }
        
        return true;
    }
    
    public static void  rellenarIngresoMatrizYTraspuesta(int[][] matriz,
                                int[][] matrizTrasp, int tamMat) {
          
          int i, j, numIngresado;
          Scanner entrada = new Scanner(System.in);
          
          for(i = 0; i < tamMat; i++) {
              for(j = 0; j < tamMat; j++) {
                  System.out.print("posicion[" + i + "][" + j + "]");
                  numIngresado = entrada.nextInt();
                  matriz[i][j] = numIngresado;
                  matrizTrasp[j][i] = numIngresado;
                }
            }
    }
}
