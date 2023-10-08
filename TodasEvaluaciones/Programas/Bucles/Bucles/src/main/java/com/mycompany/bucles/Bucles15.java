/*15. Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
introducimos por teclado.
 */

package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles15 {

    public static void main(String[] args) {
       int numero;
        int multiplos = 0;
        int cont = 1;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = lector.nextInt();

        while (numero > cont) {
            if (cont % 3 == 0) {

                multiplos++;
                cont++;
            } else {
                cont++;

            }

        }

        System.out.println("Tienes " + multiplos + " multiplos de 3");

    }
}
