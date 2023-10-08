/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author isaac
 */
public class Helicopteros extends Aereos {

    private int numeroHelices;

    public Helicopteros(int numeroHelices, int asientos, String matricula, String modelo) {
        super(asientos, matricula, modelo);
        this.numeroHelices = numeroHelices;
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    @Override
    void imprimir() {
        System.out.println("La matricula es : " + this.getMatricula() + ",El modelo es : " + this.getModelo() + ", La cantidad de Asientos es : "
                + this.getAsientos() + ",El numero de helices es : " + getNumeroHelices());
    }

}
