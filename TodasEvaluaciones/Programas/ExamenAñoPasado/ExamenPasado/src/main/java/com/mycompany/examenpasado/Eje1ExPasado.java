/*
1. Realiza un programa que pida dos números enteros y realice la multiplicación de
los pares y los impares de los números comprendidos entre ambos, luego muestra
por pantalla ambos productos.
Por ejemplo, si los números introducidos son 4 y 10, el resultado sería:
El producto total de los pares es 1920
El producto total de los impares es 315
Si los números introducidos son 10 y 20, el resultado sería:
El producto total de los pares es 9676800
El producto total de los impares es 692835 */
package com.mycompany.examenpasado;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Eje1ExPasado {

    public static void main(String[] args) {

        int numero1;
        int numero2;
        int productoPar = 1;
        int productoImpar = 1;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        numero1 = lector.nextInt();

        System.out.println("Introduce el segundo numero");
        numero2 = lector.nextInt();

        for (int contador = numero1; contador <= numero2; contador++) {

            if (contador % 2 == 0) {

                productoPar = productoPar * contador;

            } else if (contador % 2 != 0) {

                productoImpar = productoImpar * contador;

            }

        }

        System.out.println("El producto de los Impares es: " + productoImpar);
        System.out.println("El producto de los pares es: " + productoPar);

    }
}
