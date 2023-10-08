/*
    2. Crea un programa para realizar cálculos relacionados con el nombre de las 
mujeres asesinadas. Primero te pedirá el número de mujeres, M y luego almacenará en un array,
M nombres introducidos por teclado. Al final te mostrará:
        ◦ la longitud del nombre más corto,
        ◦ longitud media,
        ◦ longitud máxima,
        ◦ y cuántas mujeres tenían nombres, de longitud por debajo de la media.
 */
package com.mycompany.examen1;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Eje2exa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double longitud = 0;
        int min = 99999;
        int max = -99999;
        int debajoMedia = 0;

        System.out.println("Introduce el numero de mujeres asesinadas");
        int muertes = lector.nextInt();

        String mujeres[] = new String[muertes];

        for (int contador0 = 0; contador0 < muertes; contador0++) {//rellena array
            System.out.println("Introduce el nombre de una mujer");

            mujeres[contador0] = lector.next();

        }//fin for

        for (int contador1 = 0; contador1 < muertes; contador1++) {//suma longitud total

            String nombre = mujeres[contador1];

            longitud = longitud + nombre.length();
        }//fin for

        double longitudMedia = longitud / muertes;
        System.out.println("La longitud media es " + longitudMedia);

        for (int contador1 = 0; contador1 < muertes; contador1++) {//longitud maxima y mas corta

            String nombre = mujeres[contador1];
            if (nombre.length() < min) {//buscar minimo
                min = nombre.length();

            } else if (max < nombre.length()) {//buscar maximo

                max = nombre.length();
            }

        }//fin for

        System.out.println("La longitud minima es " + min);
        System.out.println("La longitud maxima es " + max);

        for (int contador1 = 0; contador1 < muertes; contador1++) {//longitud maxima y mas corta

            String comparar = mujeres[contador1];
            if (comparar.length() < longitudMedia) {//buscar minimo
                debajoMedia = debajoMedia + 1;

            } //fin if

        }//fin for

        System.out.println("Hay " + debajoMedia + " nombres por debajo de la media");

    }

}
