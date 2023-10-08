/*
El DNI de una persona no puede variar. Añade el modificador final al atributo dni y asegúrate de
que se guarde su valor en el constructor. Quita el método setDNI(…) que de todos modos ya no se
podrá utilizar porque Java no te dejará modificar el atributo dni.
La mayoría de edad a las 18 años es un valor común a todas las personas y no puede variar. Crea
un nuevo atributo llamado mayoriaEdad que sea static y final. Tendrás que inicializarlo a 18 en la
declaración. Utilízalo en el método que comprueba si una persona es mayor de edad.
Crea un método static boolean validarDNI(String dni) que devuelva true si dni es válido (tiene 8
números y una letra). Si no, devolverá false. Utilízalo en el constructor para comprobar el dni (si no
es válido, muestra un mensaje de error y no guardes los valores).
Realiza algunas pruebas en el main para comprobar el funcionamiento de los cambios realizados.
También puedes utilizar Persona.validarDNI(…) por ejemplo para comprobar si unos DNI
introducidos por teclado son válidos o no (sin necesidad de crear ningún objeto).
 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosE2 {

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

        validarDNI(persona1.getDni());

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

        validarDNI(persona2.getDni());

        persona2.imprime();

        System.out.println("¿Mayoria de edad?: " + persona2.esMayorEdad());
        System.out.println("¿Esta jubilado?: " + persona2.esJubilado());

        System.out.println("La diferencia de edad es de: " + persona2.diferenciaEdad(persona1));

    }

}
asd
