/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoMatrices;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class MetodosMatrices {
    Scanner entrada = new Scanner(System.in);
    
    public int menu(){
        System.out.println("Llenar Matriz A:                  [1]");
        System.out.println("Llenar Matriz B:                  [2]");
        System.out.println("Presentar Matriz A:               [3]");
        System.out.println("Presentar Matriz B:               [4]");
        System.out.println("Multiplicacion de matrices:       [5]");
        System.out.println("Calcular la determinante de A:    [6]");
        System.out.println("Calcular la determinante de B:    [7]");
        return entrada.nextInt();
    }
    public void leerMat(int[][] X){
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[0].length; j++) {
                System.out.println("Elemento [" + i + "} {" + j + "]:");
                X[i][j] = entrada.nextInt();
            }
        }
    }
    
    public void presenta(int[][] X){
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[0].length; j++) {
                System.out.print(X[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public void multMat(int[][] A, int[][] B, int[][] C){
        int s;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                s = 0;
                for (int k = 0; k < A[0].length; k++) {
                 s = A[i][j] * B[j][k];   
                }
                C[i][j] = s;
            }
        }
    }
    
    public int determinante(int[][] X){
        int acumuladorMultiplicacion1;
        int acumuladorMultiplicacion2;
        int determinante;
        int acumuladorSumas1 = 0;
        int acumuladorSumas2 = 0;
        int k,l;
        for (int i = 0; i < X.length; i++) {
            k = 1;
            l = X.length - 1 - i;
            acumuladorMultiplicacion1 = 1;
            acumuladorMultiplicacion2 = 1;
            for (int j = 0; j < X.length; j++) {
                acumuladorMultiplicacion1 = acumuladorMultiplicacion1 * X[j][k];
                acumuladorMultiplicacion2 = acumuladorMultiplicacion1 * X[j][l];
                if (k==X.length - 1) {
                    k = 0;
                    l = 3;
                } else {
                    k = k + 1;
                    l = l - 1;
                }
            }
            acumuladorSumas1 = acumuladorSumas1 + acumuladorMultiplicacion1;
            acumuladorSumas2 = acumuladorSumas2 + acumuladorMultiplicacion2;
        }
        determinante = acumuladorSumas1 - acumuladorSumas2;
        return determinante;
    }
}
