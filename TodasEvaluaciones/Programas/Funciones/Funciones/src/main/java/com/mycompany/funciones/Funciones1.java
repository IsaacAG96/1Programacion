/*
 * 1. Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la función:
double multiplica(double a, double b) // Devuelve la multiplicación de dos números
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones1 {

    public static void main(String[] args) {
        int primerNumero = 0;
        int segundoNumero = 0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        primerNumero = lector.nextInt();
        System.out.println("Introduce el segundo numero");
        segundoNumero = lector.nextInt();

        System.out.println("El resultado de multiplicar " + primerNumero + " por " + segundoNumero + " es " + multiplicar(primerNumero, segundoNumero));

    }

    public static int multiplicar(int numero1, int numero2) {

        int resultado = numero1 * numero2;
        return resultado;

    }
}
