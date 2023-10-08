/*
 10. Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
función donde le pasemos los datos y devuelva si es correcta o no.
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el dia");
        int dia = lector.nextInt();

        System.out.println("Introduce el mes");
        int mes = lector.nextInt();

        System.out.println("Introduce el año");
        int año = lector.nextInt();

        System.out.println(fecha(dia, mes, año));

    }

    public static String fecha(int dia, int mes, int año) {
        boolean diaOk = false;
        boolean mesOk = false;
        boolean añoOk = false;
        String resultado;
        if (dia > 0 && dia <= 30) {

            diaOk = true;

        } else {
            diaOk = false;
        }

        if (mes > 0 && mes <= 12) {
            mesOk = true;

        } else {
            mesOk = false;
        }

        if (diaOk == true && mesOk == true) {
            resultado = ("Fecha correcta");

            return resultado;
        } else {
            resultado = ("Fecha incorrecta");
            return resultado;

        }

    }

}
