/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresaurio;

import java.util.Set;

/**
 *
 * @author isaac
 */
public class Empresa {

    private final String nombre;
    private final String CIF;
    private int telefono;
    private String direccion;
    private int empleados = 0;

    public Empresa(String nombre, String CIF, int telefono, String direccion) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Empresa(String nombre, String CIF) {
        this.nombre = nombre;
        this.CIF = CIF;

    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public void añadirEmpleados(int añadidos) {
        this.setEmpleados(this.getEmpleados() + añadidos);
        System.out.println("Hay : " + this.getEmpleados());

    }

    public void eliminarEmpleados(int eliminados) {
        this.setEmpleados(this.getEmpleados() - eliminados);
        System.out.println("Quedan : " + this.getEmpleados());
    }

    public String infoTodosEmpleados(String nombre, String DNI, int sueldoBrutoMensual, int edad, int telefono, String direccion) {

        return "Empleado{" + "nombre=" + nombre + ", DNI=" + DNI + ", sueldoBrutoMensual=" + sueldoBrutoMensual + ", edad=" + edad + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

    public String infoDNISueldos(String DNI, int sueldoBrutoMensual, double sueldoNeto) {

        return "El DNI " + DNI + " , Sueldo Bruto Mensual " + sueldoBrutoMensual + " Sueldo Neto Mensual " + (sueldoNeto / 12);
    }

    public int sumaBrutoTotal(int SueldoBrutoMensual) {
        int total;
        total = SueldoBrutoMensual * this.getEmpleados();
        return total;
    }

    public double sumaNetoTotal(double sueldoNeto) {
        double total;
        total = sueldoNeto * this.getEmpleados();
        return total;

    }

}
