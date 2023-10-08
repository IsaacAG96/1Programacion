/*
1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
y luego muestre la matriz por pantalla. */
package com.mycompany.matrices;

/**
 *
 * @author DAW
 */
public class Matrices1 {

    public static void main(String[] args) {

        int numeros[][] = new int[5][5];

        int posicionX = 0;
        int posicionY = 0;
        int relleno = 1;
        int posicionX2 = 0;
        int posicionY2 = 0;
        int contador = 0;

        while (relleno <= 25) {
            if (posicionY == 5 && relleno != 25) {
                posicionX++;
                posicionY = 0;
            }

            if (relleno % 2 == 0) {
                numeros[posicionX][posicionY] = relleno;
                posicionY++;

            } else if (relleno % 2 != 0) {
                numeros[posicionX][posicionY] = relleno;
                posicionY++;

            }

            relleno++;

        }

        while (contador != 25) {

            if (posicionY2 < 5) {

                System.out.println("Numero en la posicion X= " + posicionX2 + " y posicion Y= " + posicionY2 + " es: " + numeros[posicionX2][posicionY2]);
                posicionY2++;
                contador++;
            } else if (posicionY2 == 5) {
                posicionX2++;
                posicionY2 = 0;
            }

        }

    }
}
