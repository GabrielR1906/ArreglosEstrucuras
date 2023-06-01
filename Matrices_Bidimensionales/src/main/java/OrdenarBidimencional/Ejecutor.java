package OrdenarBidimencional;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int n = entrada.nextInt();

        System.out.println("Ingrese el número de columnas:");
        int m = entrada.nextInt();
        
        int[][] matriz = new int[n][m];
        Metodos met = new Metodos();

        met.llenar(matriz);
        met.ordenarMatriz(matriz);
        met.presentarMatriz(matriz);

    }
}
