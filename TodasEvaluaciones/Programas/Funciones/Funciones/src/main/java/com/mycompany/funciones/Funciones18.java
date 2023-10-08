/*
18. El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI
entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se
deberá crear una función a la que se le pase el número y devuelva la letra.
Ejemplo: para el DNI 56321122 el NIF es ‘X’. */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Funciones18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu DNI");
        numero = lector.nextInt();
        letra(numero);

    }

    public static void letra(int numero) {
        String resultado;
        int codigo;

        codigo = numero % 23;

        switch (codigo) {
            case 0:
                resultado = "T";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 1:
                resultado = "R";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 2:
                resultado = "W";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 3:
                resultado = "A";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 4:
                resultado = "G";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 5:
                resultado = "M";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 6:
                resultado = "Y";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 7:
                resultado = "F";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 8:
                resultado = "P";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 9:
                resultado = "D";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 10:
                resultado = "X";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 11:
                resultado = "B";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 12:
                resultado = "N";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 13:
                resultado = "J";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 14:
                resultado = "Z";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 15:
                resultado = "S";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 16:
                resultado = "Q";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 17:
                resultado = "V";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 18:
                resultado = "H";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 19:
                resultado = "L";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 20:
                resultado = "C";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 21:
                resultado = "K";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;
            case 22:
                resultado = "E";
                System.out.println("La letra asociada al DNI " + numero + " es " + resultado);
                break;

        }

    }

}
