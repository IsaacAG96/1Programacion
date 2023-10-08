/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.empresaurio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Programa {

    public static void main(String[] args) {

        ArrayList Listado = new ArrayList();
        Scanner lector = new Scanner(System.in);
        Empresa empresa1 = new Empresa("EROSKI", "5221A");
        Listado.add(empresa1);
        Listado.add(new Empleado("Paco", " 2555av", 250, 10, 666, "calle falsa"));
        Listado.add(new Empleado("Paco", " 2555av", 250));
        Empleado empleado1=new Empleado("Paco", " 2555av", 250);

        System.out.println("Introduce la cantidad de empleados a añadir");
        int cantidad = lector.nextInt();
        empresa1.añadirEmpleados(cantidad);

        System.out.println("Introduce la cantidad de empleados a eliminar");
        cantidad = lector.nextInt();
        empresa1.añadirEmpleados(cantidad);
        
         System.out.println("Informacion de todos los empleados");
        
        empresa1.infoTodosEmpleados(); //Deberia ser padre??
        
        
         

    }
}
