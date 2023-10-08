/*21. Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza
los números desde A hasta B e indicar cuantos hay que sean pares.
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int contador1;
        int contador2 = 0;
        int pares = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el numero ");
        numero1 = lector.nextInt();

        System.out.println("Introduce un numero mayor al anterior");
        numero2 = lector.nextInt();

        contador1 = numero1;

        while (contador1 <= numero2) {

            System.out.println(contador1);
            contador1++;

            if (contador1 % 2 == 0) {
                pares++;
            }

        }
        System.out.println("Hay " + pares + " numeros pares en el intervalo");

    }

}
