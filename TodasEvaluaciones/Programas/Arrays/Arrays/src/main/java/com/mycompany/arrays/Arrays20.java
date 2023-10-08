/*
20. Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se
mostrará por pantalla si N existe en el array, además de cuantas veces.

 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros[] = new int[1000];
        int coincidencia = 0;
        int peticion = 0;

        for (int contador1 = 0; contador1 < numeros.length; contador1++) {

            numeros[contador1] = (int) (Math.random() * 100);

        }

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero del 0 al 99");

        peticion = lector.nextInt();

        for (int contador2 = 0; contador2 < numeros.length; contador2++) {

            if (peticion == numeros[contador2]) {
                coincidencia++;
                System.out.println("El numero aparece en la  posicion: " + contador2);

            }
        }
        System.out.println("El numero aparece " + coincidencia + " veces");

    }

}
