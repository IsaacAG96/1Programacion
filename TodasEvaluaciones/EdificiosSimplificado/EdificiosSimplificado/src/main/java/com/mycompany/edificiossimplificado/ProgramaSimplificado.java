/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.edificiossimplificado;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ProgramaSimplificado {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuantas plantas tiene el edificio?");
        int plantas = lector.nextInt();

        EdificioSimplificado edificio = new EdificioSimplificado(plantas);

        System.out.println("¿Cuantas plantas tiene el edificio?");

    }
}
