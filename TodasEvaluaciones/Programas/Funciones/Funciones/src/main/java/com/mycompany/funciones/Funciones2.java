/*
 2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int edad = 0;

        System.out.println("Introduce tu edad");
        edad = lector.nextInt();

        System.out.println("Mayor de edad: " + comparacionEdad(edad));

    }

    public static boolean comparacionEdad(int edad) {

        if (edad >= 18) {//mayor que 18
            return true;

        } else {//menor que 18
            return false;
        }

    }
}
