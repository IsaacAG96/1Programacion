/*
Añade a la clase Rectángulo métodos públicos con las siguientes funcionalidades:
• Método para imprimir la información del rectángulo por pantalla.
• Métodos setters dobles y cuadruples: setX1Y1, set X2Y2 y setAll(…).
• Métodos getPerimetro y getArea que calculen y devuelvan el perímetro y área del objeto.
Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.

 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosD3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        AtributoD3 coordenadas1 = new AtributoD3();

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

            coordenadas1.imprime();

            System.out.println("Su perimetro mide: " + coordenadas1.getPerimetro());
            System.out.println("Su area mide: " + coordenadas1.getArea());

        } else {
            System.out.println("ERROR");
        }
    }

}
