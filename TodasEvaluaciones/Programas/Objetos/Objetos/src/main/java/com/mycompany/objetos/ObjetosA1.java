/*
Crea un programa con una clase llamada Punto que representará un punto de dos dimensiones en
un plano. Solo contendrá dos atributos enteros llamadas x e y (coordenadas).
En el main de la clase principal instancia 3 objetos Punto con las coordenadas (5,0), (10,10) y (-3,
7). Muestra por pantalla sus coordenadas (utiliza un println para cada punto). Modifica todas las
coordenadas (prueba distintos operadores como = + - += *=...) y vuelve a imprimirlas por pantalla. */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class ObjetosA1 {

    public static void main(String[] args) {

        AtributoA1 p1 = new AtributoA1();

        p1.X = 5;
        p1.Y = 0;
        System.out.println("Coordenadas: " + p1.X + "," + p1.Y);

        AtributoA1 p2 = new AtributoA1();

        p2.X = 10;
        p2.Y = 10;
        System.out.println("Coordenadas: " + p2.X + "," + p2.Y);

        AtributoA1 p3 = new AtributoA1();

        p3.X = -3;
        p3.Y = 7;
        System.out.println("Coordenadas: " + p3.X + "," + p3.Y);
    }
}
