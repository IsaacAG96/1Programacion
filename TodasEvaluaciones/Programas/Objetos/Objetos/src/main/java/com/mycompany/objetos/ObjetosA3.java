/*
Crea un programa con una clase llamada Rectangulo que representará un rectángulo mediante dos
coordenadas (x1,y1) y (x2,y2) en un plano, por lo que la clase deberá tener cuatro atributos enteros:
x1, y1, x2, y2.
En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3). Muestra
por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto). Modifica todas las
coordenadas como consideres y vuelve a imprimir coordenadas, perímetros y áreas. */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class ObjetosA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AtributoA3 coordenadas1 = new AtributoA3();

        coordenadas1.X1 = 0;
        coordenadas1.Y1 = 0;
        coordenadas1.X2 = 5;
        coordenadas1.Y2 = 5;

        System.out.println("Las coordenadas del rectangulo son: (" + coordenadas1.X1 + ","
                + coordenadas1.Y1 + "),(" + coordenadas1.X1 + "," + coordenadas1.Y2 + "),(" + coordenadas1.X2
                + "," + coordenadas1.Y2 + "),(" + coordenadas1.X2 + "," + coordenadas1.Y1 + ")");

        int ladoX = Math.abs(coordenadas1.X2 - coordenadas1.X1);
        int ladoY = Math.abs(coordenadas1.Y2 - coordenadas1.Y1);

        System.out.println("Su perimetro mide: " + (2 * ladoX + 2 * ladoY));
        System.out.println("Su area mide: " + (ladoX * ladoY));

        AtributoA3 coordenadas2 = new AtributoA3();

        coordenadas2.X1 = 7;
        coordenadas2.Y1 = 9;
        coordenadas2.X2 = 5;
        coordenadas2.Y2 = 3;

        System.out.println("Las coordenadas del rectangulo son: (" + coordenadas2.X1 + ","
                + coordenadas2.Y1 + "),(" + coordenadas2.X1 + "," + coordenadas2.Y2 + "),(" + coordenadas2.X2
                + "," + coordenadas2.Y2 + "),(" + coordenadas2.X2 + "," + coordenadas2.Y1 + ")");

        int ladoX2 = Math.abs(coordenadas2.X2 - coordenadas2.X1);
        int ladoY2 = Math.abs(coordenadas2.Y2 - coordenadas2.Y1);

        System.out.println("Su perimetro mide: " + (2 * ladoX2 + 2 * ladoY2));
        System.out.println("Su area mide: " + ladoX2 * ladoY2);

    }

}
