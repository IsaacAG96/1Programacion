/*
 Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de
Scanner) y luego muestre por pantalla el mensaje “Valor introducido: …”. 

Se deberá tratar la excepción InputMismatchException que lanza nextInt() cuando no se introduce un entero
válido.

En tal caso se mostrará el mensaje “Valor introducido incorrecto”.

 */
package com.mycompany.ejexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Excepciones1 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int A;

        System.out.println("Introduce un numero entero");

        try {//INTENTA LEER LO INTRODUCIDO
            A = lector.nextInt();
            System.out.println("Valor introducido : " + A);

        } catch (InputMismatchException X) {//SI NO ES UN NUMERO ENTERO,DARA FALLO Y MOSTRARA CUAL ES
            System.out.println("Valor introducido incorrecto. Error: " + X);
            X.printStackTrace();//IMPRIME LISTADO DE LOS FALLOS

        } finally {//MUESTRA ESTE MENSAJE SIEMPRE DESPUES DEL TRY Y CATCH
            System.out.println("Programa acabado");
        }

    }
}
