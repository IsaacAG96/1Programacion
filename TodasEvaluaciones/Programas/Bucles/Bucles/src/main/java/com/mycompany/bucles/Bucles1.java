/*
1. Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20). */
package com.mycompany.bucles;

/**
 *
 * @author DAW
 */
public class Bucles1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double contador = 0;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 20);
    }

}
