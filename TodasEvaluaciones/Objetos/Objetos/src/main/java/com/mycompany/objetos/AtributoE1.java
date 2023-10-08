/*
Necesitamos un método que nos permita crear un objeto Punto con coordenadas aleatorias. Esta
funcionalidad no depende de ningún objeto concreto por lo que será estática. Deberá crear un
nuevo Punto (utiliza el constructor) con x e y entre -100 y 100, y luego devolverlo (con return).
• public static Punto creaPuntoAleatorio()
Pruebalo en el main para comprobar que funciona. Crea varios puntos aleatorios con
Punto.creaPuntoAleatorio() e imprime su valor por pantalla.
 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoE1 {

    private int X;
    private int Y;

    public AtributoE1() {

    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public void imprime() {
        System.out.println("Coordenadas: " + this.getX() + "," + this.getY());

    }

    public static int creaPuntoAleatorio() {

        int posicionAleatoria;
        posicionAleatoria = (int) Math.round(Math.random() * (100 - -100) + -100);

        return posicionAleatoria;
    }

}
