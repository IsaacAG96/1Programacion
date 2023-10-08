/*
5. Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2)........* 3*2*1
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero;
        double contador = 1;
        double factorial = 1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero positivo");
        numero = lector.nextDouble();

        if (numero > 0) {
            while (contador <= numero) {
                factorial = factorial * contador;
                contador++;
            }

            System.out.println("Factorial de " + numero + " es " + factorial);

        }
    }

}
