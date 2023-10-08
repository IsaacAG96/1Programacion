/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejedificios;

/**
 *
 * @author isaac
 */
public class Jardin extends Planta {

    private final String propietario = null;

    public Jardin(String propietario) {
        super(propietario);

    }

    @Override
    public String toString() {
        return "Jardines{" + "superficie=" + superficie + ", puerta=" + puerta + '}';
    }

}
