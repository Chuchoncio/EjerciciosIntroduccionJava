
package Obligatorios;

import java.util.Scanner;

/**
 *
 * @author Juan Manuel
 */
public class Ejercicio_25 {

    public static void main(String[] args) {
        
        int tamMat;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese tamaño de la matriz");
        tamMat = entrada.nextInt();
        
        int[][] matriz = new int[tamMat][tamMat];
        
        System.out.println("Ingrese numeros para rellenar la matriz");
        rellenarIngresoMatriz(matriz, tamMat);
        
        if(verifCuadradoMagico(matriz, tamMat))
            System.out.println("Su matriz es un CUADRADO MAGICOU");
        else
            System.out.println("Su matriz NO ES UN MALDITO CUADRADO MAGICO");
          
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
    
    public static boolean verifCuadradoMagico(int[][] matriz, int tamMat) {

	int i, j, sumaFila, sumaCol, sumaDiag;
	boolean esCuadMagic;
	
	esCuadMagic = true;
	
	sumaFila = 0;
	sumaCol = 0;
	sumaDiag = 0;
	
	for(i = 0; i < tamMat; i++) {
		sumaDiag += matriz[i][i];
        }
	
	for(i = 0; i < tamMat; i++) {
		for(j = 0; j < tamMat; j++) {
                    sumaFila += matriz[i][j];
                    sumaCol += matriz[i][j];
                }
		
		if((sumaFila == sumaDiag) && (sumaCol == sumaDiag)) {
			sumaFila = 0;
			sumaCol = 0;
                } else {
			return false;
                }
        }
        
        return true;
    }

}
