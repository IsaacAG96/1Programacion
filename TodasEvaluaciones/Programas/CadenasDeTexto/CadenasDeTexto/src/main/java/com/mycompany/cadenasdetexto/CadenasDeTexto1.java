/*
1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
de la cadena en una línea distinta.
 */
package com.mycompany.cadenasdetexto;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class CadenasDeTexto1 {

    public static void main(String[] args) {

        String cadena = ("");
        String[] palabras;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto");
        cadena = lector.nextLine();

        palabras = cadena.split(" ");

        for (int contador = 0; contador < palabras.length; contador++) {

            System.out.println(palabras[contador]);

        }

    }

}
