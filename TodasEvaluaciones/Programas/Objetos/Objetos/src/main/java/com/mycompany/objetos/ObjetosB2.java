/*
Añade a Persona el constructor de abajo y corrige el main para utilizarlo:
public Persona(String dni, String nombre, String apellidos, int edad) {
this.dni = dni;
this.nombre = nombre;
this.apellidos = apellidos;
this.edad = edad;
}

Ten en cuenta que no es obligatorio que los parámetros del constructor se llamen igual que los
atributos del objeto (en tal caso no sería necesario utilizar this). Podríamos hacerlo así:
public Persona(String id, String nom, String ap, int e) {
dni = id;
nombre = nom;
apellidos = ap;
edad = e;
}
Tampoco es obligatorio pasar al constructor todos los atributos de la clase. Podríamos decidir por
ejemplo que en nuestro software todas las personas deben tener nombre, apellidos y edad, pero no
es obligatorio el DNI (recién nacidos y niños). Este constructor también sería válido:
public Persona(String nom, String ap, int e) {
nombre = nom;
apellidos = ap;
edad = e;
}
Una clase puede tener tantos constructores como quieras siempre y cuando tengan distinto
número y/o tipo de parámetros (para que no haya ambigüedad en cual utilizar).

 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el DNI,nombre,apellido y la edad por separado");

        AtributoB2 persona1 = new AtributoB2(lector.next(), lector.next(), lector.next(), lector.nextInt());//persona1

        System.out.println("La persona " + persona1.nombre + " " + persona1.apellidos
                + " de edad " + persona1.edad + " y con DNI " + persona1.dni);

        System.out.println("Introduce el DNI,nombre,apellido y la edad por separado");
        AtributoB2 persona2 = new AtributoB2(lector.next(), lector.next(), lector.next(), lector.nextInt());//persona2

        System.out.println("La persona " + persona2.nombre + " " + persona2.apellidos
                + " de edad " + persona2.edad + " y con DNI " + persona2.dni);
    }

}
