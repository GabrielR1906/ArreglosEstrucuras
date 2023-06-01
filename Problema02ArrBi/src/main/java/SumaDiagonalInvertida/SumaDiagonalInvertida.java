/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SumaDiagonalInvertida;

/**
 *
 * @author renat
 */
public class SumaDiagonalInvertida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declarar una matriz de 3 x 3
        int[][] matriz = new int[3][3];
        Metodos m = new Metodos();
        //Llenar la matriz
        m.llenarMatriz(matriz);
        // Llamar al método que suma la diagonal invertida
        int suma = m.sumarDiagonalInvertida(matriz);
        // Mostrar Matriz
        System.out.println("La matriz que se ha ingresado es:");
        m.presentarMatriz(matriz);
        // Mostrar el resultado
        System.out.println("La suma de la diagonal invertida es: " + suma);
    }

    
}

