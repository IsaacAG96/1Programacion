/*
4. Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = lector.nextInt();

        System.out.println("-1 indica negativo,0 que es igual a 0 y 1 positivo. El resultado es: " + signo(numero));

    }

    public static int signo(int numeroFuncion) {

        if (numeroFuncion > 0) {
            return 1;
        } else if (numeroFuncion < 0) {
            return -1;
        } else {
            return 0;
        }

    }

}
