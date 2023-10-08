/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author isaac
 */
public abstract class Vehiculo {

    protected final String matricula;
    protected final String modelo;

    public Vehiculo(String matricula, String modelo) {

        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    abstract void imprimir();

}
