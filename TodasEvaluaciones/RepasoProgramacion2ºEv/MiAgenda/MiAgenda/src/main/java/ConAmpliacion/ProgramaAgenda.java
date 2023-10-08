/*
Debemos implementar un programa que funcione como una agenda telefónica de contactos.
Un contacto tiene un nombre y un teléfono (no es necesario validarlos). Se considera que dos
contactos son iguales si sus nombres son iguales.
Una agenda de contactos está formada por un conjunto de contactos y debe permitir realizar las
siguientes operaciones:

        • boolean añadirContacto(Contacto c): Añade un contacto a la agenda e indica si se ha
        añadido. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres
        (aunque tengan distinto teléfono).
        • boolean eliminarContacto(String nombre): elimina el contacto de la agenda. Indica si se ha
        podido eliminar.
        • boolean existeContacto(String nombre): Indica si el contacto indicado existe.
        • void listarContactos(): Muestra por pantalla toda la agenda.
        • int buscaContacto(String nombre): busca un contacto por su nombre y devuelve su posición
        en la agenda

Implementa las clases Contacto y Agenda.
Implementa también la clase ProgramaAgenda con una función main para realizar pruebas.


Ampliacion:


Queremos modificar la agenda de contactos para poder almacenar personas y empresas. Las
personas tienen nombre, teléfono y cumpleaños; las empresas tienen nombre, teléfono y página
web. Tendrás que modificar la clase Contacto para que sea abstracta (y tal vez otros cambios).
Implementa las clases ContactoPersona y ContactoEmpresa, que heredarán de Contacto. Agenda
deberá seguir conteniendo una sola lista de contactos. Modifica ProgramaAgenda para realizar
pruebas con la nueva agenda.

 */
package ConAmpliacion;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class ProgramaAgenda {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Agenda agenda = new Agenda();

        ContactoPersona test1 = new ContactoPersona("en marzo", "Paco", 115);
        ContactoPersona test2 = new ContactoPersona("en julio", "Luisa", 252);
        ContactoEmpresa test3 = new ContactoEmpresa("www.carrefour.algo", "Carrefour", 5454);
        ContactoEmpresa test4 = new ContactoEmpresa("www.alcampo.algo", "Alcampo", 636);

        agenda.añadirContacto(test1);
        agenda.añadirContacto(test2);
        agenda.añadirContacto(test3);
        agenda.añadirContacto(test4);

        agenda.buscaContacto("Paco");

        System.out.println("Menú");
        int menu = 0;
        int menu2 = 0;

        while (menu != 6) {
            System.out.println("1. Añadir contacto\n2. Eliminar contacto\n3. Comprobar si existe contacto\n4. Listar contactos\n5. Buscar contacto\n6. Salir");
            menu = lector.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("1. Añadir contactoPersona\n2. Añadir contactoEmpresar");
                    menu2 = lector.nextInt();
                    switch (menu2) {
                        case 1:

                            System.out.println("Introduce los datos del contacto");
                            ContactoPersona c = new ContactoPersona(lector.next(), lector.next(), lector.nextInt());
                            System.out.println("Confirmación del proceso: " + agenda.añadirContacto(c));
                            break;

                        case 2:
                            System.out.println("Introduce los datos del contacto");
                            ContactoEmpresa e = new ContactoEmpresa(lector.next(), lector.next(), lector.nextInt());
                            System.out.println("Confirmación del proceso: " + agenda.añadirContacto(e));
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Introduce el nombre del contacto");
                    System.out.println("Comprobación: " + agenda.eliminarContacto(lector.next()));
                    break;
                case 3:
                    System.out.println("Introduce el nombre del contacto");
                    System.out.println("¿Existe?: " + agenda.existeContacto(lector.next()));
                    break;
                case 4:
                    agenda.listarContactos();
                    break;
                case 5:
                    System.out.println("Introduce el nombre del contacto");
                    System.out.println("Posición: " + agenda.buscaContacto(lector.next()));
                    break;
            }
        }
    }
}
