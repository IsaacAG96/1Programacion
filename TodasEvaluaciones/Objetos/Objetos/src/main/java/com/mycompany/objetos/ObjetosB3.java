/*
En nuestro software necesitamos asegurarnos de que la coordenada (x1,y1)
represente la esquina inferior izquierda y la (x2,y2) la superior derecha del
rectángulo, como en el dibujo.
Añade a Rectangulo un constructor con los 4 parámetros. Incluye un if que
compruebe los valores (*). Si son válidos guardará los parámetros en el objeto.
Si no lo son mostrará un mensaje del estilo “ERROR al instanciar Rectangulo...”
utilizando System.err.println(…). No podremos evitar que se instancie el objeto
pero al menos avisaremos por pantalla.
Corrige el main para utilizar dicho constructor. Debería mostrar un mensaje de error.
(*) Pista: Es suficiente con un if ( (condición) && (condición) )

 */
package com.mycompany.objetos;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosB3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce las coordenadas X1,Y1,X2,Y2 en dicho orden");
        AtributoB3 coordenadas1 = new AtributoB3(lector.nextInt(), lector.nextInt(), lector.nextInt(), lector.nextInt());

        if ((coordenadas1.X1 < coordenadas1.X2) && (coordenadas1.Y1 < coordenadas1.Y2)) {

            System.out.println("Las coordenadas del rectangulo son: (" + coordenadas1.X1 + ","
                    + coordenadas1.Y1 + "),(" + coordenadas1.X1 + "," + coordenadas1.Y2 + "),(" + coordenadas1.X2
                    + "," + coordenadas1.Y2 + "),(" + coordenadas1.X2 + "," + coordenadas1.Y1 + ")");

            int ladoX = Math.abs(coordenadas1.X2 - coordenadas1.X1);
            int ladoY = Math.abs(coordenadas1.Y2 - coordenadas1.Y1);

            System.out.println("Su perimetro mide: " + (2 * ladoX + 2 * ladoY));
            System.out.println("Su area mide: " + (ladoX * ladoY));

        } else {
            System.out.println("ERROR");
        }

    }

}
