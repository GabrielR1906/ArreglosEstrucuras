/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ManejoMatrices;

/**
 *
 * @author renat
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcionMenu;
        
        int[][] A = new int [2][3];
        int[][] B = new int[3][4];
        int[][] C = new int[2][4];
        
        MetodosMatrices obj = new MetodosMatrices();
        
        do{
            opcionMenu = obj.menu();
            switch(opcionMenu){
                case 1 -> obj.leerMat(A);
                case 2 -> obj.leerMat(B);
                case 3 -> obj.presenta(A);
                case 4 -> obj.presenta(B);
                case 5 -> obj.multMat(A, B, C);
                case 6 -> obj.determinante(A);
                case 7 -> obj.determinante(B);
                
            }
        } while (opcionMenu != 0);
        
    }
    
}
