/*
9. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números
naturales. */
package com.mycompany.bucles;

/**
 *
 * @author DAW
 */
public class Bucles9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double suma = 0;
        double producto = 1;
        double contador = 1;

        while (contador <= 10) {

            suma = suma + contador;
            producto = producto * contador;
            contador++;
        }

        System.out.println("La suma de los 10 primeros numeros naturales es= " + suma);
        System.out.println("El producto de los 10 primeros numeros naturales es= " + producto);
    }

}
