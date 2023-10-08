/*
2. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello
utiliza un contador y suma de 2 en 2. */
package com.mycompany.bucles;

/**
 *
 * @author DAW
 */
public class Bucles2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double contador = 2;

        do {

            System.out.println(contador);
            contador = contador + 2;
        } while (contador >= 2 && contador <= 200);
    }

}
