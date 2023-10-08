/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.listadeobjetos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author isaac
 */
public class ListaDeObjetos {

    public static void main(String[] args) {

        ArrayList Listado = new ArrayList();// SE CREA EL ARRAY LIST Y LUEGO SE IMPORTA. OTRA OPCION SERIA CREARLO ASI: ArrayList<Producto> Listado = new ArrayList<>();

        Producto Objeto1 = new Producto("azucar", 100); //SE CREA OBJETO
        Producto Objeto2 = new Producto("pimienta", 70); //SE CREA OBJETO
        Producto Objeto3 = new Producto("carne", 10); //SE CREA OBJETO
        Producto Objeto4 = new Producto("pescado", 5); //SE CREA OBJETO
        Producto Objeto5 = new Producto("nueces", 35); //SE CREA OBJETO

        System.out.println("Antes de llenar el ArrayList:" + Listado.size()); //COMPRUEBA EL TAMAÑO DEL ARRAYLIST

        Listado.add(Objeto1);  //SE AÑADE OBJETO A LA LISTA
        Listado.add(Objeto2);  //SE AÑADE OBJETO A LA LISTA
        Listado.add(Objeto3);  //SE AÑADE OBJETO A LA LISTA
        Listado.add(Objeto4);  //SE AÑADE OBJETO A LA LISTA
        Listado.add(new Producto("nueces", 35));  //SE  CREA Y AÑADE OBJETO A LA LISTA A LA VEZ

        System.out.println("Despues de llenar el ArrayList:" + Listado.size()); //COMPRUEBA EL TAMAÑO DEL ARRAYLIST

        //System.out.println("El listado es el siguiente: ");
        //for (int posicion = 0; posicion < Listado.size(); posicion++) {
        //  System.out.println("El producto de la posicion " + posicion + " es " + Listado.get(posicion));
        //}
        Iterator iteratorLista = Listado.iterator(); // SE CREA UN ITERATOR LLAMADO IT PARA EL ARRAYLIST  Y SE IMPORTA

        while (iteratorLista.hasNext()) {
            System.out.println(iteratorLista.next()); //RECORRE EL ARRAY HASTA QUE NO HAYA MAS HUECOS
        }

        Listado.remove(3);//BORRAMOS EL OBJETO DE LA POSICION 3(AL BORRAR SE RECOLOCAN LLENANDO EL HUECO)
        Listado.remove(0); //BORRAMOS EL OBJETO DE LA POSICION 0 (AL BORRAR SE RECOLOCAN LLENANDO EL HUECO)

        System.out.println("Despues de eliminar 2 objetos del ArrayList:" + Listado.size()); //COMPRUEBA EL TAMAÑO DEL ARRAYLIST

        System.out.println("Antes de añadir un objeto en una posicion en concreto: " + Listado.size());//COMPRUEBA EL TAMAÑO DEL ARRAYLIST
        Producto Objeto6 = new Producto("pan", 2); //SE CREA OBJETO
        Listado.add(2, Objeto6);

        System.out.println("Tras añadir un objeto nuevo en una posicion en concreto: " + Listado.size());//COMPRUEBA EL TAMAÑO DEL ARRAYLIST

        iteratorLista = Listado.iterator(); // SE REINICIA EL ITERATOR

        while (iteratorLista.hasNext()) {
            System.out.println(iteratorLista.next()); //RECORRE EL ARRAY HASTA QUE NO HAYA MAS HUECOS
        }

        Listado.clear(); //BORRAMOS TODA LA LISTA

        System.out.println("El listado esta vacio: " + Listado.isEmpty());//SI DEVUELVE TRUE ESTA VACIA

    }
}
