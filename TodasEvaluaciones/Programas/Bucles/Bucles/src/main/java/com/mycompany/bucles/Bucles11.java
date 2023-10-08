/*
11. Realiza un programa que sume independientemente los pares y los impares de los números
comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
 */
package com.mycompany.bucles;

/**
 *
 * @author DAW
 */
public class Bucles11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pares = 0;
        double impares = 0;
        int contador = 100;

        while (contador <= 200) {
            if (contador % 2 == 0) {

                pares = pares + contador;
                System.out.println("Nº " + contador + " suma par= " + pares);
                contador++;
            } else if (contador % 2 != 0) {
                impares = impares + contador;
                System.out.println("Nº " + contador + " suma impar= " + impares);
                contador++;
            }
        }
        System.out.println("La suma total de los pares es= " + pares);
        System.out.println("La suma total de los impares es= " + impares);
    }

}
