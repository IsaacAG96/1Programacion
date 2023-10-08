/*
 9. Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
tres) y nos devuelva el máximo de los dos valores.
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero1 = lector.nextInt();

        System.out.println("Introduce un numero");
        int numero2 = lector.nextInt();

        System.out.println("Introduce un numero");
        int numero3 = lector.nextInt();

        System.out.println("El numero mayor entre " + numero1 + " , " + numero2 + " y " + numero3 + " es "
                + comparacion(comparacion(numero1, numero2), numero3));

    }

    public static int comparacion(int numero1, int numero2) {

        int resultado;

        if (numero1 > numero2) {

            resultado = numero1;
            return resultado;

        } else {
            resultado = numero2;
            return resultado;
        }

    }

}
