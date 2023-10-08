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

/**
 *
 * @author DAW
 */
public class AtributoB3 {

    int X1;
    int Y1;
    int X2;
    int Y2;

    public AtributoB3(int X1, int Y1, int X2, int Y2) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
    }
}
