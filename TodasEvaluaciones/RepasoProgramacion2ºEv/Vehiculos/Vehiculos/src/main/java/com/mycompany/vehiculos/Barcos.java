/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author isaac
 */
public class Barcos extends Acuaticos {

    private boolean motor;

    public Barcos(boolean motor, int eslora, String matricula, String modelo) {
        super(eslora, matricula, modelo);
        this.motor = motor;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    void imprimir() {
        System.out.println("La matricula es : " + this.getMatricula() + ",El modelo es : " + this.getModelo() + ", La cantidad de Eslora es : "
                + this.getEslora() + ",¿Tiene motor? : " + isMotor());
    }

}
