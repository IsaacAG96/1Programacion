/*18. Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números
naturales.
 */
package com.mycompany.bucles;

/**
 *
 * @author DAW
 */
public class Bucles18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int sumaCuadrados = 0;
        int contador = 1;

        while (contador <= 5) {
            sumaCuadrados = sumaCuadrados + (contador * contador);
            contador++;

        }
        System.out.println("La suma de los 5 primeros cuadrados es " + sumaCuadrados);

    }

}
