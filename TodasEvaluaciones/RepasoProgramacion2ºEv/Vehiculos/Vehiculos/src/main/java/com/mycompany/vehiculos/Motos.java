/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author isaac
 */
public class Motos extends Terrestres {

    private String color;

    public Motos(String color, int cantidadRuedas, String matricula, String modelo) {
        super(cantidadRuedas, matricula, modelo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void imprimir() {

        System.out.println("La matricula es : " + this.getMatricula() + ",El modelo es : " + this.getModelo() + ", La cantidad de Ruedas es : "
                + this.getCantidadRuedas() + ",El color : " + this.getColor());
    }

}
