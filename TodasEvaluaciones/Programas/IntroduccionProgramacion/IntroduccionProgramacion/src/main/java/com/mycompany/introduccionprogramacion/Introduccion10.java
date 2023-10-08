/*
10. Dibuja un ordinograma que lee dos números, calcula y muestra el valor de su suma, resta,
producto y división. (Ten en cuenta la división por cero ).
 */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero1, numero2, suma, resta, producto;
        double division = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce primer numero");
        numero1 = lector.nextDouble();
        System.out.println("Introduce Segundo numero");
        numero2 = lector.nextDouble();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        producto = numero1 * numero2;

        if (numero2 != 0) {
            division = numero1 / numero2;
            System.out.println("División=" + division);
        } else if (numero2 == 0) {
            System.out.println("Division=No se puede realizar la division entre 0");
        }

        System.out.println("Suma=" + suma);
        System.out.println("Resta=" + resta);
        System.out.println("Producto=" + producto);
    }

}
