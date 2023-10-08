/*
Añade a la clase Artículo métodos públicos con las siguientes funcionalidades:
• Método para imprimir la información del artículo por pantalla.
• Método getPVP que devuelva el precio de venta al público (PVP) con iva incluido.
• Método getPVPDescuento que devuelva el PVP con un descuento pasado como argumento.
• Método vender que actualiza los atributos del objeto tras vender una cantidad ‘x’ (si es
posible). Devolverá true si ha sido posible (false en caso contrario).
• Método almacenar que actualiza los atributos del objeto tras almacenar una cantidad ‘x’ (si
es posible). Devolverá true si ha sido posible (false en caso contrario).
 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lector = new Scanner(System.in);

        AtributoD4 articulo = new AtributoD4();

        String comprobarNombre;
        double comprobarPrecio;
        int comprobarStock;

        int cantidad;
        System.out.println("Introduce cantidad de articulos a introducir");
        cantidad = lector.nextInt();
        int contador = 0;

        while (contador < cantidad) {
            System.out.println("Introduce el nombre del articulo");
            comprobarNombre = lector.next();
            if (comprobarNombre.length() > 1) {
                articulo.setNombre(comprobarNombre);

            } else {
                System.out.println("ERROR");
                break;
            }

            System.out.println("Introduce el precio");
            comprobarPrecio = lector.nextDouble();

            if (comprobarPrecio > 0) {
                articulo.setPrecio(comprobarPrecio);

            } else {
                System.out.println("ERROR");
                break;
            }

            System.out.println("Introduce el stock");
            comprobarStock = lector.nextInt();
            if (comprobarStock > 0) {
                articulo.setStock(comprobarStock);

            } else {
                System.out.println("ERROR");
                break;

            }

            precioIva(articulo);
            System.out.println("Introduce un descuento porcentual");
            double aux = lector.nextInt() / 100;

            System.out.println("El precio tras el descuento es: " + articulo.getPvpDescuento(aux));

            System.out.println("¿Cuantos articulos han entrado o han salido de stock?");

            int cambio = lector.nextInt();

            articulo.cambioStock(cambio);

            articulo.imprime();

            contador++;
        }
    }

    public static void precioIva(AtributoD4 articulo) {

        double aux = (articulo.getIva() / 100 * articulo.getPrecio());
        articulo.setPvp((aux + articulo.getPrecio()));

    }

}
asfa