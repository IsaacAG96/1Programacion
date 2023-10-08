/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author DAW
 */
public class Loro extends Aves {

    private String origen;
    private boolean habla;

    public Loro(String origen, boolean habla, boolean pico, boolean vuela, String nombre, int edad, String estado, String fechaNacimiento) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public String toString() {
        return "Loro{" + "nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
                + fechaNacimiento + ",pico=" + pico + ", vuela=" + vuela + ",origen=" + origen + ", habla=" + habla + '}';
    }

    public String getInfoCorta() {
        return "Es un Loro y se llama " + this.nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
