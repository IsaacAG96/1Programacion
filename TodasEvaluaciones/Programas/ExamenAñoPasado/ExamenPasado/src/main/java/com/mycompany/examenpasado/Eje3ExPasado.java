/*
3. Necesitamos crear un programa para almacenar en una tabla el número de huevos
puestos por dos hembras de pájaro, una es un Carbonero y la otra un Petirrojo.
Queremos almacenar las puestas de las primaveras del 2018, 2019, 2020 y 2021.
El programa tiene que utilizar un array de dos dimensiones para almacenar estos
valores.
El usuario introducirá los números de huevos puestos por teclado y luego el
programa mostrará la mínima, máxima y media para cada pájaro.
Por ejemplo, para los siguientes datos:

El programa pediría por teclado 3, 3, 4, 2 para la hembra de Carbonero y 3, 2, 0, 3
para el petirrojo e imprimiría por pantalla:
La hembra de Carbonero puso mínimo 2 huevos, máximo 4 y de media 3
La hembra de Petirrojo puso mínimo 0 huevos, máximo 3 y de media 2*/
package com.mycompany.examenpasado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Eje3ExPasado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int huevos[][] = new int[2][4];

        for (int contador0 = 0; contador0 < 2; contador0++) {

            for (int contador1 = 0; contador1 < 4; contador1++) {

                System.out.println("Introduce la cantidad de huevos");
                huevos[contador0][contador1] = lector.nextInt();
            }

        }

        Arrays.sort(huevos[0]);
        Arrays.sort(huevos[1]);
        int mediaPajaro1 = (huevos[0][0] + huevos[0][1] + huevos[0][2] + huevos[0][3]) / 4;
        int mediaPajaro2 = (huevos[1][0] + huevos[1][1] + huevos[1][2] + huevos[1][3]) / 4;

        System.out.println("La hembra de Carbonero puso mínimo " + huevos[0][0] + " huevos, máximo " + huevos[0][3] + " y de media " + mediaPajaro1);
        System.out.println("La hembra de Petirrojo puso mínimo " + huevos[1][0] + " huevos, máximo " + huevos[1][3] + " y de media " + mediaPajaro2);

    }

}
