/*19. Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces
igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá
escribir un único asterisco.
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;
        int contador = 0;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = lector.nextInt();

        while (contador < numero) {
            if (numero > 0 && contador < numero) {

                System.out.print("*");
                contador++;

            }

        }
        if (numero < 0) {

            System.out.println("*");

        } else if (numero == 0) {
            System.out.println("El numero es 0");
        }

    }

}
