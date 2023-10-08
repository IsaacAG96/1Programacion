/*
Añade un constructor con 4 parámetros que asigne valores a nombre, precio, iva y
cuantosQuedan. Dicho constructor deberá mostrar un mensaje de error si alguno de los valores
nombre, precio, iva o cuantosQuedan no son válidos. ¿Qué condiciones crees que podrían
determinar si son válidos o no? Razónalo e implementa el código.
Corrige el main y prueba a crear varios artículos. Introduce algunos con valores incorrectos para
comprobar si avisa del error.
 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el nombre del articulo,el precio y la cantidad en stock");

        String auxNombre = lector.next();
        double auxPrecio = lector.nextDouble();
        int auxStock = lector.nextInt();
        double auxPvp = precioIva(AtributoB4.IVA, auxPrecio);

        AtributoB4 articulo = new AtributoB4(auxNombre, auxPrecio, auxStock, auxPvp);

        if (articulo.pvp >= 0 && articulo.stock > 0) {

            System.out.println((articulo.nombre) + " - Precio:" + (articulo.precio) + " € - IVA 21% tiene un PVP de: " + (articulo.pvp) + " € y quedan " + (articulo.stock) + " unidades");

        } else {
            System.out.println("Precio o stock incorrecto");
        }

    }

    public static double precioIva(double iva, double auxPrecio) {

        double aux = iva / 100 * auxPrecio;
        double resultado = (aux + auxPrecio);
        return resultado;

    }
}
