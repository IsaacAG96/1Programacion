/*
8. Dibuja un ordinograma de un programa que pide la edad por teclado y nos muestra el mensaje
de “Eres mayor de edad” solo si lo somos. */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double edad;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad = lector.nextDouble();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
        }
    }

}
