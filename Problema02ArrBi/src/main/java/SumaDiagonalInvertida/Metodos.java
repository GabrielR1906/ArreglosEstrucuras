/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SumaDiagonalInvertida;

import java.util.Scanner;

/**
 *
 * @author Gab
 */
public class Metodos {
    //Metodo para llenar la Matriz
    public void llenarMatriz(int[][] matriz){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Ingrese el elemento de la posisición"
                        + " [%d}[%d]\n", i, j);
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    
    // Método que recibe una matriz y devuelve la suma de su diagonal invertida
    public static int sumarDiagonalInvertida(int[][] matriz) {
        // Inicializar la suma en cero
        int suma = 0;
        // Recorrer la matriz por filas
        for (int i = 0; i < matriz.length; i++) {
            // Recorrer la matriz por columnas
            for (int j = 0; j < matriz[i].length; j++) {
                // Si la fila más la columna es igual al tamaño de la matriz menos uno
                if (i + j == matriz.length - 1) {
                    // Sumar el elemento de la matriz a la suma
                    suma += matriz[i][j];
                }
            }
        }
        // Devolver la suma
        return suma;
    }
    
    public static void presentarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
