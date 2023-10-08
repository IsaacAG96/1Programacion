/*
15. Dibuja un ordinograma que lea tres números distintos y nos diga cuál es el mayor. */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero1, numero2, numero3;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce primer numero");
        numero1 = lector.nextDouble();
        System.out.println("Introduce segundo numero");
        numero2 = lector.nextDouble();
        System.out.println("Introduce tercer numero");
        numero3 = lector.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor numero es " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El mayor numero es " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El mayor numero es " + numero3);
        } else if (numero1 == numero2 && numero1 == numero3) {
            System.out.println("Son iguales");
        }
    }

}
