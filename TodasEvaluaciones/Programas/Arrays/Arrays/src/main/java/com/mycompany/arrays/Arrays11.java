/*
 11. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 */
package com.mycompany.arrays;

/**
 *
 * @author DAW
 */
public class Arrays11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int array1[] = new int[100];
        int array2[] = new int[100];

        int contador2 = 0;
        int contador3 = 99;

        for (int contador1 = 0; contador1 < 100; contador1++) {

            array1[contador1] = contador1 + 1;

        }

        while (contador2 < 100) {

            array2[contador2] = array1[contador3];
            contador2++;
            contador3--;

        }

        for (int contador4 = 0; contador4 < 100; contador4++) {

            System.out.println("En la posición " + contador4 + " del primer array el valor es " + array1[contador4]);
            System.out.println("En la posición " + contador4 + " del segundo array el valor es " + array2[contador4]);

        }

    }
}
