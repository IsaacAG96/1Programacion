/*
2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
 */
package com.mycompany.matrices;

/**
 *
 * @author DAW
 */
public class Matrices2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tabla[][] = new int[10][10];

        int posicionX = 0;
        int posicionY = 0;
        int contador = 0;

        while (posicionY <= 10) {
            if (posicionX == 10) {
                break;
            } else if (posicionY < 10) {
                tabla[posicionX][posicionY] = (posicionX + 1) * (posicionY + 1);
                posicionY++;
            } else if (posicionY == 10) {
                posicionX++;
                posicionY = 0;

            }

        }
        posicionX = 0;
        posicionY = 0;

        while (contador != tabla.length) {

            if (posicionX == 10) {
                break;
            } else if (posicionY < 10) {
                System.out.println((posicionX + 1) + " x " + (posicionY + 1) + " = " + tabla[posicionX][posicionY]);
                posicionY++;
            } else if (posicionY == 10) {
                posicionX++;
                posicionY = 0;

            }

        }
    }
}
