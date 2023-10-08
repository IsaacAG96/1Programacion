/*17. Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último
dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
El total de números introducidos, excluido el 0.
El total de números fallados.
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = -999999999;
        int fallos = 0;
        int introducidos = 0;
        int limite = -999999999;

        Scanner lector = new Scanner(System.in);

        while (numero != 0) {

            System.out.println("Introduce un numero");
            numero = lector.nextInt();
            if (numero > limite && numero != 0) {
                limite = numero;
                introducidos++;

            } else if (numero <= limite && numero != 0) {
                fallos++;
                introducidos++;
            } else if (numero == 0) {
                System.out.println("Has fallado " + fallos + " veces");
                System.out.println("Has introducido " + introducidos + " numeros");
                break;
            }

        }

    }

}
