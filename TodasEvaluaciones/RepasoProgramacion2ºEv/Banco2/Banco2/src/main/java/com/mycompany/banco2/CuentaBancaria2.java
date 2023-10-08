/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco2;

/**
 *
 * @author isaac
 */
public abstract class CuentaBancaria2 {

    protected final String iban;
    double saldo = 0;
    protected final int interesAnualBasico = 100;

    public CuentaBancaria2(String iban) {
        this.iban = iban;
    }

    public abstract void calcularIntereses();

    @Override
    public String toString() {
        return "CuentaBancaria2{" + "iban=" + iban + ", saldo=" + saldo + ", interesAnualBasico=" + interesAnualBasico + '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(int cantidad) {
        this.setSaldo(this.getSaldo() + cantidad);
    }

    public void retirarDinero(int cantidad) {
        this.setSaldo(this.getSaldo() - cantidad);
    }

    public void enviar(double cantidad) {
        this.setSaldo(this.getSaldo() - cantidad);
    }

    public void recibir(double cantidad) {
        this.setSaldo(this.getSaldo() + cantidad);
    }

    public static String RandomIBAN() {//GENERA UN IBAN VALIDO ALEATORIO
        String IBAN_Generado = "ES";
        for (int i = 0; i < 22; i++) {
            int aleatorio = (int) Math.round(Math.random() * 9);
            IBAN_Generado += Integer.toString(aleatorio);
        }

        return IBAN_Generado;

    }

}
