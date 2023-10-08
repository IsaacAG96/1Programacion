/*
 4. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0

 */
package com.mycompany.cadenasdetexto;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class CadenasDeTexto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int A = 0;
        int E = 0;
        int I = 0;
        int O = 0;
        int U = 0;
        int posicion1 = 0;
        int posicion2 = 1;
        String frase = ("");
        String comparar = ("");

        String vocales[] = {"A", "E", "I", "O", "U"};

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una frase");

        frase = lector.nextLine();

        for (int contador1 = 0; contador1 < frase.length(); contador1++) {

            comparar = frase.substring(posicion1, posicion2);

            if (vocales[0].equalsIgnoreCase(comparar)) {
                A++;

            } else if (vocales[1].equalsIgnoreCase(comparar)) {
                E++;

            } else if (vocales[2].equalsIgnoreCase(comparar)) {
                I++;

            } else if (vocales[3].equalsIgnoreCase(comparar)) {

                O++;

            } else if (vocales[4].equalsIgnoreCase(comparar)) {
                U++;

            }
            posicion1++;
            posicion2++;

        }

        System.out.println("Hay " + A + " nº de A");
        System.out.println("Hay " + E + " nº de E");
        System.out.println("Hay " + I + " nº de I");
        System.out.println("Hay " + O + " nº de O");
        System.out.println("Hay " + U + " nº de U");

    }

}
