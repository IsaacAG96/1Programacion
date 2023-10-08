/*
 13. Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
crear una función a la que le pasemos ambos valores y nos devuelva el descuento.
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double precioOriginal;
        double precioDescontado;

        System.out.println("Introduce el precio original");
        precioOriginal = lector.nextDouble();

        System.out.println("Introduce el precio con descuento");
        precioDescontado = lector.nextDouble();

        System.out.println("El descuento aplicado es de " + descuento(precioOriginal, precioDescontado) + " %");

    }

    public static double descuento(double precioOriginal, double precioDescontado) {

        double resultado = ((precioOriginal - precioDescontado) * 100) / precioOriginal;
        return resultado;

    }

}
