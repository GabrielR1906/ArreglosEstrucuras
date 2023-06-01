/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arra;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Metodos_ArrA {

    Scanner entrada;

    public Metodos_ArrA() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Insertar completo   [1]:");
        System.out.println("Insertar al final   [2]:");
        System.out.println("Insertar al inicio  [3]:");
        System.out.println("Insertar ordenado   [4]:");
        System.out.println("Buscar              [5]:");
        System.out.println("Presentar           [6]:");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();
    }

    public int insFull(int[] X) {
        for (int i = 0; i < X.length; i++) {
            System.out.println("Ingrese elemento [" + i + "]:");
            X[i] = entrada.nextInt();
        }
        return X.length;
    }

    public void presenta(int[] X, int _ev) {
        for (int i = 0; i < _ev; i++) {
            System.out.println(X[i] + " ");
        }
        System.out.println("");
    }

    public int insFinal(int[] X, int _ev) {
        if (_ev < X.length) {
            System.out.println("Ingrese elemento:");
            X[_ev] = entrada.nextInt();
        } else {
            System.out.println("Arreglo Lleno...");
        }
        return _ev;
    }
    
    public void recorreDer(int[] X, int pos, int _ev){
        for(int i = _ev; i > pos; i--){
            X[i] = X[i-1];
        }
    }
    
    public int insInicio(int[] X, int _ev) {
        if(_ev < X.length){
            recorreDer(X, 0, _ev);
            X[0] = entrada.nextInt();
            _ev++;
        } else {
            System.out.println("Arrelgo lleno...");
        }
        return _ev;
    }
    
    public int insOrden(int[] X, int _ev, int num) {
        if(_ev < X.length) {
            int pos = 0;
            while((pos < _ev) && (num > X[pos]))
                pos++;
            if(pos != _ev)
                recorreDer(X, pos, _ev);
            X[pos] = num;
            _ev++;
        } else {
                System.out.println("Arreglo lleno...");
        }
        return _ev;
    }
    
    public int secuencial(int[] X, int _ev, int num){
        for (int i = 0; i < _ev; i++) {
            if (num == X[i]){
                return i;
            }
        }
        return -1;
    }
    
    public void recorrerIzq(int[] X, int _ev, int pos){
        for (int i = pos; i < _ev-1; i++) {
            X[i] = X[ i + 1 ];
        }
    }
    
    public int elimina (int[] X, int _ev, int num) {
        int pos = secuencial (X, _ev, num);
        if (pos != -1) {
        recorrerIzq (X, _ev, pos);
        _ev --;
        } else {
            System.out.println("Elemento no existente...");
        }
        return _ev;
    }
    
    public void burbuja(int[] X, int _ev) {
        int aux = 0;
        for (int i = 0; i < _ev-1; i++) {
            for (int j = i + 1; j < _ev; j++) {
                if (X[i] > X[j])
                    aux = X[i];
                    X[i] = X[j];
                    X[j] = aux;
            }
        }
    }
    
    public int binaria (int[] X, int ini, int fin, int num){
        int medio = (ini + fin) / 2;
        if (ini <= fin){
            if (X[medio] == num){
                return medio;
            } else {
                if(num > X[medio]){
                return binaria(X, medio+1, fin, num);
                } else {
                    return binaria (X, ini, medio -1, num);
                }
            }
        } else {
            return -1;
        }
    }
}   
