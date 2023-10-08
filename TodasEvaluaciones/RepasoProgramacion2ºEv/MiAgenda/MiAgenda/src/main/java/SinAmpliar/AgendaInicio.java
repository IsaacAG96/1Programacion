/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinAmpliar;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author isaac
 */
public class AgendaInicio {

    ArrayList<ContactoInicio> lista = new ArrayList<>();

    boolean añadirContacto(ContactoInicio c) {
        if (existeContacto(c.getNombre())) {
            return false;
        } else {
            lista.add(c);
            return true;
        }
    }

    boolean eliminarContacto(String nombre) {
        int cont = 0;
        for (Iterator iter = lista.iterator(); iter.hasNext(); cont++) {
            ContactoInicio aux = (ContactoInicio) iter.next();
            if (aux.getNombre().equals(nombre)) {
                lista.remove(cont);
                return true;
            }
        }
        return false;
    }

    boolean existeContacto(String nombre) {
        for (Iterator iter = lista.iterator(); iter.hasNext();) {
            ContactoInicio aux = (ContactoInicio) iter.next();
            if (aux.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    void listarContactos() {
        for (Iterator iter = lista.iterator(); iter.hasNext();) {
            ContactoInicio aux = (ContactoInicio) iter.next();
            System.out.println("Nombre: " + aux.getNombre() + ", teléfono: " + aux.getTelefono());
        }
    }

    int buscaContacto(String nombre) {
        int cont = 0;
        for (Iterator iter = lista.iterator(); iter.hasNext(); cont++) {
            ContactoInicio aux = (ContactoInicio) iter.next();
            if (aux.getNombre().equals(nombre)) {
                return cont + 1;
            }
        }
        return -1;

    }
}
