/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author isaac
 */
public class Coches extends Terrestres {

    private boolean aireAcondicionado;

    public Coches(boolean aireAcondicionado, int cantidadRuedas, String matricula, String modelo) {
        super(cantidadRuedas, matricula, modelo);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    void imprimir() {
        System.out.println("La matricula es : " + this.getMatricula() + ",El modelo es : " + this.getModelo() + ", La cantidad de Ruedas es : "
                + this.getCantidadRuedas() + ",¿Tiene aire acondicionado? : " + this.isAireAcondicionado());
    }

}
