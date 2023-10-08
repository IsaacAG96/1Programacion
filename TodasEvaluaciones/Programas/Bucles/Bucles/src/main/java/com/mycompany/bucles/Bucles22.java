/*
 Realiza un programa que pida un número y construya por pantalla su pirámide. */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;
        int aux1;
        int aux2 = 1;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = lector.nextInt();

        aux1 = numero - 1;

        for (int contador1 = 0; contador1 < numero; contador1++) {

            for (int contador2 = 0; contador2 < aux1; contador2++) {

                System.out.print(" ");

            }
            for (int contador3 = 0; contador3 < aux2; contador3++) {
                System.out.print("*");

            }
            System.out.println("");

            aux1--;
            aux2 = aux2 + 2;

        }
    }
}
