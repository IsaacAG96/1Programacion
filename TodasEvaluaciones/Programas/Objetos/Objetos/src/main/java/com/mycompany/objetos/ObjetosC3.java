/*
 Aplica el encapsulamiento básico a la clase Rectángulo: Declara todos sus
atributos como private y crea todos los getters y setters necesarios (un get y un
set por atributo).
¿Recuerdas la condición explicada en B3? Tendrás que programar los setters
de modo que comprueben el valor pasado como argumento antes de guardarlo
en el objeto. Si no fuera correcto se mostrará un mensaje de error (y NO se
guardará el valor).
Corrige el main para utilizar los getters y setters. Prueba a instanciar varios objetos, mostrar sus
valores, modificarlos, etc. Prueba varios valores erróneos para comprobar si funciona.

 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosC3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        AtributoC3 coordenadas1 = new AtributoC3();

        System.out.println("Introduce las coordenadas de la posición  X1");
        int X1 = lector.nextInt();
        System.out.println("Introduce las coordenadas de la posición  Y1");
        int Y1 = lector.nextInt();
        System.out.println("Introduce las coordenadas de la posición  X2");
        int X2 = lector.nextInt();
        System.out.println("Introduce las coordenadas de la posición Y2");
        int Y2 = lector.nextInt();

        if ((X1 < X2) && (Y1 < Y2)) {

            coordenadas1.setX1(X1);
            coordenadas1.setY1(Y1);
            coordenadas1.setX2(X2);
            coordenadas1.setY2(Y2);

            System.out.println("Las coordenadas del rectangulo son: (" + coordenadas1.getX1() + ","
                    + coordenadas1.getY1() + "),(" + coordenadas1.getX1() + "," + coordenadas1.getY2() + "),(" + coordenadas1.getX2()
                    + "," + coordenadas1.getY1() + "),(" + coordenadas1.getX2() + "," + coordenadas1.getY2() + ")");

            int ladoX = Math.abs(coordenadas1.getX2() - coordenadas1.getX1());
            int ladoY = Math.abs(coordenadas1.getY2() - coordenadas1.getY1());

            System.out.println("Su perimetro mide: " + (2 * ladoX + 2 * ladoY));
            System.out.println("Su area mide: " + (ladoX * ladoY));

        } else {
            System.out.println("ERROR");
        }
    }

}
