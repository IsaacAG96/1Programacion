/*
16. Dibuja un ordinograma que lea una calificación numérica entre 0 y 10 y la transforma en
calificación alfabética, escribiendo el resultado.
• de 0 a <3 Muy Deficiente.
• de 3 a <5 Insuficiente.
• de 5 a <6 Bien.
• de 6 a <9 Notable
• de 9 a 10 Sobresaliente */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una nota");
        nota = lector.nextDouble();

        if (nota >= 0 && nota < 3) {
            System.out.println("Muy deficiente");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Bien");
        } else if (nota >= 6 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }
    }

}
