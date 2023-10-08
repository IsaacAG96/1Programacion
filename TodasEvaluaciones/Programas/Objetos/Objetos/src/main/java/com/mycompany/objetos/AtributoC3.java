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

/**
 *
 * @author DAW
 */
public class AtributoC3 {

    private int X1;
    private int Y1;
    private int X2;
    private int Y2;

    public AtributoC3() {
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

}
