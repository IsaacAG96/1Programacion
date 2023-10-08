/*
 14. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
muestre por pantalla.
 */
package com.mycompany.arrays;

/**
 *
 * @author DAW
 */
public class Arrays14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros[] = new int[55];
        int inicial = 0;
        int contador2 = 0;
        int contador3 = 0;

        for (int contador1 = 0; contador1 < 10; contador1++) {
            inicial++;
            contador2 = 0;

            while (contador2 < inicial) {
                numeros[contador3] = inicial;
                contador2++;
                contador3++;

            }
        }

        for (int contador4 = 0; contador4 < 55; contador4++) {

            System.out.println("En la posición " + contador4 + " del  array el valor es " + numeros[contador4]);

        }

    }

}
