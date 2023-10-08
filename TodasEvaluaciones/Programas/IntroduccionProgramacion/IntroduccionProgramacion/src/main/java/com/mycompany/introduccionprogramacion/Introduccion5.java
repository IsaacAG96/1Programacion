/*
5. Dibuja un ordinograma que toma como dato de entrada un número que corresponde a la
longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
volumen de la esfera que corresponden con dicho radio. */
package com.mycompany.introduccionprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Introduccion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, longitudRadio, longitudCircunferencia, areaCirculo, volumenEsfera;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el radio");
        radio = lector.nextDouble();

        longitudRadio = radio;
        longitudCircunferencia = 2 * Math.PI * radio;
        areaCirculo = Math.PI * Math.pow(radio, 2);
        volumenEsfera = (4 / 3) * Math.PI * Math.pow(radio, 3);

        System.out.println("Longitud del radio=" + longitudRadio);
        System.out.println("Longitud de Circunferencia=" + longitudCircunferencia);
        System.out.println("Area del Circulo=" + areaCirculo);
        System.out.println("Volumen de la Esfera=" + volumenEsfera);
    }

}
