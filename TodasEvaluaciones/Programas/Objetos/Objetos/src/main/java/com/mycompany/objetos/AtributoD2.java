/*
Añade a la clase Persona los siguientes métodos públicos:
• public void imprime() // Imprime la información del objeto: “DNI:… Nombre:… etc.”
• public boolean esMayorEdad() // Devuelve true si es mayor de edad (false si no).
• public boolean esJubilado() // Devuelve true si tiene 65 años o más (false si no).
• public int diferenciaEdad(Persona p) // Devuelve la diferencia de edad entre ‘this’ y p.
Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.
 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoD2 {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public AtributoD2() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprime() {

        System.out.println("La persona " + this.getNombre() + " " + this.getApellidos()
                + " de edad " + this.getEdad() + " y con DNI " + this.getDni());
    }

    public boolean esMayorEdad() {
        if (this.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esJubilado() {
        if (this.getEdad() >= 65) {
            return true;
        } else {
            return false;
        }
    }

    public int diferenciaEdad(AtributoD2 persona) {
        int diferencia;

        if (this.edad >= persona.getEdad()) {

            diferencia = this.edad - persona.getEdad();

        } else {
            diferencia = persona.getEdad() - this.edad;

        }
        return diferencia;
    }
}
