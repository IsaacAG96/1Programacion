/*
2. Escribe un programa que muestre un menú con tres opciones: “1.Perímetro”,
“2.Área” y 3.”Salir del programa”
En las dos primeras se le pedirá al usuario que introduzca el lado de un cuadrado y
luego se le mostrará el cálculo. Implementa las funciones:
○ int menu() // Muestra el menú y devuelve el número elegido
○ double pideLado() // Pide que se introduzca el lado y lo devuelve
○ double perimetro(double r) // Calcula el perímetro y lo devuelve
○ double area(double r) // Calcula el área y la devuelve
El menú se repite hasta que el usuario decide salir */
package com.mycompany.examenpasado;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Eje2ExPasado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menu();

    }

    public static int menu() {

        Scanner lector = new Scanner(System.in);
        int seleccion;

        System.out.println("Introduce 1 para perimetro,2 para area y 3 para salir");

        seleccion = lector.nextInt();

        switch (seleccion) {

            case 1:
                System.out.println("Has seleccionado perimetro");
                System.out.println("El valor del area es: " + perimetro(lado()));
                break;

            case 2:
                System.out.println("Has seleccionado area");
                System.out.println("El valor del area es: " + area(lado()));

                break;
            case 3:
                System.out.println("Has seleccionado salir");
                break;
        }
        return 0;
    }

    public static double lado() {
        Scanner lector = new Scanner(System.in);
        double resultadoLado;
        System.out.println("Introduce el lado");
        resultadoLado = lector.nextDouble();
        return resultadoLado;

    }

    public static double perimetro(double resultadoLado) {

        double resultadoPerimetro;
        resultadoPerimetro = 4 * resultadoLado;

        return resultadoPerimetro;

    }

    public static double area(double resultadoLado) {
        double resultadoArea;
        resultadoArea = Math.pow(resultadoLado, 2);

        return resultadoArea;

    }

}
