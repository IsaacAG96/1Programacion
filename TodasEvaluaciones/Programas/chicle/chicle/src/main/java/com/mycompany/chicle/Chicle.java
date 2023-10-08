/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.chicle;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Chicle {

    public static void main(String[] args) {

        long chiclesComprados;
        long envoltoriosNecesarios;
        long multiplicadorChicles;
        boolean ruina = false;

        long chiclesGratis = 0;
        long chiclesTotales = 0;
        long envoltoriosSobrantes = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuantos chicles compras?");
        chiclesComprados = lector.nextLong();

        System.out.println("¿Cuantos envoltorios te hacen falta?");
        envoltoriosNecesarios = lector.nextLong();

        System.out.println("¿Cuantos chicles extra me dan cada vez?");
        multiplicadorChicles = lector.nextLong();

        if (multiplicadorChicles >= envoltoriosNecesarios) {//cuando son chicles infinitos//
            ruina = true;
            System.out.println("RUINA");
        } else if (envoltoriosNecesarios >= multiplicadorChicles) {

            while (chiclesComprados >= envoltoriosNecesarios || chiclesGratis >= envoltoriosNecesarios) {//bucle hasta no poder conseguir mas chicles gratis//

                if (chiclesComprados % envoltoriosNecesarios == 0 || chiclesGratis % envoltoriosNecesarios == 0) {
                    if (chiclesComprados > 0) {//1º calculo para ver chicles gratis//

                        chiclesGratis = (chiclesComprados / envoltoriosNecesarios) * multiplicadorChicles; //(25 entre 5)*1=5//
                        chiclesTotales = chiclesTotales + chiclesGratis + chiclesComprados;// 0+5+25=30//
                        chiclesComprados = 0;
                    } else if (chiclesComprados == 0) {//2º calculo para ver cuantos chicles gratis extra se sacan con los que nos regalan//
                        chiclesGratis = (chiclesGratis / envoltoriosNecesarios) * multiplicadorChicles;//(5 entre 5)*1=1//
                        chiclesTotales = chiclesTotales + chiclesGratis;//30++1=31//

                    }
                    if (chiclesGratis < envoltoriosNecesarios) {//envoltorios que no hemos podido utilizar//
                        envoltoriosSobrantes = chiclesGratis;

                    }

                }

            }

        }
        if (ruina == false) {//sucede cuando no hay chicles infinitos//

            System.out.println("Has conseguido " + chiclesTotales + " en total");
            System.out.println("Te han sobrado " + envoltoriosSobrantes + " envoltorios");
        }
    }
}
