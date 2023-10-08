/*
3. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez
utiliza un contador sumando de 1 en 1.  */
package com.mycompany.bucles;

/**
 *
 * @author DAW
 */
public class Bucles3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double contador = 0;
        do {
            contador++;
            if (contador % 2 == 0) {
                System.out.println(contador);

            }

        } while (contador <= 200);

    }

}
