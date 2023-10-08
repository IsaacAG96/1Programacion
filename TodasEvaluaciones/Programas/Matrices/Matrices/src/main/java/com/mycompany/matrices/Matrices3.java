/*
3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero */
package com.mycompany.matrices;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Matrices3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int posicionX = 0;
        int posicionY = 0;
        int tamañoX;
        int tamañoY;
        int comprobar = 0;
        int cero = 0;
        int mayor = 0;
        int menor = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce coordenada X");
        tamañoX = lector.nextInt();

        System.out.println("Introduce coordenada Y");
        tamañoY = lector.nextInt();

        int tabla[][] = new int[tamañoX][tamañoY];

        while (posicionY <= tamañoY) {
            if (posicionX == tamañoX) {
                break;
            } else if (posicionY < tamañoY) {

                System.out.println("Introduce un numero");
                tabla[posicionX][posicionY] = lector.nextInt();
                posicionY++;
            } else if (posicionY == tamañoY) {
                posicionX++;
                posicionY = 0;

            }

        }//fin bucle while para rellenar tabla
        posicionY = 0;
        posicionX = 0;
        while (posicionY <= tamañoY) {
            if (posicionX == tamañoX) {
                break;
            } else if (posicionY < tamañoY) {
                comprobar = tabla[posicionX][posicionY];
                if (comprobar == 0) {//IGUAL A 0
                    cero++;

                } else if (comprobar < 0) {// MENOR QUE 0
                    menor++;
                } else if (comprobar > 0) {//MAYOR QUE 0
                    mayor++;
                }

                posicionY++;
            } else if (posicionY == tamañoY) {
                posicionX++;
                posicionY = 0;

            }

        }//fin bucle while para contar numeros mayores,menores o iguales a 0

        System.out.println("Hay " + cero + " numeros iguales a 0");
        System.out.println("Hay " + mayor + " numeros mayores que 0");
        System.out.println("Hay " + menor + " numeros menores que 0");

    }
}
