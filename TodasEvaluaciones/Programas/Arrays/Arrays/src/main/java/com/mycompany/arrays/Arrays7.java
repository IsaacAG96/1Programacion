/*
7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
todos los valores desde P hasta Q, y lo muestre por pantalla. */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeroMenor;
        int numeroMayor;
        int contador1 = 0;
        int memoria = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numeroMenor = lector.nextInt();

        System.out.println("Introduce un numero mayor que el anterior");
        numeroMayor = lector.nextInt();

        int diferencia = (numeroMayor - numeroMenor)+1;
        int numeros[] = new int[diferencia];

        while (contador1 < diferencia) {

            memoria = numeroMenor + contador1;
            numeros[contador1] = memoria;
            contador1++;

        }
        for (int contador2 = 0; contador2 < diferencia; contador2++) {

            System.out.println("El numero en posición " + contador2 + " es " + numeros[contador2]);

        }

    }
}
