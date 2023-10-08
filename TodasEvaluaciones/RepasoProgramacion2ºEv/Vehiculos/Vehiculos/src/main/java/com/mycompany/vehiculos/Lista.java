/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author isaac
 */
public class Lista {

    ArrayList<Vehiculo> Listado = new ArrayList();//SE CREA EL ARRAY LIST

    public void Añadir(Vehiculo objeto) {//AÑADE UN OBJETO YA CREADO AL ARRAY LIST(NO VALE PARA CREARLO DENTRO DIRECTAMENTE)
        Listado.add(objeto);

    }

    public String getTipo(Vehiculo X) {//SE COMPRUEBA EL TIPO DE OBJETO QUE ES EL QUE INDICAMOS

        if (X instanceof Coches) {
            return "Motos";
        } else if (X instanceof Motos) {
            return "Motos";
        } else if (X instanceof Barcos) {
            return "Barcos";
        } else if (X instanceof Submarinos) {
            return "Submarinos";
        } else if (X instanceof Aviones) {
            return "Aviones";
        } else if (X instanceof Helicopteros) {
            return "Helicopteros";
        } else if (X instanceof Terrestres) {
            return "Terrestres";
        } else if (X instanceof Acuaticos) {
            return "Acuaticos";
        } else if (X instanceof Aereos) {
            return "Aereos";

        } else {
            return null;
        }
    }//FIN getTipo

    public void infoReducida() { //MUESTRA LA INFO  DEL OBJETO EN EL ARRAY LIST LIMITADA A LA INDICADA

        System.out.println("Listado con informacion limitada");
        for (int contador = 0; contador < Listado.size(); contador++) {

            Vehiculo X = Listado.get(contador);

            System.out.println("El vehiculo tiene una Matricula : " + X.getMatricula() + " y su modelo es : " + X.getModelo());

        }
    }

    public void Eliminar(int posicion) {//ELIMINA EL OBJETO DE LA POSICION INDICADA
        Listado.remove(posicion);
    }

    public void Vaciar() {//VACIA TODO EL ARRAY LIST
        Listado.clear();
    }

    public void mostrarLista() {
        for (Iterator iter = Listado.iterator(); iter.hasNext();) {

            Vehiculo aux = (Vehiculo) iter.next();
            if (aux instanceof Coches) {
                Coches coche = (Coches) aux;
                System.out.println("\nInfo coche.");
                coche.imprimir();
            } else if (aux instanceof Motos) {
                Motos motos = (Motos) aux;
                System.out.println("\nInfo moto.");
                motos.imprimir();
            } else if (aux instanceof Barcos) {
                Barcos barcos = (Barcos) aux;
                System.out.println("\nInfo barcos.");
                barcos.imprimir();
            } else if (aux instanceof Submarinos) {
                Submarinos submarinos = (Submarinos) aux;
                System.out.println("\nInfo submarinos.");
                submarinos.imprimir();
            } else if (aux instanceof Aviones) {
                Aviones aviones = (Aviones) aux;
                System.out.println("\nInfo aviones.");
                aviones.imprimir();
            } else if (aux instanceof Helicopteros) {
                Helicopteros helicopteros = (Helicopteros) aux;
                System.out.println("\nInfo helicopteros.");
                helicopteros.imprimir();
            } else if (aux instanceof Terrestres) {
                Terrestres terrestres = (Terrestres) aux;
                System.out.println("\nInfo terrestres.");
                terrestres.imprimir();
            } else if (aux instanceof Acuaticos) {
                Acuaticos acuaticos = (Acuaticos) aux;
                System.out.println("\nInfo acuaticos.");
                acuaticos.imprimir();
            } else if (aux instanceof Aereos) {
                Aereos aereos = (Aereos) aux;
                System.out.println("\nInfo aereos.");
                aereos.imprimir();
            }
        }
    }

}
