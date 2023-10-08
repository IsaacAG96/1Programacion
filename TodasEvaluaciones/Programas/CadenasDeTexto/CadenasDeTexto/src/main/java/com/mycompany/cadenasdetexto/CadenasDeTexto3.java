/*
 3. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”.
 */
package com.mycompany.cadenasdetexto;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class CadenasDeTexto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombre = ("");
        String apellido1 = ("");
        String apellido2 = ("");
        String resultado = ("");
        String espacio = (" ");

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un nombre");
        nombre = lector.nextLine();

        System.out.println("Introduce el primer apellido");
        apellido1 = lector.nextLine();

        System.out.println("Introduce el segundo apellido");
        apellido2 = lector.nextLine();

        resultado = nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3);
        resultado = resultado.toUpperCase();

        System.out.println("Los datos completos son: " + resultado);

    }

}
