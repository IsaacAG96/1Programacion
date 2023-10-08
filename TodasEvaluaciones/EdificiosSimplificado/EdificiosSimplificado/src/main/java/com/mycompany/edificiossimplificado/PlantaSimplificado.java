/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edificiossimplificado;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class PlantaSimplificado {

    private final int superficie = (int) Math.round((Math.random() * 1100) + 100);

    public PlantaSimplificado() {
    }

    private void crearTienda() {
        Scanner lector = new Scanner(System.in);
        int aux = (int) Math.round(Math.random() * 1);
        System.out.println("Introduce el nombre del propietario");
        String nombre = lector.next();
        if (aux == 0) {
            Persona pj = new Persona(nombre);
            TiendaSimplificado tienda = new TiendaSimplificado(true, false, pj.getNombre());//CREA TIENDA ABIERTA
        } else if (aux == 1) {
            Persona pj = new Persona(nombre);
            TiendaSimplificado tienda = new TiendaSimplificado(false, true, pj.getNombre());//CREA TIENDA CERRADA
        }
    }

    private void crearPiscina(int x) {
        Scanner lector = new Scanner(System.in);
        String nombre = lector.next();
        Persona pj = new Persona(nombre);
        PiscinaSimplificado piscina = new PiscinaSimplificado(x, pj.getNombre());
    }

    private void crearVivienda() {
        Scanner lector = new Scanner(System.in);
        String nombre = lector.next();
        Persona pj = new Persona(nombre);
        ViviendaSimplificado vivienda = new ViviendaSimplificado(pj.getNombre());
    }
}
