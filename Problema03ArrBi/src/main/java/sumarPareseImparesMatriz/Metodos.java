/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumarPareseImparesMatriz;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Metodos {
    public void llenarMatriz(int[][] matriz){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Ingrese el elemento [%d][%d] "
                        + "de la Matriz\n", i, j);
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    
    int sumaPares = 0;
    int sumaImpares = 0;
    public void sumarPareseImparesMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] % 2 == 0){
                    sumaPares = sumaPares + matriz[i][j];
                } else {
                    sumaImpares = sumaImpares + matriz[i][j];
                }
            }
        }
    }
    
    public void presentarMatriz(int[][] matriz){
        System.out.println("Se ha ingresado la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.printf("La suma de los números pares de la mstriz es: %d\n"
                + "La suma de los números impares del arreglo es: %d\n",
                sumaPares, sumaImpares);
    }
}
