
package OrdenarBidimencional;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Metodos {


    public void llenar(int[][] x) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println("Ingrese el elemento para la posición"
                        + " [" + i + "][" + j + "]: ");
                x[i][j] = entrada.nextInt();
            }
        }
    }

    public void presentarMatriz(int[][] x) {

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public void ordenarMatriz(int[][] x) {
        int[] aux = new int[x.length * x[0].length];

        int k = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                aux[k++] = x[i][j];
            }
        }

        Arrays.sort(aux);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = aux[k++];
            }
        }
    }
}
