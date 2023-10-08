/*
 8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = lector.nextInt();

        System.out.println("El sumatorio del numero " + numero + " es " + sumatorio(numero));
        System.out.println("El producto de1 hasta el numero " + numero + " es " + productos(numero));

        System.out.println("El numero intermedio entre 1 y " + numero + " es " + intermedio(numero));

    }

    public static int sumatorio(int numero) {

        int sumatorioAux = 0;

        for (int contador1 = 0; contador1 < numero; contador1++) {

            sumatorioAux = sumatorioAux + (contador1 + 1);

        }
        return sumatorioAux;

    }

    public static int productos(int numero) {

        int productoAux = 1;
        for (int contador2 = 0; contador2 < numero; contador2++) {

            productoAux = productoAux * (contador2 + 1);
        }
        return productoAux;
    }

    public static double intermedio(double numero) {

        double intermedioAux;
        intermedioAux = numero / 2;
        return intermedioAux;

    }

}
