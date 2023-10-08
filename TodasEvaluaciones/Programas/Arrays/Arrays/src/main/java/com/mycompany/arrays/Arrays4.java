/*
4. Crea un programa que pida veinte números enteros por teclado, los almacene en un array y
luego muestre por separado la suma de todos los valores positivos y negativos. */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int suma = 0;

        Scanner lector = new Scanner(System.in);

        for (int contador1 = 0; contador1 <= 19; contador1++) {

            System.out.println("Introduce un numero");
            numeros[contador1] = lector.nextInt();

        }

        for (int contador2 = 0; contador2 <= 19; contador2++) {

            suma = suma + numeros[contador2];

        }
        System.out.println("La suma total es: " + suma);

    }

}
