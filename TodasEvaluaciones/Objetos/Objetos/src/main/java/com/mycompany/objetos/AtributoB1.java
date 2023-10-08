/*
 Añade a la clase Punto un constructor con parámetros que copie las coordenadas pasadas como
argumento a los atributos del objeto. Así:
public Punto(int x, int y){
this.x = x;
this.y = y;
}
Copiamos los valores pasados como argumento a los atributos del
objeto. Ten en cuenta que int x e int y son variables locales del
método, NO son los atributos del objeto. Para hacer referencia a los
atributos del objeto hay que utilizar this.
Fíjate que ya no será posible hacer Punto p = new Punto(). Ahora será obligatorio hacer por
ejemplo Punto p = new Punto(2, 7). En el apartado A tenías que recordar asignar valores a x e y tras
crear un punto, lo cual no es una buena idea en proyectos grandes con cientos de objetos (es muy
fácil equivocarse). Ahora es imposible equivocarse porque Java no te dejará. Hemos asegurado que
todos los puntos siempre tendrán coordenadas.
Corrige el main y utiliza el constructor con parámetros para instanciar los objetos, pasándole como
argumento los valores deseados.

 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoB1 {

    int X;
    int Y;

    public AtributoB1(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public AtributoB1() {

    }

}
