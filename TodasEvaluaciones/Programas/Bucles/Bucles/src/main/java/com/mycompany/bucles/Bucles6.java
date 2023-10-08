/*
6. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leído
algún número negativo o no. */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double negativo = 0;
        double contador = 1;
        double numero;
        Scanner lector = new Scanner(System.in);

        while (contador <= 10) {
            System.out.println("Introduce un numero");
            numero = lector.nextDouble();
            contador++;

            if (numero < 0 && contador <= 10) {
                negativo++;

            } else if (numero >= 0 && contador <= 10) {

            }

        }
        System.out.println("Cantidad numeros negativos=" + negativo);
    }

}
