/*
13. Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta
adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el
usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado). */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 50;

        int pista = 0;
        int minimo = 1;
        int maximo = 100;

        Scanner lector = new Scanner(System.in);
        System.out.println("Piensa un numero del 1 al 100");

        System.out.println("Introduce 1 si es mayor,2 si es menor o 3 si es igual que " + contador);

        while (contador >= 1 || contador <= 100) {

            pista = lector.nextInt();

            if (pista == 3) {
                System.out.println("Tu numero es " + contador);
                break;
            } else if (pista == 1 && contador >= 1 && contador <= 100) {

                minimo = contador;
                contador = (maximo + minimo) / 2;

                System.out.println("Introduce 1 si es mayor,2 si es menor o 3 si es igual que " + contador);

                pista = 0;

            } else if (pista == 2 && contador >= 1 && contador <= 100) {
                maximo = contador;
                contador = (maximo + minimo) / 2;

                System.out.println("Introduce 1 si es mayor,2 si es menor o 3 si es igual que " + contador);

                pista = 0;

            }
        }
    }

}
