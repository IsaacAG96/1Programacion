/*
4. Dibuja un ordinograma que lea dos números, calcule y muestre el valor de sus suma, resta,
producto y división. */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float lado, area;
        Scanner l = new Scanner(System.in);

        System.out.println("Introducir lado");
        lado = l.nextFloat();

        area = lado * lado;
        System.out.println("Area=" + area);
    }

}
