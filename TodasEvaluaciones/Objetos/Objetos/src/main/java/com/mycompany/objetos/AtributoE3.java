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

/**
 *
 * @author DAW
 */
public class AtributoE3 {

    private int X1;
    private int Y1;
    private int X2;
    private int Y2;
    private int min;
    private int max;

    public AtributoE3() {
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


asd