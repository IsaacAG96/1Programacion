/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author DAW
 */
public class Gato extends Mascotas {

    private String color;
    private boolean peloLargo;

    public Gato(String color, boolean peloLargo, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + ",color=" + color + ", peloLargo=" + peloLargo + '}';
    }

    public String getInfoCorta() {
        return "Es un Gato y se llama " + this.nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
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
