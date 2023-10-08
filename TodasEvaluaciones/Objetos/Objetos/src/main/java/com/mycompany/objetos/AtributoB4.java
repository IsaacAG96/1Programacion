/*
 Añade un constructor con 4 parámetros que asigne valores a nombre, precio, iva y
cuantosQuedan. Dicho constructor deberá mostrar un mensaje de error si alguno de los valores
nombre, precio, iva o cuantosQuedan no son válidos. ¿Qué condiciones crees que podrían
determinar si son válidos o no? Razónalo e implementa el código.
Corrige el main y prueba a crear varios artículos. Introduce algunos con valores incorrectos para
comprobar si avisa del error.
 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoB4 {

    String nombre;
    double precio;
    int stock;
    double pvp;
    final static double IVA = 21;

    public AtributoB4(String nombre, double precio, int stock, double pvp) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.pvp = pvp;

    }
}
