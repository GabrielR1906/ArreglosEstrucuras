/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arra;

/**
 *
 * @author Renato G Rojas
 */
public class ArrA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lim;
        int op;
        int num;
        int ev = 0;
        int encontrado;
        
        Metodos_ArrA obj = new Metodos_ArrA();
        
        System.out.println("Ingrese el tamaño del arreglo: ");
        lim = obj.entrada.nextInt();
        
        int[] myArreglo = new int [lim];
        
        do{
            op = obj.menu();
            switch(op) {
                case 1 -> ev = obj.insFull(myArreglo);
                case 2 -> ev = obj.insFinal(myArreglo, ev);
                case 3 -> ev = obj.insInicio(myArreglo, ev);
                case 4 -> {
                            System.out.println("Ingrese el numero:");
                            num = obj.entrada.nextInt();
                            ev = obj.insOrden(myArreglo, ev, num);
                }
                case 5 -> {
                    System.out.println("Numero a buscar:");
                    num = obj.entrada.nextInt();
                    encontrado = obj.secuencial(myArreglo, ev, num);
                    if(encontrado != 1){
                        System.out.println("Esta en la posicion: " + encontrado);
                    }
                }
                case 6 -> obj.presenta(myArreglo, ev);
                default -> {}
            }
        } while (op != 0);
    }
    
}
