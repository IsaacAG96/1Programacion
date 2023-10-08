/*
 18. Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0
y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por
pantalla.

 */
package com.mycompany.arrays;

import java.util.Arrays;

/**
 *
 * @author DAW
 */
public class Arrays18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double numeros[] = new double[30];

        for (int contador1 = 0; contador1 < 30; contador1++) {

            numeros[contador1] = Math.random() * 10;

        }

        Arrays.sort(numeros);

        for (int contador2 = 0; contador2 < 30; contador2++) {

            System.out.println("El numero de la posicion " + contador2 + " es " + numeros[contador2]);
        }

    }

}
