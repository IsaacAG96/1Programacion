/*
3. Dibuja un ordinograma que calcule el área de un cuadrado cuyo lado se introduce por teclado */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion3 {

    public static void main(String[] args) {
        float lado, area;
        Scanner l = new Scanner(System.in);

        System.out.println("Introducir lado");
        lado = l.nextFloat();

        area = lado * lado;
        System.out.println("Area=" + area);
    }
}
