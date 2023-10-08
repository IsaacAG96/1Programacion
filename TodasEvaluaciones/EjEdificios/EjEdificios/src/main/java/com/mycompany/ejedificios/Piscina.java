/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejedificios;

/**
 *
 * @author isaac
 */
public class Piscina extends Planta {

    private final String propietario = null;

    public Piscina(String propietario) {
        super(propietario);

    }

    @Override
    public String toString() {
        return "Piscina{" + "superficie=" + superficie + ", puerta=" + puerta + '}';
    }

}
