/*
 2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
además de si son iguales sin diferenciar entre mayúsculas y minúsculas.

 */
package com.mycompany.cadenasdetexto;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class CadenasDeTexto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadena1 = ("");
        String cadena2 = ("");

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la primera cadena");
        cadena1 = lector.nextLine();

        System.out.println("Introduce la segunda cadena");
        cadena2 = lector.nextLine();

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Ambas cadenas son iguales");
        } else {

            System.out.println("Las cadenas son diferentes");
        }

    }

}
