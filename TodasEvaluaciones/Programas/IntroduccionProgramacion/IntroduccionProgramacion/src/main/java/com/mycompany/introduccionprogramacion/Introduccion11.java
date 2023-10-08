/*
11. Dibuja el ordinograma de un programa que lee 2 números y muestra el mayor. */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero1, numero2;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        numero1 = lector.nextDouble();
        System.out.println("Introduce el segundo numero");
        numero2 = lector.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El mayor es:" + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El mayor es:" + numero2);
        } else {
            System.out.println("Son iguales ambos numeros");
        }
    }

}
