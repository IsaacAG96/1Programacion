/*
6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
escriba M en todas sus posiciones y lo muestre por pantalla. */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tamaño;
        int relleno;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la longitud del array");
        tamaño = lector.nextInt();

        System.out.println("Introduce el numero para rellenar el array");
        relleno = lector.nextInt();

        int numeros[] = new int[tamaño];

        for (int contador1 = 0; contador1 < tamaño; contador1++) {

            numeros[contador1] = relleno;

        }
        for (int contador2 = 0; contador2 < tamaño; contador2++) {

            System.out.println("El numero de la posicion " + contador2 + " es " + numeros[contador2]);
        }

    }

}
