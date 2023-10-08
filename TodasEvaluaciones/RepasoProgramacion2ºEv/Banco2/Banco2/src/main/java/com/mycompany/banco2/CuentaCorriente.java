/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco2;

/**
 *
 * @author isaac
 */
public class CuentaCorriente extends CuentaBancaria2 {

    public CuentaCorriente(String iban) {
        super(iban);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "iban=" + iban + ", saldo=" + saldo + ", interesAnualBasico=" + interesAnualBasico + '}';
    }

    @Override
    public void calcularIntereses() {

        this.setSaldo(this.getSaldo() + interesAnualBasico);
    }

}
