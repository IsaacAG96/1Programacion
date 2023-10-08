/*
14. Dibuja un ordinograma que lee dos números y nos dice cuál es el mayor o si son iguales */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero1, numero2;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce primer numero");
        numero1 = lector.nextDouble();
        System.out.println("Introduce segundo numero");
        numero2 = lector.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El mayor es " + numero1);

        } else if (numero2 > numero1) {
            System.out.println("El mayor es " + numero2);
        } else {
            System.out.println("Ambos son iguales");
        }
    }

}
