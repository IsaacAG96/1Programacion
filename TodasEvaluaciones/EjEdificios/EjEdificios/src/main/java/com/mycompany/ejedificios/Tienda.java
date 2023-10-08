/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejedificios;

/**
 *
 * @author isaac
 */
public class Tienda extends Planta {

    public Tienda(String propietario) {
        super(propietario);
    }

    @Override
    public String toString() {
        return "Tienda{" + "superficie=" + superficie + ", puerta=" + puerta + ", propietario=" + propietario + '}';
    }

}
