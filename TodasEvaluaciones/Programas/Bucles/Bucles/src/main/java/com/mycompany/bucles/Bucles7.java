/*
7. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando
cuántos son positivos y cuantos negativos.  */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double positivo = 0;
        double negativo = 0;
        double contador = 1;
        double numero;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");

        while (contador <= 10) {
            contador++;
            numero = lector.nextDouble();
            if (numero >= 0) {
                positivo++;
            } else if (numero < 0) {
                negativo++;
            }

        }

        System.out.println("Hay " + positivo + " numeros positivos");
        System.out.println("Hay " + negativo + " numeros negativos");
    }

}
