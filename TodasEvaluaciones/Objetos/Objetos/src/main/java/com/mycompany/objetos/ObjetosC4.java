/*
Aplica el encapsulamiento básico a la clase Articulo: Declara todos sus atributos como private y
crea todos los getters y setters necesarios (un get y un set por atributo).
Programa los setters para que comprueben los valores y los guarden en el objeto solo si son
correctos. En caso contrario muestra un mensaje de error.
 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosC4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        AtributoC4 articulo = new AtributoC4();

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
            System.out.println((articulo.getNombre()) + " - Precio:" + (articulo.getPrecio()) + " € - IVA 21% tiene un PVP de: " + (articulo.getPvp()) + " €");
            contador++;
        }
    }

    public static void precioIva(AtributoC4 articulo) {

        double aux = (articulo.getIva() / 100 * articulo.getPrecio());
        articulo.setPvp((aux + articulo.getPrecio()));

    }

}
