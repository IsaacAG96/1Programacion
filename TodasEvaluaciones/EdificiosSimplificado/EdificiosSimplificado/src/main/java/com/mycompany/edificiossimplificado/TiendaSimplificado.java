/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edificiossimplificado;

/**
 *
 * @author DAW
 */
public class TiendaSimplificado extends PropiedadesSimplificado {

    private boolean abierto;
    private boolean cerrado;

   

    public TiendaSimplificado(boolean abierto, boolean cerrado, String propietario) {
        super(propietario);
        this.abierto = abierto;
        this.cerrado = cerrado;
    }

    public void abrir() {
        if (this.abierto == true) {
            System.out.println("Ya estaba abierto");
        } else {
            System.out.println("Se ha abierto");
            this.abierto = true;
            this.cerrado = false;
        }

    }

    public void cerrar() {
        if (this.cerrado == true) {
            System.out.println("Ya estaba cerrado");
        } else {
            System.out.println("Se ha cerrado");
            this.abierto = false;
            this.cerrado = true;
        }

    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    @Override
    public String toString() {
        return "TiendaSimplificado{" + "abierto=" + abierto + ", cerrado=" + cerrado + '}';
    }

}
