/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejedificios;

/**
 *
 * @author isaac
 */
public class Vivienda extends Planta {

    public Vivienda(String propietario) {
        super(propietario);
    }

    @Override
    public String toString() {
        return "Vivienda{" + "superficie=" + superficie + ", puerta=" + puerta + ", propietario=" + propietario + '}';
    }

}
