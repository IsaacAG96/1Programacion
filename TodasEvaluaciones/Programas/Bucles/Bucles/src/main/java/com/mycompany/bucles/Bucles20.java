/*20. Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla
los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su
valor.
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;
        int contador = 1;
        int repetir = 0;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 20");

        numero = lector.nextInt();

        while (contador <= numero) {

            if (repetir != contador) {

                System.out.print(" " + contador + " ");
                repetir++;
            } else if (repetir == contador) {
                repetir = 0;
                contador++;
                System.out.println("");
            }

        }

    }

}
