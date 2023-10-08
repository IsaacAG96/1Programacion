/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresaurio;

/**
 *
 * @author isaac
 */
public class Empleado {

    private final String nombre;
    private final String DNI;
    private int sueldoBrutoMensual;
    private int edad;
    private int telefono;
    private String direccion;

    public Empleado(String nombre, String DNI, int sueldoBrutoMensual, int edad, int telefono, String direccion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoBrutoMensual = sueldoBrutoMensual;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Empleado(String nombre, String DNI, int sueldoBrutoMensual) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoBrutoMensual = sueldoBrutoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public int getSueldoBrutoMensual() {
        return sueldoBrutoMensual;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void infoEmpleado() {

        System.out.println("Nombre : " + this.getNombre() + " , DNI : " + this.getDNI() + " ,Sueldo Bruto Mensual : " + this.getSueldoBrutoMensual());

    }

    public double sueldoNeto(int sueldoBrutoMensual) {

        double neto;

        if (sueldoBrutoMensual < 12000) {

            neto = (sueldoBrutoMensual - (sueldoBrutoMensual * 0.2)) * 12;
            return neto;

        } else if (12000 >= sueldoBrutoMensual && sueldoBrutoMensual <= 25000) {
            neto = (sueldoBrutoMensual - (sueldoBrutoMensual * 0.3)) * 12;
            return neto;

        } else if (sueldoBrutoMensual > 25000) {

            neto = (sueldoBrutoMensual - (sueldoBrutoMensual * 0.4)) * 12;
            return neto;
        }
        return 0;
    }

}
