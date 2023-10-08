/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author DAW
 */
public class Canario extends Aves {

    private String color;
    private boolean canta;

    public Canario(String color, boolean canta, boolean pico, boolean vuela, String nombre, int edad, String estado, String fechaNacimiento) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public String toString() {
        return "Canario{" + "nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
                + fechaNacimiento + ",pico=" + pico + ", vuela=" + vuela + ",color=" + color + ", canta=" + canta + '}';
    }

    public String getInfoCorta() {
        return "Es un Canario y se llama " + this.nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
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
