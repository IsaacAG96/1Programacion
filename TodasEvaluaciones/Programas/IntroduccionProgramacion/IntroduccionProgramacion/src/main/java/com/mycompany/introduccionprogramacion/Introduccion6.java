/*
6. Dibuja un ordinograma que dado el precio de un artículo y el precio de venta real nos muestre
el porcentaje de descuento realizado */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precioInicial, precioVenta, descuento;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el precio original del articulo");
        precioInicial = lector.nextDouble();

        System.out.println("Introduce el precio de venta del articulo");
        precioVenta = lector.nextDouble();

        descuento = ((precioInicial - precioVenta) * 100) / precioInicial;
        System.out.println("El descuento es de:" + descuento);
    }

}
