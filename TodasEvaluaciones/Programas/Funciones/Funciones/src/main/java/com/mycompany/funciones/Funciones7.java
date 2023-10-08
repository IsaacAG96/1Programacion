/*
 7. Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el ancho de un rectangulo");
        double ancho = lector.nextDouble();

        System.out.println("Introduce el alto de un rectangulo");
        double alto = lector.nextDouble();

        System.out.println("El perimetro del rectangulo es " + perimetroRectangulo(ancho, alto));
        System.out.println("El area del rectangulo es " + areaRectangulo(ancho, alto));

    }

    public static double perimetroRectangulo(double ancho, double alto) {

        double perimetro = 2 * (ancho + alto);
        return perimetro;

    }

    public static double areaRectangulo(double ancho, double alto) {
        double area = ancho * alto;
        return area;

    }

}
