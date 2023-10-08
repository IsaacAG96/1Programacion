/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejedificios;

/**
 *
 * @author isaac
 */
public class Programa {

    public static void main(String[] args) {
        String Separacion = "--------------------------------------------------------------------------------------";

        int aux = (int) Math.round(Math.random() * 4);

        switch (aux) {
            case 0: {//NO TIENE PARARRAYOS NI ANTITERREMOTO
                Edificio edificio = new Edificio(false, false);
                edificio.crearPlantas();
                System.out.println(Separacion);
                edificio.mostrar();
                break;
            }
            case 1: {//SOLO TIENE PARARRAYOS

                Edificio edificio = new Edificio(false, true);
                edificio.crearPlantas();
                System.out.println(Separacion);
                edificio.mostrar();
                break;
            }
            case 2: {//SOLO TIENE ANTITERREMOTO
                Edificio edificio = new Edificio(true, false);
                edificio.crearPlantas();
                System.out.println(Separacion);
                edificio.mostrar();
                break;
            }
            case 3: {//TIENE  PARARRAYOS Y ANTITERREMOTO
                Edificio edificio = new Edificio(true, true);
                edificio.crearPlantas();
                System.out.println(Separacion);
                edificio.mostrar();
                break;
            }
            default:
                break;
        }

    }
}
