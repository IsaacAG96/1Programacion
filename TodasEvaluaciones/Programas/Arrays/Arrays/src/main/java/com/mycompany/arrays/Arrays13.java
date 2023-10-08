/*
13. Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
usuario V, I además de N (nº de valores a crear).
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int inicio = 0;
        int incremento = 0;
        int cantidad = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el numero desde el que se quiere inciar");
        inicio = lector.nextInt();

        System.out.println("Introduce el incremento que quieres tener");
        incremento = lector.nextInt();

        System.out.println("Introduce la cantidad de numeros que quieres");
        cantidad = lector.nextInt();

        int numeros[] = new int[cantidad];

        for (int contador1 = 0; contador1 < cantidad; contador1++) {

            numeros[contador1] = inicio + (contador1 * incremento);

        }
        for (int contador2 = 0; contador2 < cantidad; contador2++) {

            System.out.println("En la posición " + contador2 + " del  array el valor es " + numeros[contador2]);

        }

    }

}
