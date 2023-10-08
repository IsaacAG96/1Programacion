/*
7. Dibuja un ordinograma que lea un valor correspondiente a una distancia en millas marinas y
escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
 */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double millas, metros;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una distancia en millas marinas");
        millas = lector.nextDouble();
        metros = millas * 1852;
        System.out.println("El resultado en metros es=" + metros);
    }

}
