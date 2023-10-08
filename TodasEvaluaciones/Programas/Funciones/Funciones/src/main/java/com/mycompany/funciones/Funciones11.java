/*
11. Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre por
pantalla la tabla de multiplicar de dicho número.

 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = lector.nextInt();//tabla que quiero

        tablaMultiplicar(numero);

    }//fin main

    public static void tablaMultiplicar(int numero) {

        int resultado;
        for (int contador = 0; contador < 10; contador++) {//genera la tabla

            resultado = numero * (contador + 1);
            System.out.println(numero + " x " + (contador + 1) + " = " + resultado);

        }//fin for

    }//fin tablaMultiplicar

}
