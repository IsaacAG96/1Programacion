/*
5. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
Por ejemplo:
Amigo no gima
Dabale arroz a la zorra el abad
Amo la pacífica paloma
A man a plan a canal Panama

 */
package com.mycompany.cadenasdetexto;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class CadenasDeTexto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fraseInversa = ("");
        String copiar = ("");
        String frase = ("");
        String fraseMod = ("");
        Scanner lector = new Scanner(System.in);
        int posicion0 = 0;
        int posicion1 = 1;
        System.out.println("Introduce una frase");
        frase = lector.nextLine();
        fraseMod = frase.replace(" ", "");

        for (int contador1 = 0; contador1 < fraseMod.length(); contador1++) {
            copiar = fraseMod.substring(fraseMod.length() - 1 - contador1, fraseMod.length() - contador1);
            fraseInversa = fraseInversa + copiar;
        }
        if (fraseMod.equalsIgnoreCase(fraseInversa)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }

}
