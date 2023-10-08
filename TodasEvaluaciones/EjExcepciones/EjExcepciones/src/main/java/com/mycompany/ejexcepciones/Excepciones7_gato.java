/*
Crea una copia del programa anterior y modifica el main para hacer lo siguiente:
    ◦ Crea un ArrayList<Gato>. Luego, utilizando un bucle, pide al usuario que introduzca los datos de 5 gatos: utiliza un Scanner para pedir los datos, 
    instancia el objeto y guárdalo en el ArrayList.

    Por último, imprime la información de los gatos.

    ◦ Maneja las posibles excepciones de modo que en el ArrayList solo almacenemos objetos
    Gato válidos y el bucle se repita hasta crear y almacenar correctamente 5 gatos
 */
package com.mycompany.ejexcepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Excepciones7_gato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Gato> gatitos = new ArrayList();
        Scanner lector = new Scanner(System.in);

        int contador = 0;

        while (contador < 5) {

            try {
                System.out.println("Introduce el nombre del gato");
                String nombre = lector.next();
                Gato.verificarNombre(nombre);

                System.out.println("Introduce la edad del gato");
                int edad = lector.nextInt();
                Gato.verificarEdad(edad);

                gatitos.add(new Gato(nombre, edad));
                contador++;
                System.out.println("Llevas " + contador + " de " + 5 + " gatos");
                System.out.println("----------------------");
            } catch (InputMismatchException X) {

                System.out.println("Error : ");
                System.out.println(X.getMessage());

                System.out.println("----------------------");

            } catch (ExcepcionPropia X) {
                System.out.println(X.getMessage());
                System.out.println("----------------------");
            }

        }

        for (int contador1 = 0; contador1 < gatitos.size(); contador1++) {

            System.out.println("Gato numero : " + contador1 + " " + gatitos.get(contador1));
        }
    }

}
