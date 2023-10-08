/*
Aplica el encapsulamiento básico a la clase Persona: Declara todos sus atributos como private y
crea todos los getters y setters necesarios (un get y un set por atributo).
Corrige el main para utilizar los getters y setters. Prueba a instanciar varios objetos, mostrar sus
valores por pantalla, modificarlos, etc.
 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        AtributoC2 persona1 = new AtributoC2();//persona1

        System.out.println("Introduce el nombre");
        persona1.setNombre(lector.next());

        System.out.println("Introduce el apellido");
        persona1.setApellidos(lector.next());

        System.out.println("Introduce el DNI");
        persona1.setDni(lector.next());

        System.out.println("Introduce la edad");
        persona1.setEdad(lector.nextInt());

        System.out.println("La persona " + persona1.getNombre() + " " + persona1.getApellidos()
                + " de edad " + persona1.getEdad() + " y con DNI " + persona1.getDni());

        AtributoC2 persona2 = new AtributoC2();//persona2

        System.out.println("Introduce el nombre");
        persona2.setNombre(lector.next());

        System.out.println("Introduce el apellido");
        persona2.setApellidos(lector.next());

        System.out.println("Introduce el DNI");
        persona2.setDni(lector.next());

        System.out.println("Introduce la edad");
        persona2.setEdad(lector.nextInt());

        System.out.println("La persona " + persona2.getNombre() + " " + persona2.getApellidos()
                + " de edad " + persona2.getEdad() + " y con DNI " + persona2.getDni());
    }

}
