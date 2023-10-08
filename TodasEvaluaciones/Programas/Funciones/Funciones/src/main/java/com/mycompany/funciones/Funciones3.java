/*
 3. Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b

 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int primerNumero = 0;
        int segundoNumero = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un primer numero");
        primerNumero = lector.nextInt();
        System.out.println("Introduce un segundo numero");
        segundoNumero = lector.nextInt();

        System.out.println("El menor de los dos numeros es " + minimo(primerNumero, segundoNumero));

    }

    public static int minimo(int numero1, int numero2) {

        if (numero1 > numero2) {
            return numero2;
        } else {
            return numero1;
        }

    }
}
