/*
Crea un programa con una clase llamada Articulo con los siguientes atributos: nombre, precio (sin
IVA), iva (siempre será 21) y cuantosQuedan (representa cuantos quedan en el almacén).
En el main de la clase principal instancia un objeto de la clase artículo. Asígnale valores a todos sus
atributos (los que quieras) y muestra por pantalla un mensaje del estilo “Pijama - Precio:10€ -
IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es decir, el precio con IVA). Luego,
cambia el precio y vuelve a imprimir el mensaje */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        AtributoA4 articulo = new AtributoA4();

        System.out.println("Introduce el nombre del articulo");
        articulo.nombre = lector.next();

        System.out.println("Introduce el precio");
        articulo.precio = lector.nextDouble();

        System.out.println("Introduce el stock");
        articulo.stock = lector.nextInt();

        precioIva(articulo);
        System.out.println((articulo.nombre) + " - Precio:" + (articulo.precio) + " € - IVA 21% tiene un PVP de: " + (articulo.pvp) + " €");

    }

    public static void precioIva(AtributoA4 articulo) {

        double aux = (articulo.iva) / 100 * articulo.precio;
        articulo.pvp = (aux + articulo.precio);

    }

}
