/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.problema05arrbi;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double[][] almacenes = new double[10][3];
        Metodos met = new Metodos();
        
        met.llenarMatrizAlmacenes(almacenes);
        met.obtenerMedia(almacenes);
        met.ventasSuperioresM();
        met.mProductivoyMenosProductivo(almacenes);
        met.presentarDatos(almacenes);
    }
    
}
