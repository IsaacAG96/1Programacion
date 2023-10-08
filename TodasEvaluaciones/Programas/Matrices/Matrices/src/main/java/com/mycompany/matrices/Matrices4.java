/*
4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
programa mostrará la nota mínima, máxima y media de cada alumno. */
package com.mycompany.matrices;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Matrices4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int notas[][] = new int[4][5];//[cantidad alumnos][numero de asignatura]
        int posicionX = 0;
        int posicionY = 0;

        Scanner lector = new Scanner(System.in);

        while (posicionY <= 5) {
            if (posicionX == 4) {
                break;
            } else if (posicionY < 5) {

                System.out.println("Introduce una nota para el alumno " + posicionX);
                notas[posicionX][posicionY] = lector.nextInt();
                posicionY++;
            } else if (posicionY == 5) {
                posicionX++;
                posicionY = 0;

            }

        }

        posicionY = 0;
        posicionX = 0;
        while (posicionY <= 4) {
            if (posicionX == 5) {
                break;
            } else if (posicionY < 4) {
                System.out.println("La nota numero " + posicionY + " del alumno" + posicionX + " es " + notas[posicionX][posicionY]);

                posicionY++;
            } else if (posicionY == 4) {
                posicionX++;
                posicionY = 0;

            }

        }//fin while

    }
}
