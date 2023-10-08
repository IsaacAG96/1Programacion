/*
19. Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
Por ejemplo: 3 ² + 4 ² = 5 ². */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int y;
        int z;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un valor para X");
        x = lector.nextInt();

        System.out.println("Introduce un valor para Y");
        y = lector.nextInt();

        System.out.println("Introduce un vaor para Z");;
        z = lector.nextInt();

        System.out.println((int) Math.pow(x, 2) + " + " + (int) Math.pow(y, 2) + " = " + (int) Math.pow(z, 2) + " : " + pitagoras(x, y, z));

    }

    public static Boolean pitagoras(int x, int y, int z) {

        boolean resultado;

        int primero;
        int segundo;
        primero = (x * x) + (y * y); // asi no funciona??  primero = (int) (Math.pow(y, 2) + (int) Math.pow(y, 2));
        segundo = (int) Math.pow(z, 2);

        if (primero == segundo) {
            resultado = true;

        } else {
            resultado = false;
        }
        return resultado;

    }

}
