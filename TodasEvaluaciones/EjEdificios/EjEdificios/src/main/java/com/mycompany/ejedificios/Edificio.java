/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejedificios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Edificio {

    private final boolean conserje = true;
    private boolean antiterremotos;
    private boolean pararrayos;
    private int num_plantas = (int) Math.round((Math.random() * 9) + 1);

    public Edificio(boolean antiterremotos, boolean pararrayos) {
        this.lista_Plantas = new ArrayList();
        this.antiterremotos = antiterremotos;
        this.pararrayos = pararrayos;
    }

    ArrayList<Planta> lista_Plantas;
    Scanner lector = new Scanner(System.in);

    public void crearPlantas() {
        for (int contador = 0; contador < this.num_plantas; contador++) {//LLENAR EDIFICIO AUTOMATICO
            int aux;
            if (this.num_plantas == contador - 1) {//SI ES LA ULTIMA PLANTA
                aux = (int) Math.round(Math.random() * 1);
                if (aux == 0) {//TIENE ALGO EN LA ULTIMA PLANTA
                    aux = (int) Math.round((Math.random() * 1));
                    if (aux == 0) {//TIENE JARDIN
                        crearJardin();
                    } else if (aux == 1) {//TIENE PISCINA
                        crearPiscina();
                    }
                } else if (aux == 1) {//NO HAY NI JARDIN NI PISCINA
                    aux = (int) Math.round((Math.random() * 2));
                    switch (aux) {
                        case 0:
                            //CREA UNA TIENDA
                            crearTienda();
                            break;
                        case 1:
                            //CREA UNA OFICINA
                            crearOficina();
                            break;
                        case 2:
                            //CREA UNA VIVIENDA
                            crearVivienda();
                            break;
                        default:
                            break;
                    }
                }//FIN NO HAY NI JARDIN NI PISCINA

            } //FIN ULTIMA PLANTA
            else if (0 == contador) {//SI ES PLANTA BAJA
                aux = (int) Math.round(Math.random() * 1);

                if (aux == 0) {//TIENE JARDIN
                    crearJardin();
                } else if (aux == 1) {//NO TIENE JARDIN
                    aux = (int) Math.round((Math.random() * 2));

                    switch (aux) {
                        case 0:
                            //CREA UNA TIENDA
                            crearTienda();
                            break;
                        case 1:
                            //CREA UNA OFICINA
                            crearOficina();
                            break;
                        case 2:
                            //CREA UNA VIVIENDA
                            crearVivienda();
                            break;
                        default:
                            break;
                    }
                }//FIN NO TIENE JARDIN

            }//FIN PLANTA BAJA
            else {//PLANTA INTERMEDIA
                aux = (int) Math.round((Math.random() * 2));
                switch (aux) {
                    case 0:
                        //CREA UNA TIENDA
                        crearTienda();
                        break;
                    case 1:
                        //CREA UNA OFICINA
                        crearOficina();
                        break;
                    case 2:
                        //CREA UNA VIVIENDA
                        crearVivienda();
                        break;
                    default:
                        break;
                }
            }//FIN PLANTA INTERMEDIA
        }

    }//FIN FUNCION

    public void añadir(Planta x) {//Añade la planta al array
        lista_Plantas.add(x);
    }

    public void mostrar() {//MUESTRA EL TO STRING DEL ARRAY

        for (int contador = 0; contador < lista_Plantas.size(); contador++) {
            System.out.println("En el piso nº " + contador + " " + lista_Plantas.get(contador));
        }
    }

    public void crearTienda() {//CREA UNA TIENDA
        System.out.println("Introduce el propietario de la tienda");
        Tienda planta_tienda = new Tienda(lector.next());
        añadir(planta_tienda);
    }

    public void crearOficina() {//CREA UNA OFICINA
        System.out.println("Introduce el propietario de la oficina");
        Oficina planta_oficina = new Oficina(lector.next());
        añadir(planta_oficina);
    }

    public void crearVivienda() {//CREA UNA VIVIENDA
        System.out.println("Introduce el propietario de la Vivienda");
        Vivienda planta_vivienda = new Vivienda(lector.next());
        añadir(planta_vivienda);
    }

    public void crearJardin() {//CREA UNA JARDIN        
        Jardin planta_baja = new Jardin(null);
        añadir(planta_baja);
    }

    public void crearPiscina() {//CREA UNA PISCINA        
        Piscina planta_ultima = new Piscina(null);
        añadir(planta_ultima);
    }

    public String AbrirYCerrar() {//EL CONSERJE ABRE Y CIERRA LA PUERTA
        if (this.conserje == true) {
            return "El conserje Abre/Cierra la puerta";
        } else {
            return "No hay conserje";
        }

    }

    public String tirarBasura() {//EL CONSERJE TIRA LA BASURA
        if (this.conserje == true) {
            return "El conserje tira la basura";
        } else {
            return "No hay conserje";
        }

    }

    public String Chiste() {//EL CONSERJE TE CUENTA UN CHISTE
        if (this.conserje == true) {
            return "El conserje te cuenta un chiste";
        } else {
            return "No hay conserje";
        }

    }

    public boolean isAntiterremotos() {
        return antiterremotos;
    }

    public void setAntiterremotos(boolean antiterremotos) {
        this.antiterremotos = antiterremotos;
    }

    public boolean isPararrayos() {
        return pararrayos;
    }

    public void setPararrayos(boolean pararrayos) {
        this.pararrayos = pararrayos;
    }

    public int getNum_plantas() {
        return num_plantas;
    }

    public void setNum_plantas(int num_plantas) {
        this.num_plantas = num_plantas;
    }

}
