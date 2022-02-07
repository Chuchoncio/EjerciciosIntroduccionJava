package Obligatorios;

public class Ejercicio_23 {

    public static void main(String[] args) {
        
        int tamMat = 4;
        int[][] matriz = new int[tamMat][tamMat];
        
        rellenarMatriz(matriz, tamMat);
        mostrarMatriz(matriz, tamMat);
        mostrarMatrizTraspuesta(matriz, tamMat);
    }
    
    public static void rellenarMatriz(int[][] matriz, int tamMat) {
        
        int i, j;
        
        for(i = 0; i < 4; i++) {
            for(j = 0; j < 4; j++) {
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matriz, int tamMat) {
        
        int i, j;
        
        for(i = 0; i < 4; i++) {
            for(j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarMatrizTraspuesta(int[][] matriz, int tamMat) {
        
        int i, j;
        
        for(i = 0; i < 4; i++) {
            for(j = 0; j < 4; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
    }

}
