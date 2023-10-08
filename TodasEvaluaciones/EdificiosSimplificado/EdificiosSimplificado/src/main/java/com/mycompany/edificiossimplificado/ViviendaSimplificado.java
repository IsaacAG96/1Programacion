/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edificiossimplificado;

/**
 *
 * @author DAW
 */
public class ViviendaSimplificado extends PropiedadesSimplificado {

    private int cantidadPersonas = (int) Math.round((Math.random() * 10));
    private final int cantidadMaximaPersonas = (int) Math.round((Math.random() * 10));

    public ViviendaSimplificado(String propietario) {
        super(propietario);
    }

    public void añadirPersonas(int x) {

        if ((this.cantidadMaximaPersonas - (this.cantidadPersonas + x)) <= 0) {
            System.out.println("No entran mas personas");

        } else {
            this.cantidadPersonas = this.cantidadPersonas + x;

        }

    }

    public void quitarPersonas(int x) {
        if (this.cantidadPersonas == 0) {
            System.out.println("No hay mas personas");

        } else if (this.cantidadPersonas - x < 0) {
            System.out.println("Se han quitado todas las personas");
            this.cantidadPersonas = 0;

        } else {
            System.out.println("Se han quitado " + x + " cantidad de personas");
            this.cantidadPersonas = this.cantidadPersonas - x;
        }
    }
}
