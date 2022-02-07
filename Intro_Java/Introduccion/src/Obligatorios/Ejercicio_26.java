package Obligatorios;

import java.util.Scanner;

public class Ejercicio_26 {

    public static void main(String[] args) {
        
        final int tamMatrizChica = 2;
        final int tamMatrizGrande = 5;
        
        int[] vecFilaYColumSubMat = new int[2];
        int[][] matrizGrande = new int[tamMatrizGrande][tamMatrizGrande],
                matrizChica = new int[tamMatrizChica][tamMatrizChica];
        
        System.out.println("Ingrese numeros para rellenar la matriz grande");
        rellenarIngresoMatriz(matrizGrande, tamMatrizGrande);
        System.out.println("Ingrese numeros para rellenar la matriz chica");
        rellenarIngresoMatriz(matrizChica, tamMatrizChica);
        
        vecFilaYColumSubMat = verificarPertenenciaMatrices(matrizGrande,
                              matrizChica, tamMatrizGrande, tamMatrizChica);
        
        if( vecFilaYColumSubMat != null) {
            System.out.println("Matriz chica encontrada en:");
            System.out.println("Fila: " + vecFilaYColumSubMat[0]);
            System.out.println("Columna: " + vecFilaYColumSubMat[1]);
        }
    }
    
    public static int[] verificarPertenenciaMatrices(int[][] matrizGrande,
        int[][] matrizChica, int tamMatrizGrande, int tamMatrizChica) {
        
        int[][] subMatriz = new int[tamMatrizChica][tamMatrizChica];
        int[] vecDatosPedidos = new int[2];
        int i, j;
        
        for (i = 0; i < tamMatrizGrande-tamMatrizChica; i++) {
            for (j = 0; j < tamMatrizGrande-tamMatrizChica; j++) {
                extraerSubMatriz(matrizGrande, subMatriz, tamMatrizChica, i, j);
                if(verificarIgualdadMatrices(matrizChica, subMatriz, 
                                             tamMatrizChica)) {
                   vecDatosPedidos[0] = i+1;
                   vecDatosPedidos[1] = j+1;
                   return vecDatosPedidos;
                }
            }
        }
        
        return null;
    }
    
    public static boolean verificarIgualdadMatrices(int[][] primerMatriz,
                            int[][] segundaMatriz, int tamMat) {
        
        int i, j;
        
        for (i = 0; i < tamMat; i++) {
            for (j = 0; j < tamMat; j++) {
                if(primerMatriz[i][j] != segundaMatriz[i][j])
                    return false;
            }
        }
        return true;
    }
    
    public static void extraerSubMatriz(int [][] matrizGrande, int[][] subMatriz,
            int tamMatriz, int filaActual, int columActual) {
        
        int i, j, columOriginal = columActual;
        
        for (i = 0; i < tamMatriz; i++, filaActual++) {
            for (j = 0, columActual = columOriginal; j < tamMatriz; j++, columActual++) {
                subMatriz[i][j] = matrizGrande[filaActual][columActual];
            }
        }
    }
    
    public static void  rellenarIngresoMatriz(int[][] matriz, int tamMat) {
          
          int i, j;
          Scanner entrada = new Scanner(System.in);
          
          for(i = 0; i < tamMat; i++) {
              for(j = 0; j < tamMat; j++) {
                  System.out.print("posicion[" + i + "][" + j + "] = ");
                  matriz[i][j] = entrada.nextInt();
              }
          }
    }
    
    public static void mostrarMatriz(int[][] matriz, int fila, int columna) {
        
        int i, j;
        
        for(i = 0; i < fila; i++) {
            for(j = 0; j < columna; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
