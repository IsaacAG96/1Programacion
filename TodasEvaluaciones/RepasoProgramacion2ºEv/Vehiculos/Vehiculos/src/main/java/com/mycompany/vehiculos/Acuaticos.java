/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author isaac
 */
public class Acuaticos extends Vehiculo {

    protected final int eslora;

    public Acuaticos(int eslora, String matricula, String modelo) {
        super(matricula, modelo);
        this.eslora = eslora;
    }

    public int getEslora() {
        return eslora;
    }

    @Override
    void imprimir() {
        System.out.println("La matricula es : " + this.getMatricula() + ",El modelo es : " + this.getModelo() + ", La cantidad de Eslora es : " + this.getEslora());

    }

}
