/*
Implementa un programa con tres funciones:

◦ void imprimePositivo(int p): Imprime el valor p. Lanza una ‘Exception’ si p < 0
◦ void imprimeNegativo(int n): Imprime el valor n. Lanza una ‘Exception’ si p >= 0

◦ La función main para realizar pruebas. Puedes llamar a ambas funciones varias veces con 
distintos valores, hacer un bucle para pedir valores por teclado y pasarlos a las funciones,etc. 

Maneja las posibles excepciones.

 */
package com.mycompany.ejexcepciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Excepciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        try {
            System.out.println("Introduce un numero positivo");
            int p = lector.nextInt();
            System.out.println("----------------------------------");
            imprimePositivo(p);
        } catch (ExcepcionPropia X) {//muestra error si es negativo
            System.out.println("Error: " + X);

        }

        try {
            System.out.println("Introduce un numero negativo");
            int n = lector.nextInt();
            System.out.println("----------------------------------");
            imprimeNegativo(n);

        } catch (ExcepcionPropia X) {//muestra error si es positivo
            System.out.println("Error: " + X);

        }
    }

    private static void imprimePositivo(int p) throws ExcepcionPropia { //funcion para comprobar si es positivo,si no lo es da fallo

        if (p >= 0) {
            System.out.println("Es correcto : " + p);
            System.out.println("----------------------------------");

        } else {

            System.out.println("Solo se muestran positivos");
            System.out.println("----------------------------------");
            throw new ExcepcionPropia(p);

        }

    }

    private static void imprimeNegativo(int n) throws ExcepcionPropia {//funcion para comprobar si es negativo,si no lo es da fallo

        if (n < 0) {
            System.out.println("Es correcto : " + n);
            System.out.println("----------------------------------");

        } else {
            System.out.println("Solo se muestran negativos");
            System.out.println("----------------------------------");
            throw new ExcepcionPropia(n);

        }
    }

}
