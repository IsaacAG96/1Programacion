/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjB;

/**
 *
 * @author isaac
 */
public class Alumno_B2 {

    private String nombre;
    private String apellido;
    private double nota_media;

    public Alumno_B2(String nombre, String apellido, double nota_media) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota_media = nota_media;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNota_media() {
        return nota_media;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }

    @Override
    public String toString() {
        return "El alumno " + nombre + " " + apellido + " tiene una nota media de : " + nota_media;
    }

}
