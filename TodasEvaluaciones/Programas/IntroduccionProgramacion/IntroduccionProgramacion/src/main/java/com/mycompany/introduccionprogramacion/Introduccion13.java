/*
13. Dibuja un ordinograma de un programa que lee dos números y los visualiza en orden
ascendente. */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero1, numero2;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        numero1 = lector.nextDouble();
        System.out.println("Introduce el segundo numero");
        numero2 = lector.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);

        } else if (numero1 < numero2) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {

            System.out.println("Ambos numeros son iguales");
        }
    }

}
