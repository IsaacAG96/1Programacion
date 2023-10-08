/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edificiossimplificado;

/**
 *
 * @author DAW
 */
public class EdificioSimplificado {

    private int plantas;
    private boolean antiterremotos;
    private boolean pararrayos;

    public EdificioSimplificado(int plantas) {
        this.plantas = plantas;
    }

    private void crearPlantas(int plantas) {

        for (int contador = 0; contador < plantas; contador++) {
            PlantaSimplificado planta = new PlantaSimplificado();
        }
    }

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }
}
