/*
    1. Crea un programa que almacene en un vector los nombres de diez mujeres asesinadas, por ejemplo: Patria Mirabal,
Minerva Mirabal, María Teresa Mirabal, Lucrecia Pérez, Ana Orantes, Rocío Caíz, Marta del Castillo, Mahsa Amini,
Cecilia Monzón y Freshta Kohistani. 
El programa te muestra un menú con cinco opciones, que tienen que implementarse con las siguientes funciones:

Opción
Función
    1. Escribir el vector por pantalla, una mujer por línea.  
void escribir (String vector[])
    2. Escribir un nuevo nombre en la posición X del vector. El usuario tiene que indicar esa posición y el nombre. 
void nuevoNombre (String vector[]) 
    3. Ordenar el vector alfabéticamente.
----
    4. Mostrar el apellido de la mujer que esté en la posición X. 
string apellido (String vector[])
    5. Salir
----

El menú se repite hasta que el usuario decide salir. */
package com.mycompany.examen1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Eje1exa {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String mujeres[] = {"Patria Mirabal", "Minerva Mirabal", "María Teresa Mirabal",
            "Lucrecia Pérez", "Ana Orantes", "Rocío Caíz", "Marta del Castillo",
            "Mahsa Amini", "Cecilia Monzón", "Freshta Kohistani"};
        menu(mujeres);

    }

    public static int menu(String mujeres[]) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce 1 para ver el vector,"
                + "2 para sobreescribir un nombre,"
                + "3 para ordenar alfabeticamente,"
                + "4 para mostrar el apellido de la posicion X o 5 para salir");
        int seleccion = lector.nextInt();

        switch (seleccion) {

            case 1://ENSEÑAR

                enseñar(mujeres);
                menu(mujeres);
                break;

            case 2://SOBRESCRIBIR
                sobrescribir(mujeres);

                menu(mujeres);

                break;

            case 3://ORDENAR

                Arrays.sort(mujeres);
                menu(mujeres);
                break;

            case 4://ENSEÑAR APELLIDO POSICION X
                System.out.println("El apellido en la posicion elegida es " + apellido(mujeres));
                menu(mujeres);
                break;
            case 5://SALIR

                break;

        }//fin switch
        return 0;
    }//fin main

    public static void enseñar(String mujeres[]) {//caso 1

        for (int contador0 = 0; contador0 < mujeres.length; contador0++) {

            System.out.println("La mujer de la posicion " + contador0 + " es " + mujeres[contador0]);

        }

    }//fin funcion

    public static void sobrescribir(String mujeres[]) {//caso 2
        Scanner lector = new Scanner(System.in);

        System.out.println("Que nombre quieres reemplazar");
        int posicion = lector.nextInt();

        System.out.println("Introduce el nombre");

        mujeres[posicion] = lector.next();

    }//fin funcion

    public static String apellido(String mujeres[]) {//caso 4

        Scanner lector = new Scanner(System.in);
        System.out.println("¿Que apellido quieres ver?");
        int posicion = lector.nextInt();

        int espacio = (mujeres[posicion].indexOf(" "));//busca primer espacio
        String resultado = mujeres[posicion].substring(espacio);

        return resultado;
    }//fin funcion

}
