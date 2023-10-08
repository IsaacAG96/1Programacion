/*
 Añade a la clase Rectángulo métodos públicos con las siguientes funcionalidades:
• Método para imprimir la información del rectángulo por pantalla.
• Métodos setters dobles y cuadruples: setX1Y1, set X2Y2 y setAll(…).
• Métodos getPerimetro y getArea que calculen y devuelvan el perímetro y área del objeto.
Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.

 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoD3 {

    private int X1;
    private int Y1;
    private int X2;
    private int Y2;

    public AtributoD3() {
    }

    public int getX1() {
        return X1;
    }

    public void setX1(int X1) {
        this.X1 = X1;
    }

    public int getY1() {
        return Y1;
    }

    public void setY1(int Y1) {
        this.Y1 = Y1;
    }

    public int getX2() {
        return X2;
    }

    public void setX2(int X2) {
        this.X2 = X2;
    }

    public int getY2() {
        return Y2;
    }

    public void setY2(int Y2) {
        this.Y2 = Y2;
    }

    public void imprime() {
        System.out.println("Las coordenadas del rectangulo son: (" + this.getX1() + ","
                + this.getY1() + "),(" + this.getX1() + "," + this.getY2() + "),(" + this.getX2()
                + "," + this.getY1() + "),(" + this.getX2() + "," + this.getY2() + ")");

    }

    public void setAll(int x1, int y1, int x2, int y2) {
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);

    }

    public void setXY1(int x1, int y1) {
        this.setX1(x1);
        this.setY1(y1);

    }

    public void setXY2(int x2, int y2) {
        this.setX2(x2);
        this.setY2(y2);

    }

    public int getArea() {

        int ladoX = Math.abs(this.getX2() - this.getX1());
        int ladoY = Math.abs(this.getY2() - this.getY1());
        int area = ladoX * ladoY;

        return area;
    }

    public int getPerimetro() {

        int ladoX = Math.abs(this.getX2() - this.getX1());
        int ladoY = Math.abs(this.getY2() - this.getY1());
        int perimetro = 2 * ladoX + 2 * ladoY;

        return perimetro;
    }

}
