/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edificiossimplificado;

/**
 *
 * @author DAW
 */
public class PiscinaSimplificado extends PropiedadesSimplificado {

    private final int capacidadMax;
    private int cantidadAgua = 0;

    public PiscinaSimplificado(int capacidadMax, String propietario) {
        super(propietario);
        this.capacidadMax = capacidadMax;
    }

    public void llenar(int x) {
        if (this.cantidadAgua + x > this.capacidadMax) {
            System.out.println("Se ha llenado por completo");
            this.cantidadAgua = this.capacidadMax;
        } else {
            this.cantidadAgua = this.cantidadAgua + x;
        }
    }

    public void vaciar(int x) {
        if (x <= this.cantidadAgua) {
            this.cantidadAgua = this.cantidadAgua - x;
        } else {
            System.out.println("Se ha vaciado por completo");
            this.cantidadAgua = 0;

        }

    }
}
