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

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ObjetosD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int aux1;
        int aux2;

        System.out.println("Introduce valores para X y luego para Y");

        AtributoD1 posicion = new AtributoD1();//crea objeto posicion

        posicion.setX(lector.nextInt());
        posicion.setY(lector.nextInt());
        posicion.imprime();//muestra los datos

        System.out.println("Introduce una nueva coordenada");
        aux1 = lector.nextInt();
        aux2 = lector.nextInt();
        posicion.setXY(aux1, aux2);//se sustituye la posicion
        posicion.imprime();//muestra los datos

        System.out.println("Introduce una coordenada para sumar a la anterior");
        aux1 = lector.nextInt();
        aux2 = lector.nextInt();

        posicion.desplaza(aux1, aux2);//se incrementa la posicion

    }

}
