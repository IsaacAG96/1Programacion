/*
1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego muestre todos sus valores.
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner lector = new Scanner(System.in);

        for (int contador1 = 0; contador1 <= 9; contador1++) {

            System.out.println("Introduce un numero");
            numeros[contador1] = lector.nextInt();

        }

        for (int contador2 = 0; contador2 <= 9;contador2++) {
            System.out.println("El numero en posicion " + contador2 + " es el " + numeros[contador2]);
        }

    }

}
