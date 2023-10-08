/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConAmpliacion;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author isaac
 */
public class Agenda {

    ArrayList lista = new ArrayList<>();

    boolean añadirContacto(Contacto c) {
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
            Contacto aux = (Contacto) iter.next();
            if (aux.getNombre().equals(nombre)) {
                lista.remove(cont);
                return true;
            }
        }
        return false;
    }

    boolean existeContacto(String nombre) {
        for (Iterator iter = lista.iterator(); iter.hasNext();) {
            Contacto aux = (Contacto) iter.next();
            if (aux.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    void listarContactos() {
        for (Iterator iter = lista.iterator(); iter.hasNext();) {
            Contacto aux = (Contacto) iter.next();
            if (aux instanceof ContactoPersona) {
                System.out.println("Nombre: " + aux.getNombre() + ", teléfono: " + aux.getTelefono() + ",Cumpleaños " + ((ContactoPersona) aux).getCumpleaños());
            } else {
                System.out.println("Nombre: " + aux.getNombre() + ", teléfono: " + aux.getTelefono() + ",Pagina Web " + ((ContactoEmpresa) aux).getPaginaWeb());

            }
        }
    }

    int buscaContacto(String nombre) {
        int cont = 0;
        for (Iterator iter = lista.iterator(); iter.hasNext(); cont++) {
            Contacto aux = (Contacto) iter.next();
            if (aux.getNombre().equals(nombre)) {
                return cont + 1;
            }
        }
        return -1;

    }
}
