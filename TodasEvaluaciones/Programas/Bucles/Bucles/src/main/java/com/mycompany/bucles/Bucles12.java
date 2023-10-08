/*
12. Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
pantalla. */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double A;
        double B;
        double contador = 0;
        double resultado = 1;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce numero");
        A = lector.nextDouble();
        System.out.println("¿A cuanto lo elevas?");
        B = lector.nextDouble();

        while (contador != B) {

            resultado = resultado * A;
            contador++;
        }
        System.out.println("Resultado es= " + resultado);
    }

}
