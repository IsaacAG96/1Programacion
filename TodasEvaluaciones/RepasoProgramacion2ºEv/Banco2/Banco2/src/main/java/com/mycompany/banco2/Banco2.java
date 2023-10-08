/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.banco2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Banco2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        ArrayList ListadoCuentas = new ArrayList();

        CuentaCorriente cuentacorriente = new CuentaCorriente(CuentaBancaria2.RandomIBAN());
        CuentaAhorro cuentaahorro = new CuentaAhorro(CuentaBancaria2.RandomIBAN());

        ListadoCuentas.add(cuentacorriente);
        ListadoCuentas.add(cuentaahorro);

        for (int posicion = 0; posicion < ListadoCuentas.size(); posicion++) {
            System.out.println(ListadoCuentas.get(posicion));
        }

        System.out.println("Introduce cantidad a ingresar en cuenta de ahorro");
        cuentaahorro.ingresarDinero(lector.nextInt());

        System.out.println("Introduce cantidad a retirar en cuenta de ahorro");
        cuentaahorro.retirarDinero(lector.nextInt());

        System.out.println("El Saldo antes de  sumarle tu interes es de " + cuentaahorro.getSaldo());
        cuentaahorro.calcularIntereses();
        System.out.println("El Saldo tras sumarle tu interes es de " + cuentaahorro.getSaldo());

        System.out.println("------------------------------------------------------------------------");

        System.out.println("Introduce cantidad a ingresar en cuenta de corriente");
        cuentacorriente.ingresarDinero(lector.nextInt());

        System.out.println("Introduce cantidad a retirar en cuenta de corriente");
        cuentacorriente.retirarDinero(lector.nextInt());

        System.out.println("El Saldo antes de  sumarle tu interes es de " + cuentacorriente.getSaldo());
        cuentacorriente.calcularIntereses();
        System.out.println("El Saldo tras sumarle tu interes es de " + cuentacorriente.getSaldo());

        System.out.println("Introduce la cantidad que quieres transpasar desde cuenta corriente a cuenta ahorro");
        double cantidad = lector.nextDouble();
        cuentacorriente.enviar(cantidad);
        cuentaahorro.recibir(cantidad);
        System.out.println("Tras el traspaso queda en cuenta ahorro: " + cuentaahorro.getSaldo() + " y en cuenta corriente :" + cuentacorriente.getSaldo());

        System.out.println("Introduce la cantidad que quieres transpasar desde cuenta ahorro a cuenta corriente");
        cantidad = lector.nextDouble();
        cuentaahorro.enviar(cantidad);
        cuentacorriente.recibir(cantidad);
        System.out.println("Tras el traspaso queda en cuenta ahorro: " + cuentaahorro.getSaldo() + " y en cuenta corriente :" + cuentacorriente.getSaldo());

    }

}
