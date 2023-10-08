/*
Define una jerarquía de clases que permita almacenar datos sobre los planetas y satélites (lunas)
que forman parte del sistema solar.
Algunos atributos que necesitaremos almacenar son: 
    • Masa del cuerpo.
    • Diámetro medio.
    • Período de rotación sobre su propio eje.
    • Período de traslación alrededor del cuerpo que orbitan.
    • Distancia media a ese cuerpo.
    • etc.
Define las clases necesarias conteniendo: 
    • Constructores. 
    • Métodos para recuperar y almacenas atributos.
    • Método para mostrar la información del objeto. 
Define un método, que dado un objeto del sistema solar (planeta o satélite), imprima toda la
información que se dispone sobre el mismo (además de su lista de satélites si los tuviera)



Una posible solución sería crear una lista de objetos, insertar los planetas y satélites (directamente
mediante código o solicitándolos por pantalla) y luego mostrar un pequeño menú que permita al
usuario imprimir la información del astro que elija.
 */
package com.mycompany.planetas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Astrologia {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        ArrayList Planetario = new ArrayList();
        boolean salida = false;

        Planetario.add(new Planetas(50, false, 2.5, 10, 35));
        Planetario.add(new Planetas(20, true, 7.75, 100, -5));
        Planetario.add(new Satelites(10, "Tierra", 6.1, 2, 5));
        Planetario.add(new Satelites(5, "Pluton", 2.5, 4, 7));

        while (salida == false) {
            int posicion;
            System.out.println("La longitud de la lista actual es de : " + Planetario.size());
            System.out.println("Introduce el numero del Astro que quieras visualizar o un numero negativo para salir");

            posicion = lector.nextInt();

            if (posicion >= 0) {
                System.out.println("Los datos son: " + Planetario.get(posicion));
            } else {
                salida = true;
            }

        }

    }
}
