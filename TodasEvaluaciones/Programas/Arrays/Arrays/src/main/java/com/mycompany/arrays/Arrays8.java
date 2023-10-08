/*
8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R. */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Arrays8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double real;
        int contador2=0;
        int contador3=0;
        
        
        Scanner lector= new Scanner(System.in);

        double numeros[] = new double[100];

        for (int contador1 = 0; contador1 < 100; contador1++) {

            numeros[contador1] = Math.random()*1;

        }
        
        System.out.println("Introduce un numero real entre 0,0 y 1,0");
        real=lector.nextDouble();
        
        
        while(contador2<100){
            
            if(numeros[contador2]<real){
                contador2++;
            }
            else if(numeros[contador2]>=real){
                contador2++;
                contador3++;
            }
        }
        System.out.println("Hay "+contador3+" iguales o superiores a "+real);
           
        
        

    }

}
