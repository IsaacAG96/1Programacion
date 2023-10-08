/*
12. Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
millas.
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double km;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce los kilometros");

        km = lector.nextDouble();

        System.out.println("Los " + km + " convertidos en millas son " + km_a_millas(km));

    }

    public static double km_a_millas(double kmIntroducidas) {
        double constanteMillas = 1.60934;

        double millas = kmIntroducidas / constanteMillas;
        return millas;
    }
}
