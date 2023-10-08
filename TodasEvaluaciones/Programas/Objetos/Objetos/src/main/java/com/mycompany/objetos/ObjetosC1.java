/*
 Modifica los atributos de Punto para que sean private.
Fíjate que desde el main ya no te dejará utilizar ni modificar
los atributos x e y de los objetos.
Vamos a añadir los getteres: int getX() e int getY() que
devolverán los valores de x e y respectivamente. Es una
forma indirecta de leer sus valores.
Añadiremos también los setters: void setX(int x) y void
setY(int y) que copiarán el valor pasado como parámetro a
los atributos de la clase.
Tanto getters como setters deben ser public.
Corrige el main para utilizar los getters y setters. Prueba a
instanciar varios objetos, mostrar sus valores por pantalla,
modificarlos, etc.

 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introduce valores para X y luego para Y");

        AtributoC1 posicion = new AtributoC1();

        
        posicion.setX(lector.nextInt());
        posicion.setY(lector.nextInt());

        System.out.println("Coordenadas: " + posicion.getX() + "," + posicion.getY());
    }

}
