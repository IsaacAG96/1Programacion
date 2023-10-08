/*


 */
package com.mycompany.ejexcepciones;

/**
 *
 * @author isaac
 */
public class ExcepcionPropia extends Exception {

    private int numero;
    private String palabra;

    public ExcepcionPropia(int numero) {
        this.numero = numero;

    }

    public ExcepcionPropia(String palabra) {
        // this.palabra = palabra;
        super(palabra);
    }

}
