/*
16. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().

 */
package com.mycompany.arrays;

import java.util.Arrays;

/**
 *
 * @author DAW
 */
public class Arrays16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = new int[55];
        int inicial = 0;
        int contador2 = 0;

        int posicion1 = 0;
        int posicion2 = 1;

        for (int contador1 = 0; contador1 < 10; contador1++) {
            inicial++;
            contador2 = 0;

            while (contador2 < 1) {
                Arrays.fill(numeros, posicion1, posicion2, inicial);
                posicion1 = posicion1 + inicial;
                posicion2 = posicion2 + inicial + 1;
                contador2++;
            }
        }

        for (int contador3 = 0; contador3 < 55; contador3++) {

            System.out.println("En la posición " + contador3 + " del  array el valor es " + numeros[contador3]);

        }
    }

}
