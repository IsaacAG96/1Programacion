/*
4. Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá
por teclado. */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero;
        double contador = 1;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = lector.nextDouble();

        do {
            System.out.println(contador);
            contador++;
        } while (contador <= numero);
    }

}
