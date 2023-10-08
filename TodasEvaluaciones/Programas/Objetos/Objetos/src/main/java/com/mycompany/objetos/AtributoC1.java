/*
 Modifica los atributos de Punto para que sean private.
Fíjate que desde el main ya no te dejará utilizar ni modificar
los atributos x e y de los objetos.
Vamos a añadir los getteres: int getX() e int getY() que
devolverán los valores de x e y respectivamente. Es una
forma indirecta de leer sus valores.
Añadiremos también los setters: void setX(int x) y void
setY(int y) que copiarán el valor pasado como parámetro a
los atributos de la clase.
Tanto getters como setters deben ser public.
Corrige el main para utilizar los getters y setters. Prueba a
instanciar varios objetos, mostrar sus valores por pantalla,
modificarlos, etc.

 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoC1 {

    private int X;
    private int Y;

    public AtributoC1() {

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

}
