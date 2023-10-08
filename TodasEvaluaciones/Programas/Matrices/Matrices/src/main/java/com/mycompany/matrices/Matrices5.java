/*
5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
información de N personas distintas (valor también introducido por teclado). Para cada
persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
género. */
package com.mycompany.matrices;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Matrices5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadPersonas;
        Scanner lector = new Scanner(System.in);

        int contador = 0;
        int cantidadMujeres = 0;
        int cantidadHombres = 0;
        double dineroMujeres = 0;
        double dineroHombres = 0;
        int selector = 2;
        int cantidadTotal = 0;

        System.out.println("Introduce cantidad de personas");
        cantidadTotal = lector.nextInt();

        double salario[][] = new double[2][cantidadTotal];

        while (contador < cantidadTotal) {
            System.out.println("Introduce 0 para varon o 1 para mujer");
            selector = lector.nextInt();
            switch (selector) {

                case 0:

                    System.out.println("Introduce su salario");
                    salario[0][contador] = lector.nextInt();

                    cantidadMujeres++;
                    dineroMujeres = dineroMujeres + salario[0][contador];
                    contador++;
                    break;

                case 1:
                    System.out.println("Introduce su salario");

                    salario[1][contador] = lector.nextInt();
                    cantidadHombres++;
                    dineroHombres = dineroHombres + salario[1][contador];
                    contador++;
                    break;

            }

        }
        System.out.println("El sueldo medio de las mujeres es: " + (dineroMujeres / cantidadMujeres) + " €");
        System.out.println("El sueldo medio de los Hombres es: " + (dineroHombres / cantidadHombres) + " €");

    }

}
