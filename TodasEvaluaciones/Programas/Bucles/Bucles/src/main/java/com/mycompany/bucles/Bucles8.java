/*
8. Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y
luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos. */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero = 1;
        double negativo = 0;
        double positivo = 0;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");

        while (numero != 0) {

            numero = lector.nextDouble();
            if (numero < 0) {
                negativo++;
                System.out.println(numero + " Es negativo.");
                System.out.println("Introduce otro numero");

            } else if (numero > 0) {
                positivo++;
                System.out.println("Introduce otro numero");

            }
            System.out.println("Hay " + negativo + " numeros negativos");
            System.out.println("Hay " + positivo + " numeros positivos");

        }
    }

}
