/*
Necesitamos hacer algunos cambios para que todas las coordenadas estén entre (0,0) y (100,100).
Añade a la clase Rectángulo dos atributos llamados min y max. Estos valores son comunes a todos
los objetos y no pueden variar. Piensa qué modificados necesitas añadir a min y max.
Utiliza min y max en el constructor y en los setters para comprobar los valores (como de
costumbre, si no son correctos muestra un mensaje de error y apliques los cambios).
También necesitamos un método no constructor para crear rectángulos aleatorios. Impleméntalo.
Realiza pruebas en el main para comprobar su funcionamiento.
 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        AtributoE3 coordenadas1 = new AtributoE3();

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


asd