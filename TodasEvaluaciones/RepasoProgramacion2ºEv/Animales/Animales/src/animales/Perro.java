/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author DAW
 */
public class Perro extends Mascotas {

    private String raza;
    private int pulgas;

    public Perro(String raza, int pulgas, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public String toString() {
        return "Perro{"+ "nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + ",raza=" + raza + ", pulgas=" + pulgas + '}';
    }

    public String getInfoCorta() {
        return "Es un perro y se llama " + this.nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPulgas() {
        return pulgas;
    }

    public void setPulgas(int pulgas) {
        this.pulgas = pulgas;
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
