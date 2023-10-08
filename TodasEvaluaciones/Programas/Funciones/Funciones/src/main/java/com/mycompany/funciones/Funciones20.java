/*
20. Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una función
que reciba un número entero como parámetro e imprima su tabla de multiplicar */
package com.mycompany.funciones;

/**
 *
 * @author isaac
 */
public class Funciones20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int contador0 = 1; contador0 <= 10; contador0++) {

            tablaMultiplicar(contador0);

        }

    }

    public static void tablaMultiplicar(int numero) {

        int resultado;

        for (int contador2 = 0; contador2 < 10; contador2++) {

            resultado = numero * (contador2 + 1);
            System.out.println(numero + " x " + (contador2 + 1) + " = " + resultado);

        }

    }

}
