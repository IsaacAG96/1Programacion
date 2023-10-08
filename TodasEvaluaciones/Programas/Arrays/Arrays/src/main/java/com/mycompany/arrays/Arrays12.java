/*
 12. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
hasta que el usuario elija la opción ‘c’ que terminará el programa.
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int enteros[] = new int[10];
        String opciones[] = {"a", "b", "c"};
        Scanner lector = new Scanner(System.in);
        String letra;
        int valor = 0;
        int posicion = 0;
        Boolean finalizar = false;
        int contador1 = 0;

        while (finalizar == false) {

            contador1 = 0;
            System.out.println("Introduce ¨a¨ para Mostrar Valores, ¨b¨ para introducir Valor o ¨c¨ para Salir");
            letra = lector.next();

            switch (letra) {

                case ("a"):
                    while (contador1 < 10) {
                        System.out.println("El numero " + enteros[contador1] + " pertenece a la posicion " + contador1);
                        contador1++;
                    }
                    break;

                case ("b"): {
                    System.out.println("Introduce un valor");
                    valor = lector.nextInt();
                    System.out.println("Introduce una poición");
                    posicion = lector.nextInt();
                    enteros[posicion] = valor;
                    System.out.println("Valor es " + valor);
                    break;

                }
                case ("c"):
                    finalizar = true;
                    break;

            }
        }

    }

}
