/*
Implementa una clase Gato con los atributos nombre y edad, un constructor con parámetros, los getters y setters, 
además de un método imprimir() para mostrar los datos de un gato.

El nombre de un gato debe tener al menos 3 caracteres y la edad no puede ser negativa.

Por ello, tanto en el constructor como en los setters, deberás comprobar que los valores sean válidos 
y lanzar una ‘Exception’ si no lo son. Luego, haz una clase principal con main para hacer pruebas: 
instancia varios objetos Gato y utiliza sus setters, probando distintos valores (algunos válidos y otros incorrectos).
 */
package com.mycompany.ejexcepciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Gato {

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) {
        try {
            this.nombre = tamaño(nombre);

        } catch (ExcepcionPropia X) {
            System.out.println("ERROR: Longitud menor de 3 letras");

        }
        try {
            this.edad = negativo(edad);

        } catch (ExcepcionPropia X) {
            System.out.println("ERROR: Edad negativa");

        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.nombre = tamaño(nombre);

        } catch (ExcepcionPropia X) {
            System.out.println("Error : " + X);

        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        try {
            this.edad = negativo(edad);

        } catch (ExcepcionPropia X) {
            System.out.println("Error : " + X);

        }
    }

    public static void verificarEdad(int edad) throws ExcepcionPropia { //verifica que la edad sea mayor de 0 antes de enviar los datos
        if (edad < 0) {
           // System.out.println("Edad incorrecta");
            throw new ExcepcionPropia("Edad menor que cero.No es valida");

        }
        
    }

    public static void verificarNombre(String nombre) throws ExcepcionPropia {//verificar que el nombre tenga mas de 3 letras antes de enviar los datos
        if (nombre.length() < 3) {
          //  System.out.println("Nombre incorrecto");
            throw new ExcepcionPropia("Nombre con menos de 3 letras.No es valido");

        }

    }

    @Override
    public String toString() {
        return "gato{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    private int negativo(int edad) throws ExcepcionPropia {//verificar edad positiva en constructor y setter

        if (edad < 0) {

            throw new ExcepcionPropia(edad);

        } else {
            return edad;
        }
    }

    private String tamaño(String nombre) throws ExcepcionPropia {//verificar longitud mayor de 3 letras en constructor y setter

        if (nombre.length() < 3) {

            throw new ExcepcionPropia(nombre);

        } else {
            return nombre;
        }

    }

    public void crearGato() {//crear un gato
        Scanner lector = new Scanner(System.in);
        Gato gatito = new Gato(lector.next(), lector.nextInt());

    }

}
