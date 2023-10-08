/*
17. Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
pasándole un número entero devuelva si es primo o no. */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = lector.nextInt();

        while (numero != 0) {

            System.out.println("El numero es " + primo(numero));
            System.out.println("Introduce un numero");
            numero = lector.nextInt();

        }

    }

    public static boolean primo(int numero) {

        boolean resultado = false;
        int divisores = 0;

        for (int contador0 = 1; contador0 <= numero; contador0++) {

            if (numero % contador0 == 0) {
                divisores++;
            }

        }

        if (divisores == 2) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;

    }

}
