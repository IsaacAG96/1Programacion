/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author isaac
 */
public class Aviones extends Aereos {

    private int tiempoMaxVuelo;

    public Aviones(int tiempoMaxVuelo, int asientos, String matricula, String modelo) {
        super(asientos, matricula, modelo);
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }

    public int getTiempoMaxVuelo() {
        return tiempoMaxVuelo;
    }

    public void setTiempoMaxVuelo(int tiempoMaxVuelo) {
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }

    @Override
    void imprimir() {
        System.out.println("La matricula es : " + this.getMatricula() + ",El modelo es : " + this.getModelo() + ", La cantidad de Asientods es : "
                + this.getAsientos() + ",El tiempo maximo de vuelo es : " + getTiempoMaxVuelo());
    }

}
