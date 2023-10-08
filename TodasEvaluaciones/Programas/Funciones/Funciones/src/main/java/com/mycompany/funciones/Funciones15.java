/*
15. Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
Luego muestra la suma total y la media. Implementa una función que calcule la suma de un
array y otra que calcule la media de un array */
package com.mycompany.funciones;

/**
 *
 * @author isaac
 */
public class Funciones15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros[] = new int[100];

        for (int contador0 = 0; contador0 < numeros.length; contador0++) {

            numeros[contador0] = contador0 + 1;

        }

        sumaArray(numeros);
        mediaArray(numeros);

    }

    public static void sumaArray(int numeros[]) {

        int resultado = 0;
        for (int contador1 = 0; contador1 < numeros.length; contador1++) {
            resultado = resultado + numeros[contador1];

        }

        System.out.println("La suma de todos los 100 primeros numeros enteros es: " + resultado);

    }

    public static void mediaArray(int numeros[]) {
        int resultado = 0;

        for (int contador1 = 0; contador1 < numeros.length; contador1++) {
            resultado = resultado + numeros[contador1];

        }
        resultado = resultado / numeros.length;

        System.out.println("La media de todos los 100 primeros numeros enteros es: " + resultado);

    }

}
