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
public class ObjetosE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Introduce valores para X y luego para Y");

        AtributoE1 posicion = new AtributoE1();//crea objeto posicion

        posicion.setX(AtributoE1.creaPuntoAleatorio());
        posicion.setY(AtributoE1.creaPuntoAleatorio());
        posicion.imprime();//muestra los datos

    }

}
