/*
 17. Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un
array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
si son iguales o no
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int array1[] = new int[10];
        int array2[] = new int[10];

        boolean primer = false;
        boolean segundo = false;
        int contadorFallo = 0;

        Scanner lector = new Scanner(System.in);

        for (int contador1 = 0; contador1 < 2; contador1++) {

            if (primer == false) {
                for (int contador2 = 0; contador2 < 10; contador2++) {

                    System.out.println("Introduce un valor entero");
                    array1[contador2] = lector.nextInt();
                }

                primer = true;
            } else if (segundo == false) {

                for (int contador3 = 0; contador3 < 10; contador3++) {

                    System.out.println("Introduce un valor entero");
                    array2[contador3] = lector.nextInt();
                }
                segundo = true;

            }
        }

        for (int contador4 = 0; contador4 < 10; contador4++) {
            if (array1[contador4] == array2[contador4]) {

            } else if (array1[contador4] != array2[contador4]) {
                contadorFallo++;

            }

        }

        if (contadorFallo == 0) {
            System.out.println("Son iguales los arrays");

        } else {
            System.out.println("Son diferentes los arrays");

        }

    }

}
