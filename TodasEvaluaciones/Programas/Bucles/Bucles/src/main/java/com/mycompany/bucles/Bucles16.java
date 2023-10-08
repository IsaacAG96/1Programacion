/*16. Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = lector.nextInt();
        boolean resultado = false;
        int divisores = 0;

        for (int contador0 = 1; contador0 <= numero; contador0++) {

            if (numero % contador0 == 0) {
                divisores++;
            }

        }

        if (divisores == 2) {
            resultado = true;
        } else {
            resultado = false;
        }
        
        
        if(resultado==true){
            System.out.println("El numero " + numero + " es primo");
        }
        else if(resultado==false){
            System.out.println("El numero " + numero + " no es primo");
        }
        

    }
}
