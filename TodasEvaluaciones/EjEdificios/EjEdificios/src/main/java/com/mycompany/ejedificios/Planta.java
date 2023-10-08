/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejedificios;

/**
 *
 * @author isaac
 */
public abstract class Planta {

    protected final int superficie = (int) Math.round((Math.random() * 1000) + 50);//La superficie tendra maximo 1000 m2 y minimo 50 m2
    protected final int puerta = (int) Math.round((Math.random() * 5) + 1); //La planta tendra maximo 5 puertas y minimo 1
    protected String propietario;

    public Planta(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Planta{" + "superficie=" + superficie + ", puerta=" + puerta + ", propietario=" + propietario + '}';
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}
