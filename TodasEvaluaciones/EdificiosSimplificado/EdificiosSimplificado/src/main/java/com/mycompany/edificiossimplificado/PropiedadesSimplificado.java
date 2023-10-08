/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edificiossimplificado;

/**
 *
 * @author DAW
 */
public abstract class PropiedadesSimplificado {

    protected String propietario;
    protected int puerta = (int) Math.round((Math.random() * 4) + 1);

    public PropiedadesSimplificado(String propietario) {
        this.propietario = propietario;
    }

}
