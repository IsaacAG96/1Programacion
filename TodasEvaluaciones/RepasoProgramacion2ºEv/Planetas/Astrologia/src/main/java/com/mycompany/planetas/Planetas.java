/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planetas;

/**
 *
 * @author isaac
 */
public class Planetas extends Astros {

    private int distanciaSol;
    private boolean tieneSatelites;

    public Planetas(int distanciaSol, boolean tieneSatelites, double radio, int rotacion, int temperaturaMedia) {
        super(radio, rotacion, temperaturaMedia);
        this.distanciaSol = distanciaSol;
        this.tieneSatelites = tieneSatelites;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Planetas{" + "radio=" + radio + ", rotacion=" + rotacion + ", temperaturaMedia=" + temperaturaMedia + ",distanciaSol="
                + distanciaSol + ", tieneSatelites=" + tieneSatelites + '}';
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

}
