/*
10. Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10. */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota = 1;
        double nota10 = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una nota");

        while (nota != -1) {
            nota = lector.nextDouble();
            if (nota == 10) {
                System.out.println("Nota es: " + nota);
                nota10++;
            } else if (10 > nota) {
                System.out.println("Nota es: " + nota);
            }

        }
        System.out.println("Hay " + nota10 + " notas de 10");
    }

}
