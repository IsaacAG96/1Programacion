/*
16. Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
valores aleatorios.
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int tamaño;
        System.out.println("Introduce el tamaño del array");
        tamaño = lector.nextInt();

        double numeros[] = new double[tamaño];

        aleatorios(numeros);

    }

    public static void aleatorios(double numeros[]) {

        for (int contador = 0; contador < numeros.length; contador++) {

            numeros[contador] = Math.random();
            System.out.println("En la posicion " + contador + " del array el valor asginado aleatoriamente es " + numeros[contador]);
        }

    }

}
