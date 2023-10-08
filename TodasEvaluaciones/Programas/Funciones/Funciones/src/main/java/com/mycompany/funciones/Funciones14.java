/*
14. Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo. */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String letra;
        int lineas;

        System.out.println("Introduce una letra");
        letra = lector.nextLine();

        System.out.println("Introduce la cantidad de lineas que quieres");
        lineas = lector.nextInt();

        piramide(letra, lineas);

    }

    public static void piramide(String letra, int lineas) {

        int aux1;
        int aux2 = 1;
        aux1 = lineas - 1;

        for (int contador1 = 0; contador1 < lineas; contador1++) {

            for (int contador2 = 0; contador2 < aux1; contador2++) {

                System.out.print(" ");

            }
            for (int contador3 = 0; contador3 < aux2; contador3++) {
                System.out.print(letra);

            }
            System.out.println("");

            aux1--;
            aux2 = aux2 + 2;

        }
    }
}
