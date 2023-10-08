/*
5. Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int millas;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce las millas");

        millas = lector.nextInt();

        System.out.println("Las " + millas + " convertidos en Km son " + millas_a_km(millas));

    }

    public static double millas_a_km(double millasIntroducidas) {

        double constanteMillas = 1.60934;
        double km = millasIntroducidas * constanteMillas;
        return km;
    }

}
