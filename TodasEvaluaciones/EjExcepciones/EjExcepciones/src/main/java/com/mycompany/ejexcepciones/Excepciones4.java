/*
Implementa un programa que cree un vector de enteros de tamaño N (número aleatorio entre 1 y 100) con valores aleatorios entre 1 y 10.

Luego se le preguntará al usuario qué posición del vector quiere mostrar por pantalla, repitiéndose una y otra vez hasta que se
introduzca un valor negativo.

Maneja todas las posibles excepciones.
 */
package com.mycompany.ejexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Excepciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int array[] = new int[(int) Math.round((Math.random() * 99) + 1)];

        for (int contador = 0; contador < array.length; contador++) {
            array[contador] = (int) Math.round((Math.random() * 9) + 1);
        }

        int posicion = 0;
        while (posicion >= 0) {
            System.out.println("El array tiene " + array.length);
            System.out.println("Introduce una posicion del array que quieras ver.");
            System.out.println(" Si es negativo se saldra del bucle");

            try {
                posicion = lector.nextInt();
                negativo(posicion);
                System.out.println("En la " + posicion + " hay " + array[posicion]);

            } catch (ExcepcionPropia X) {
                System.out.println("Has seleccionado salir del programa");

            } catch (InputMismatchException X) {
                System.out.println("Error : " + X);
                System.out.println("Valor invalido");
                X.printStackTrace();

            } catch (ArrayIndexOutOfBoundsException X) {
                System.out.println("Error : " + X);
                System.out.println("Introduce una posicion valida");
                X.printStackTrace();
            } finally {
                System.out.println("----------------------------");
            }

        }

    }

    private static void negativo(int posicion) throws ExcepcionPropia {

        if (posicion < 0) {

            throw new ExcepcionPropia(posicion);

        }
    }

}
