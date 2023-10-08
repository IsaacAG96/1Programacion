/*
Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de Scanner),calcule A/B y muestre el resultado por pantalla.

Se deberán tratar de forma independiente las dos posibles excepciones, InputMismatchException y ArithmeticException, mostrando
en cada caso un mensaje de error diferente en cada caso.
 */
package com.mycompany.ejexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int A;
        int B;

        try {
            System.out.println("Introduce valor entero para A");
            A = lector.nextInt();

            System.out.println("Introduce valor entero para B");
            B = lector.nextInt();
            try {//INTENTA LEER LO INTRODUCIDO

                int division = A / B;
                System.out.println("Resultado de la división : " + division);

            } catch (ArithmeticException Y) {//SI SE DIVIDE ENTRE 0
                System.out.println("No se puede dividir " + A + " entre " + B + ". Error: " + Y);

            }
        } catch (InputMismatchException X) {//SI NO ES UN NUMERO ENTERO,DARA FALLO Y MOSTRARA CUAL ES
            
            System.out.println("Introduce un valor valido . Error: " + X);
            
        } finally {//MUESTRA ESTE MENSAJE SIEMPRE DESPUES DEL TRY Y CATCH
            System.out.println("Programa acabado");
        }

    }

}
