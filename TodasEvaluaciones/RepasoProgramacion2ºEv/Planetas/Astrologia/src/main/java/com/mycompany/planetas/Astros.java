/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planetas;

/**
 *
 * @author isaac
 */
public abstract class Astros {

    protected double radio;
    protected int rotacion;
    protected int temperaturaMedia;

    public Astros(double radio, int rotacion, int temperaturaMedia) {
        this.radio = radio;
        this.rotacion = rotacion;
        this.temperaturaMedia = temperaturaMedia;
    }

    @Override
    public String toString() {
        return "Astros{" + "radio=" + radio + ", rotacion=" + rotacion + ", temperaturaMedia=" + temperaturaMedia + '}';
    }

    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public int getRotacion() {
        return rotacion;
    }

    public void setRotacion(int rotacion) {
        this.rotacion = rotacion;
    }

    public int getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(int temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

}
