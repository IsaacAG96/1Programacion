/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planetas;

/**
 *
 * @author isaac
 */
public class Satelites extends Astros {

    private int distanciaPlaneta;
    private String planetaPertenece;

    public Satelites(int distanciaPlaneta, String planetaPertenece, double radio, int rotacion, int temperaturaMedia) {
        super(radio, rotacion, temperaturaMedia);
        this.distanciaPlaneta = distanciaPlaneta;
        this.planetaPertenece = planetaPertenece;
    }

    @Override
    public String toString() {
        return "Satelites{" + "radio=" + radio + ", rotacion=" + rotacion + ", temperaturaMedia=" + temperaturaMedia
                + ",distanciaPlaneta=" + distanciaPlaneta + ", planetaPertenece=" + planetaPertenece + '}';
    }

    public int getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(int distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public String getPlanetaPertenece() {
        return planetaPertenece;
    }

    public void setPlanetaPertenece(String planetaPertenece) {
        this.planetaPertenece = planetaPertenece;
    }

}
