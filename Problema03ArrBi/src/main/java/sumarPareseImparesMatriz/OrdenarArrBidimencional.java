/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumarPareseImparesMatriz;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class OrdenarArrBidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        int m;
        
        System.out.println("Ingrese el número de filas de la matriz:");
        n = entrada.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz:");
        m = entrada.nextInt();
        
        int[][] l = new int[n][m];
        Metodos met = new Metodos();
        
        met.llenarMatriz(l);
        met.sumarPareseImparesMatriz(l);
        met.presentarMatriz(l);
    }
    
}
