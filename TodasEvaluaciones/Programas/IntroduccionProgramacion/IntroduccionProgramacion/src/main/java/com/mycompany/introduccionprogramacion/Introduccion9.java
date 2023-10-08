/*
9. Dibuja un ordinograma de un programa que pide la edad por teclado y nos muestra el mensaje
de “eres mayor de edad” o el mensaje de “eres menor de edad” */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion9 {

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
        } else if (edad < 18) {

            System.out.println("Eres menor de edad");
        }
    }

}
