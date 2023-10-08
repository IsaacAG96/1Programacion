/*
19. Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de
ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los
jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las
puntuaciones en orden descendente (de la más alta a la más baja).

 */
package com.mycompany.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int ranking[] = new int[8];
        int ranking2[] = new int[8];
        int contador3 = 0;
        int contador4 = 7;

        Scanner lector = new Scanner(System.in);

        for (int contador1 = 0; contador1 < ranking.length; contador1++) {

            System.out.println("Introduce la puntuacion del jugador " + contador1);
            ranking[contador1] = lector.nextInt();

        }
        Arrays.sort(ranking);

        while (contador3 < ranking2.length) {

            ranking2[contador3] = ranking[contador4];
            contador4--;
            contador3++;

        }

        for (int contador2 = 0; contador2 < ranking.length; contador2++) {

            System.out.println("En la posición " + contador2 + " del  ranking la puntuacion  es " + ranking2[contador2]);

        }

    }

}
