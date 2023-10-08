/*
14. Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado
(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha
cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de
billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario
1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo 29 billetes de
5, que aunque sume 145 € no es el mínimo número de billetes posible). */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long dinero5 = 0;
        long dinero10 = 0;
        long dinero20 = 0;
        long dinero50 = 0;
        long dinero100 = 0;
        long dinero200 = 0;
        long dinero500 = 0;
        long dinero;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu cantidad de € ");
        dinero = lector.nextLong();

        while (dinero > 0 && dinero % 5 == 0) {
            if (dinero >= 500) {
                dinero = dinero - 500;
                dinero500++;
            } else if (dinero >= 200) {
                dinero = dinero - 200;
                dinero200++;
            } else if (dinero >= 100) {
                dinero = dinero - 100;
                dinero100++;

            } else if (dinero >= 50) {

                dinero = dinero - 50;
                dinero50++;
            } else if (dinero >= 20) {

                dinero = dinero - 20;
                dinero20++;
            } else if (dinero >= 10) {

                dinero = dinero - 10;
                dinero10++;
            } else if (dinero >= 5) {
                dinero = dinero - 5;
                dinero5++;
            }

        }

        System.out.println("Tienes " + dinero500 + " billetes de 500");
        System.out.println("Tienes " + dinero200 + " billetes de 200");
        System.out.println("Tienes " + dinero100 + " billetes de 100");
        System.out.println("Tienes " + dinero50 + " billetes de 50");
        System.out.println("Tienes " + dinero20 + " billetes de 20");
        System.out.println("Tienes " + dinero10 + " billetes de 10");
        System.out.println("Tienes " + dinero5 + " billetes de 5");
    }

}
