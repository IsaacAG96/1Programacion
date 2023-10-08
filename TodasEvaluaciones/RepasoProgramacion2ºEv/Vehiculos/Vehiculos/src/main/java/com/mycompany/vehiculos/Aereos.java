/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author isaac
 */
public class Aereos extends Vehiculo {

    protected final int asientos;

    public Aereos(int asientos, String matricula, String modelo) {
        super(matricula, modelo);
        this.asientos = asientos;
    }

    public int getAsientos() {
        return asientos;
    }

    @Override
    void imprimir() {
        System.out.println("La matricula es : " + this.getMatricula() + ",El modelo es : " + this.getModelo() + ", La cantidad de Asientods es : " + this.getAsientos());
    }

}
