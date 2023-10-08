/*
 * 10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
por debajo de la media.
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad;
        double media = 0;
        double maxima = -999;
        double minima = 999;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una cantidad");

        cantidad = lector.nextInt();
        double alturas[] = new double[cantidad];

        for (int contador1 = 0; contador1 < cantidad; contador1++) {

            System.out.println("Introduce una altura en metros");
            alturas[contador1] = lector.nextDouble();
        }

        for (int contador2 = 0; contador2 < cantidad; contador2++) {
            media = media + alturas[contador2];

        }

        media = media / cantidad;

        System.out.println("La media es: " + media);

        for (int contador3 = 0; contador3 < cantidad; contador3++) {

            if (maxima < alturas[contador3]) {
                maxima = alturas[contador3];
            }

        }

        System.out.println("La maxima es: " + maxima);

        for (int contador4 = 0; contador4 < cantidad; contador4++) {

            if (minima > alturas[contador4]) {
                minima = alturas[contador4];
            }

        }
        System.out.println("La minima es: " + minima);

    }

}
