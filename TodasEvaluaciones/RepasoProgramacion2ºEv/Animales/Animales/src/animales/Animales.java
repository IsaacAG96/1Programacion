/*
Implementa una clase llamada Inventario que utilizaremos para almacenar referencias a todos los
animales existentes en una tienda de mascotas. 
Esta clase debe cumplir con los siguientes requisitos: 
    • En la tienda existirán 4 tipos de animales: perros, gatos, loros y canarios. 
    • Los animales deben almacenarse en un ArrayList privado dentro de la clase Inventario. 
    • La clase debe permitir realizar las siguientes acciones:
    ◦ Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).
    ◦ Mostrar todos los datos de un animal concreto.
    ◦ Mostrar todos los datos de todos los animales.
    ◦ Insertar animales en el inventario. 
    ◦ Eliminar animales del inventario. 
    ◦ Vaciar el inventario.
Implementa las demás clases necesarias para la clase Inventario.

 */
package animales;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lector = new Scanner(System.in);
        String relleno = "------------------------------------------------------------------------------------";

        ArrayList listadoAnimales = new ArrayList();

        Perro perro_1 = new Perro("chucho", 25, "Pulgoso", 20, "muerto", "06/02/2003");

        listadoAnimales.add(perro_1);

        Gato gato_1 = new Gato("negro", true, "Negrillo", 1, "vivo", "06/02/2022");

        listadoAnimales.add(gato_1);

        Loro loro_1 = new Loro("exotico", true, true, true, "Ramón", 5, "vivo", "06/02/2018");

        listadoAnimales.add(loro_1);

        Canario canario_1 = new Canario("azul", false, false, false, "Azulin", 3, "muerto", "06/02/2020");

        listadoAnimales.add(canario_1);

        boolean salida = false;

        int opcion1;

        while (salida == false) {

            System.out.println("Introduce una opcion:");
            System.out.println("Seleccione una opcion: ");
            System.out.println("1.Mostrar la lista de animales.");
            System.out.println("2.Mostrar todos los datos de un animal concreto.");
            System.out.println("3.Mostrar todos los datos de todos los animales.");
            System.out.println("4.Insertar animales en el inventario.");
            System.out.println("5.Eliminar animales del inventario.");
            System.out.println("6.Vaciar el inventario. ");
            System.out.println("7.Finalizar el programa.");
            System.out.println(relleno);
            opcion1 = lector.nextInt();
            switch (opcion1) {
                case 1://Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal)

                    int enumerar = 0;

                    while (enumerar < listadoAnimales.size()) {

                        System.out.println(getInfoCorta(enumerar)); //COMO MUESTRO ALGUNO SOLO?

                        enumerar++;
                    }

                    break;

                case 2://Mostrar todos los datos de un animal concreto

                    System.out.println("Introduce que animal quieres ver detalladamente");
                    System.out.println("Cantidad de animales que hay: " + listadoAnimales.size());
                    int mostrar = lector.nextInt();
                    System.out.println(listadoAnimales.get(mostrar));

                    break;

                case 3://Mostrar todos los datos de todos los animales.

                    Iterator iteratorLista = listadoAnimales.iterator(); // SE CREA UN ITERATOR LLAMADO IT PARA EL ARRAYLIST  Y SE IMPORTA

                    while (iteratorLista.hasNext()) {
                        System.out.println(iteratorLista.next()); //RECORRE EL ARRAY HASTA QUE NO HAYA MAS HUECOS
                    }

                    break;

                case 4://Insertar animales en el inventario. 
                    System.out.println("Has seleccionado añadir un animal");
                    System.out.println("Introduce 1 -> Perro , 2 -> Gato, 3 -> Loro o 4 -> Canario");
                    int opcion2 = lector.nextInt();
                    switch (opcion2) {

                        case 1://Añadir Perro
                            System.out.println("Has seleccionado Perro");
                            System.out.println("Introduce los datos del Perro en el siguiente orden:String raza, int pulgas, String nombre, int edad, String estado, String fechaNacimiento");
                            listadoAnimales.add(new Perro(lector.next(), lector.nextInt(), lector.next(), lector.nextInt(), lector.next(), lector.next()));
                            break;
                        case 2://Añadir Gato

                            System.out.println("Has seleccionado Gato");
                            System.out.println("Introduce los datos del Gato en el siguiente orden:String color, boolean peloLargo, String nombre, int edad, String estado, String fechaNacimiento");
                            listadoAnimales.add(new Gato(lector.next(), lector.nextBoolean(), lector.next(), lector.nextInt(), lector.next(), lector.next()));
                            break;

                        case 3://Añadir Loro
                            System.out.println("Has seleccionado Loro");
                            System.out.println("Introduce los datos del Loro en el siguiente orden:String origen, boolean habla, boolean pico, boolean vuela, String nombre, int edad, String estado, String fechaNacimiento");
                            listadoAnimales.add(new Loro(lector.next(), lector.nextBoolean(), lector.nextBoolean(), lector.nextBoolean(), lector.next(), lector.nextInt(), lector.next(), lector.next()));
                            break;

                        case 4://Añadir Canario
                            System.out.println("Has seleccionado Canario");
                            System.out.println("Introduce los datos del Canario en el siguiente orden:String color, boolean canta, boolean pico, boolean vuela, String nombre, int edad, String estado, String fechaNacimiento");
                            listadoAnimales.add(new Canario(lector.next(), lector.nextBoolean(), lector.nextBoolean(), lector.nextBoolean(), lector.next(), lector.nextInt(), lector.next(), lector.next()));
                            break;

                    }

                    break;

                case 5://Eliminar animales del inventario.

                    System.out.println("Hay : " + listadoAnimales.size() + " posiciones");
                    System.out.println("Introduce que posicion quieres borrar");
                    int borrar = lector.nextInt();

                    listadoAnimales.remove(borrar);

                    break;

                case 6://Vaciar el inventario.

                    listadoAnimales.clear();
                    System.out.println("Se ha vaciado el inventario");

                    break;

                case 7: //Cerrar el programa
                    salida = true;
                    break;
            }

        }

    }

}
