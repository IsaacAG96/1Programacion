/*
Crea un programa con una clase llamada Persona que representará los datos principales de una
persona: dni, nombre, apellidos y edad.
En el main de la clase principal instancia dos objetos de la clase Persona. Luego, pide por teclado
los datos de ambas personas (guárdalos en los objetos). Por último, imprime dos mensajes por
pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García con DNI … es / no es
mayor de edad”. */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        AtributoA2 persona1 = new AtributoA2();//persona1

        System.out.println("Introduce el nombre");
        persona1.nombre = lector.next();

        System.out.println("Introduce el apellido");
        persona1.apellidos = lector.next();

        System.out.println("Introduce el DNI");
        persona1.dni = lector.next();

        System.out.println("Introduce la edad");
        persona1.edad = lector.nextInt();

        System.out.println("La persona " + persona1.nombre + " " + persona1.apellidos
                + " de edad " + persona1.edad + " y con DNI " + persona1.dni);

        AtributoA2 persona2 = new AtributoA2();//persona2

        System.out.println("Introduce el nombre");
        persona2.nombre = lector.next();

        System.out.println("Introduce el apellido");
        persona2.apellidos = lector.next();

        System.out.println("Introduce el DNI");
        persona2.dni = lector.next();

        System.out.println("Introduce la edad");
        persona2.edad = lector.nextInt();

        System.out.println("La persona " + persona2.nombre + " " + persona2.apellidos
                + " de edad " + persona2.edad + " y con DNI " + persona2.dni);

    }

}
