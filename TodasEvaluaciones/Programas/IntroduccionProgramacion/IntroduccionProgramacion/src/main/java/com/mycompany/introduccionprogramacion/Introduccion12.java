/*
12. Dibuja el ordinograma de un programa que lee un número y me dice si es positivo o negativo,
consideraremos el cero como positivo.
 */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = lector.nextDouble();
        if (numero >= 0) {

            System.out.println("Numero positivo");
        } else if (numero < 0) {
            System.out.println("Numero negativo");
        }
    }

}
