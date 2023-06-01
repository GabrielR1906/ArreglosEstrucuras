/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema05arrbi;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Metodos {
    public void llenarMatrizAlmacenes(double[][] almacenes){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        for (int i = 0; i < almacenes.length; i++) {
            System.out.println("Almacen " + (i + 1) + ":");
            for (int j = 0; j < almacenes[i].length; j++) {
                System.out.println("Mes " + (j+1) + ":");
                almacenes[i][j] = entrada.nextDouble();
            }
        }
    }
    
    double[] media = new double[10];
    double mediaT = 0;
    public void obtenerMedia(double[][] almacenes){
        for (int i = 0; i < almacenes.length; i++) {
            for (int j = 0; j < almacenes[i].length; j++) {
                media[i] = media[i] + almacenes[i][j];
            }
            media[i] = media[i]/3;
            mediaT = mediaT + media[i];
        }
        mediaT = mediaT / 10;
    }
    
    String mensaje = "";
    public void ventasSuperioresM(){
        for (int i = 0; i < media.length; i++) {
            if(media[i] > mediaT){
                mensaje = String.format("%sAlmacen %d \n", mensaje, i+1);
            }
        }
    }
    
    String mensajeMasProductivo = "";
    String mensajeMenosProductivo = "";
    public void mProductivoyMenosProductivo(double[][] almacenes){
        double masproductivo = 0;
        double menosproductivo = 0;
        
        for (int i = 0; i < 3; i++) {
            double ventames = 0;
            for (int j = 0; j < 10; j++) {
                ventames = ventames + almacenes[j][i];
            }
            if(ventames >= masproductivo){
                masproductivo = ventames;
                mensajeMasProductivo = String.format("El mes %d es el mas"
                        + " productivo, con una produccion "
                        + "de: %.2f\n", i+1, masproductivo);
            }
            if(ventames < masproductivo){
                menosproductivo = ventames;
                mensajeMenosProductivo = String.format("El mes %d es el "
                        + "menos productivo, con una produccion"
                        + " de: %.2f", i+1, menosproductivo);
            }
        }
    }
    
    public void presentarDatos(double[][] almacenes){
        System.out.printf("\n\t\tMes 1\tMes 2\tMes 3\tMedia\n");
        for (int i = 0; i < almacenes.length; i++) {
            System.out.printf("Almacen %d:\t", i+1);
            for (int j = 0; j < almacenes[i].length; j++) {
                System.out.printf("%.2f\t", almacenes[i][j]);
            }
            System.out.printf("%.2f\n", media[i]);
        }
        System.out.printf("\nMedia total: %.2f\n\nAlmacenes con ventas por "
                + "encima de la media:\n%s\n%s%s\n", mediaT, mensaje,
                        mensajeMasProductivo, mensajeMenosProductivo);
    }
}
