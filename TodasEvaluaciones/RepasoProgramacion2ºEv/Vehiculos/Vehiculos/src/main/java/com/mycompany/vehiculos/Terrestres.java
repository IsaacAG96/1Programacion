/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author isaac
 */
public class Terrestres extends Vehiculo {

    protected final int cantidadRuedas;

    public Terrestres(int cantidadRuedas, String matricula, String modelo) {
        super(matricula, modelo);

        this.cantidadRuedas = cantidadRuedas;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    @Override
    void imprimir() {
        System.out.println("La matricula es : " + this.getMatricula() + ",El modelo es : " + this.getModelo() + ", La cantidad de Ruedas es : " + this.getCantidadRuedas());

    }

}
