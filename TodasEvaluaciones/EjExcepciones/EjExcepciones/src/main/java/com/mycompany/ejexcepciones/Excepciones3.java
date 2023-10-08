/*
Implementa un programa que cree un vector tipo double de tamaño 5 y luego, utilizando un bucle, pida cinco valores por teclado y los introduzca en el vector.

Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores hasta rellenar completamente el vector.
 */
package com.mycompany.ejexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Excepciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double array[] = new double[5];
        int contador = 0;

        while (contador < 5) {

            System.out.println("Introduce un numero");

            try {

                array[contador] = lector.nextDouble();
                contador++;
            } catch (InputMismatchException X) {

                System.out.println("Error : " + X);

                lector.reset();
                lector.next();
            } finally {

                System.out.println("Vuelta nº " + (contador) + " de 5");

            }

        }
    }
}

