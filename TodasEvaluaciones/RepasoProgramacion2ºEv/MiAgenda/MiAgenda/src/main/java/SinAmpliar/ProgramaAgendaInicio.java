/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SinAmpliar;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class ProgramaAgendaInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        AgendaInicio agenda = new AgendaInicio();

        ContactoInicio test1 = new ContactoInicio("Paco", 6325442);
        ContactoInicio test2 = new ContactoInicio("Manola", 632455);
        ContactoInicio test3 = new ContactoInicio("Luisa", 631234);
        ContactoInicio test4 = new ContactoInicio("Paquita", 6325442);

        agenda.añadirContacto(test1);
        agenda.añadirContacto(test2);
        agenda.añadirContacto(test3);
        agenda.añadirContacto(test4);

        System.out.println("Menú");
        int menu = 0;

        while (menu != 6) {
            System.out.println("1. Añadir contacto\n2. Eliminar contacto\n3. Comprobar si existe contacto\n4. Listar contactos\n5. Buscar contacto\n6. Salir");
            menu = lector.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Introduce los datos del contacto");
                    ContactoInicio c = new ContactoInicio(lector.next(), lector.nextInt());
                    System.out.println("Confirmación del proceso: " + agenda.añadirContacto(c));
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
