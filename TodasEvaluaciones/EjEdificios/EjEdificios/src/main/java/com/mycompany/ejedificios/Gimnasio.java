/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejedificios;

/**
 *
 * @author isaac
 */
public class Gimnasio extends Planta {

    private final String propietario = null;

    public Gimnasio(String propietario) {
        super(propietario);
    }

    @Override
    public String toString() {
        return "Gimnasio{" + "superficie=" + superficie + ", puerta=" + puerta + '}';
    }

}
