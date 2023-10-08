/*Implementa un programa en lenguaje Java, 
que cree una matriz de tamaño M x N (valores introducidos por teclado, no es necesario comprobarlos)
y la rellene con números enteros aleatorios entre -5 y 5. Luego mostrará por pantalla la suma de valores
de cada fila y de cada columna por separado.
 */
package com.mycompany.examen1;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Eje3exa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el para X");
        int X = lector.nextInt();

        System.out.println("Introduce el para Y");
        int Y = lector.nextInt();

        int numeros[][] = new int[X][Y];

        for (int contador0 = 0; contador0 < X; contador0++) {
            int sumaFila = 0;//reset acumulador
            for (int contador1 = 0; contador1 < Y; contador1++) {

                numeros[contador0][contador1] = (int) Math.round(Math.random() * (5 - -5) + -5);//generador entre -5 y 5

                sumaFila = sumaFila + numeros[contador0][contador1];//acumulador suma por filas

            }//fin for
            System.out.println("La suma de la fila " + contador0 + " es " + sumaFila);
        }//fin for

        for (int contador3 = 0; contador3 < X; contador3++) {
            int sumaColumna = 0;//reset acumulador
            for (int contador4 = 0; contador4 < Y; contador4++) {

                sumaColumna = sumaColumna + numeros[contador4][contador3];//acumulador suma por columnas

            }//fin
            System.out.println("La suma de la columna " + contador3 + " es " + sumaColumna);
        }//fin for

    }

}
