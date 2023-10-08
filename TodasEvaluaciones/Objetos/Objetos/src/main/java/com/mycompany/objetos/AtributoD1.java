/*
 Añade a la clase Punto los siguientes métodos públicos:
• public void imprime() // Imprime por pantalla las coordenadas. Ejemplo: “(7, -5)”
• public void setXY(int x, int y) // Modifica ambas coordenadas. Es como un setter doble.
• public void desplaza(int dx, int dy) // Desplaza el punto la cantidad (dx,dy) indicada.
Ejemplo: Si el punto (1,1) se desplaza (2,5) entonces estará en (3,6).
• public int distancia(Punto p) // Calcula y devuelve la distancia entre el propio objeto (this) y
otro objeto (Punto p) que se pasa como parámetro: distancia entre dos coordenadas.
Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.
 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoD1 {

    private int X;
    private int Y;

    public AtributoD1() {

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

    public void setXY(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public void desplaza(int dx, int dy) {
        this.setX(dx + this.getX());
        this.setY(dy + this.getY());
        this.imprime();

    }

}
