/*
21. Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
oportuno. Implementa las funciones:



int menu() // Muestra el menú y devuelve el número elegido

double pideRadio() // Pide que se introduzca el radio y lo devuelve

double circunferencia(double r) // Calcula la circunferencia y la devuelve

double area(double r) // Calcula el área y la devuelve

Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario

también pueda solicitar el cálculo del volumen. Añade la función:
double volumen(double r) // Calcula el volumen y lo devuelve

Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez
y se muestren los tres cálculos posibles (circunferencia, área y volumen).

Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú ->
realizar el cálculo -> volver a mostrar menú).

Añade una opción más llamada “Salir” que terminará
el programa si es elegida. */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menu();

    }

    public static int menu() {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce 1 para circunferencia,2 para area,3 para volumen,4 para todas y 5 para salir");
        int seleccion = lector.nextInt();

        switch (seleccion) {

            case 1://circunferencia

                System.out.println("El circunferencia es: " + circunferencia(radio()));
                menu();
                break;

            case 2://area

                System.out.println("El area es: " + area(radio()));
                menu();
                break;
            case 3://volumen

                System.out.println("El volumen es: " + volumen(radio()));

                menu();
                break;

            case 4://todas
                double radio = radio();
                System.out.println("El circunferencia es: " + circunferencia(radio));
                System.out.println("El area es: " + area(radio));
                System.out.println("El volumen es: " + volumen(radio));
                menu();
            case 5://salir

                break;

        }
        return 0;
    }

    public static double radio() {

        Scanner lector = new Scanner(System.in);
        double radioIntroducido;
        System.out.println("Introduce un radio");

        radioIntroducido = lector.nextInt();

        return radioIntroducido;

    }

    public static double circunferencia(double radioIntroducido) {

        double circunferenciaResultado;
        circunferenciaResultado = (2) * (Math.PI) * radioIntroducido;

        return circunferenciaResultado;

    }

    public static double area(double radioIntroducido) {

        double areaResultado;
        areaResultado = (Math.PI) * Math.pow(radioIntroducido, 2);

        return areaResultado;

    }

    public static double volumen(double radioIntroducido) {

        double volumenResultado;

        volumenResultado = (Math.PI) * Math.pow(radioIntroducido, 3) * 4 / 3;

        return volumenResultado;

    }

}
