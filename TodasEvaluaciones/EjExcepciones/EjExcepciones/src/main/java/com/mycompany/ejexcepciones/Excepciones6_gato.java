/*
Implementa una clase Gato con los atributos nombre y edad, un constructor con parámetros, los getters y setters, 
además de un método imprimir() para mostrar los datos de un gato.

El nombre de un gato debe tener al menos 3 caracteres y la edad no puede ser negativa.

Por ello, tanto en el constructor como en los setters, deberás comprobar que los valores sean válidos 
y lanzar una ‘Exception’ si no lo son. Luego, haz una clase principal con main para hacer pruebas: 
instancia varios objetos Gato y utiliza sus setters, probando distintos valores (algunos válidos y otros incorrectos).

Maneja las excepciones.

 */
package com.mycompany.ejexcepciones;

/**
 *
 * @author isaac
 */
public class Excepciones6_gato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** Primer gato introducido ***");
        Gato manolo = new Gato("Manolo", 5);

        System.out.println("*** Segundo gato introducido  ***");
        Gato pepe = new Gato("pe", 5);

        System.out.println("*** Tercer gato introducido   ***");
        Gato juana = new Gato("pepe", -2);

    }

}
