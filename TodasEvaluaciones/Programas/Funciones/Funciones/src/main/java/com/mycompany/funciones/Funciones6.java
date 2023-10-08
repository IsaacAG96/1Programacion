/*
6. Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double precios[] = new double[5];

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Introduce un precio");
            precios[contador] = lector.nextDouble();
        }

        for (int contador0 = 0; contador0 < precios.length; contador0++) {
            System.out.println("El precio de " + precios[contador0] + " con un 21% de IVA es " + precioConIva(precios)[contador0]);
        }

    }

    public static double[] precioConIva(double precios[]) {

        double resultado[] = new double[5];

        for (int contador3 = 0; contador3 < 5; contador3++) {
            resultado[contador3] = ((precios[contador3] * 21) / 100) + precios[contador3];

        }
        return resultado;
    }

}
