/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author isaac
 */
public class Submarinos extends Acuaticos {

    private int profundidadMax;

    public Submarinos(int profundidadMax, int eslora, String matricula, String modelo) {
        super(eslora, matricula, modelo);
        this.profundidadMax = profundidadMax;
    }

    public int getProfundidadMax() {
        return profundidadMax;
    }

    public void setProfundidadMax(int profundidadMax) {
        this.profundidadMax = profundidadMax;
    }

    @Override
    void imprimir() {
        System.out.println("La matricula es : " + this.getMatricula() + ",El modelo es : " + this.getModelo() + ", La cantidad de Eslora es : "
                + this.getEslora() + ",La profundidad maxima es : " + getProfundidadMax());

    }

}
