/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco2;

/**
 *
 * @author isaac
 */
public class CuentaAhorro extends CuentaBancaria2 {

    private final int saldoMinimo = 500;

    public CuentaAhorro(String iban) {
        super(iban);
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "iban=" + iban + ", saldo=" + saldo + ", interesAnualBasico=" + interesAnualBasico + ",saldoMinimo=" + saldoMinimo + '}';
    }

    @Override
    public void calcularIntereses() {

        if (this.getSaldo() >= this.saldoMinimo) {
            this.setSaldo(this.getSaldo() + (interesAnualBasico / 2));

        } else if (this.getSaldo() < this.saldoMinimo) {
            this.setSaldo(this.getSaldo() + (interesAnualBasico * 2));

        }
    }

}
