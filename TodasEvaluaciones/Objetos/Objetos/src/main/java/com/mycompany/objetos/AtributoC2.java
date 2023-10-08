/*
Aplica el encapsulamiento básico a la clase Persona: Declara todos sus atributos como private y
crea todos los getters y setters necesarios (un get y un set por atributo).
Corrige el main para utilizar los getters y setters. Prueba a instanciar varios objetos, mostrar sus
valores por pantalla, modificarlos, etc.
 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoC2 {

    private String dni;
    private String nombre;
    private String apellidos;

    public AtributoC2() {

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
    private int edad;
}
