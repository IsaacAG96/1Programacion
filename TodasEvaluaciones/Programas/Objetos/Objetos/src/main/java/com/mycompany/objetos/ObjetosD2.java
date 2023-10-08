/*
Añade a la clase Persona los siguientes métodos públicos:
• public void imprime() // Imprime la información del objeto: “DNI:… Nombre:… etc.”
• public boolean esMayorEdad() // Devuelve true si es mayor de edad (false si no).
• public boolean esJubilado() // Devuelve true si tiene 65 años o más (false si no).
• public int diferenciaEdad(Persona p) // Devuelve la diferencia de edad entre ‘this’ y p.
Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.
 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lector = new Scanner(System.in);

        AtributoD2 persona1 = new AtributoD2();//persona1

        System.out.println("Introduce el nombre");
        persona1.setNombre(lector.next());

        System.out.println("Introduce el apellido");
        persona1.setApellidos(lector.next());

        System.out.println("Introduce el DNI");
        persona1.setDni(lector.next());

        System.out.println("Introduce la edad");
        persona1.setEdad(lector.nextInt());

        persona1.imprime();
        System.out.println("¿Mayoria de edad?: " + persona1.esMayorEdad());
        System.out.println("¿Esta jubilado?: " + persona1.esJubilado());

        AtributoD2 persona2 = new AtributoD2();//persona2

        System.out.println("Introduce el nombre");
        persona2.setNombre(lector.next());

        System.out.println("Introduce el apellido");
        persona2.setApellidos(lector.next());

        System.out.println("Introduce el DNI");
        persona2.setDni(lector.next());

        System.out.println("Introduce la edad");
        persona2.setEdad(lector.nextInt());

        persona2.imprime();

        System.out.println("¿Mayoria de edad?: " + persona2.esMayorEdad());
        System.out.println("¿Esta jubilado?: " + persona2.esJubilado());

        System.out.println("La diferencia de edad es de: " + persona2.diferenciaEdad(persona1));
    }

}
