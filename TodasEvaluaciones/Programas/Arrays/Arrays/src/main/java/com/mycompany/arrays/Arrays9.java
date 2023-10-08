/*
9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
mostrará en qué posiciones del array aparece N.  */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros[] = new int[100];
        int numero = 0;

        Scanner lector = new Scanner(System.in);

        for (int contador1 = 0; contador1 < 100; contador1++) {

            numeros[contador1] = (int)(1 + Math.random() * 10);

        }

        System.out.println("Introduce un numero entre 1 y 10");
        numero = lector.nextInt();

        for (int contador2 = 0; contador2 < 100; contador2++) {

            if (numero == numeros[contador2]) {
                System.out.println("Coincide con posición " +contador2);

            }
        }
    }
}
