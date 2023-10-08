/*Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.

 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays3 {

    public static void main(String[] args) {

        int numeros[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int contador = 0;

        int min = 999999999;
        int max = -999999999;

        Scanner lector = new Scanner(System.in);

        while (contador >= 0 && contador <= 9) {

            System.out.println("Introduce un numero");
            numeros[contador] = lector.nextInt();
            contador++;

        }

        for (int contador2 = 0; contador2 < numeros.length; contador2++) {

            if (min > numeros[contador2]) {
                min = numeros[contador2];
            }

        }
        for (int contador3 = 0; contador3 < numeros.length; contador3++) {
            if (max < numeros[contador3]) {
                max = numeros[contador3];
            }

        }

        System.out.println("El menor numero es: " + min);
        System.out.println("El mayor numero es: " + max);
    }
}
