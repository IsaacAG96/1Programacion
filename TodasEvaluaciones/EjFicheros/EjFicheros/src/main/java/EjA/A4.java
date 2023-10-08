/*
Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas: ‘Mis Cosas’ y ‘Alfabeto’. Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’. 
Luego crea dentro de ‘Alfabeto’ una carpeta por cada letra del alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’.
Te serán de ayuda los códigos numéricos ASCII: https://elcodigoascii.com.ar
 */
package EjA;

import java.io.File;

/**
 *
 * @author isaac
 */
public class A4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File mis_cosas = new File("Documentos/Mis Cosas");//"creamos" la carpeta que vamos a crear
        File alfabeto = new File("/Documentos/Alfabeto");//"creamos" la carpeta que vamos a crear

        mis_cosas.mkdir();//creamos la carpeta
        alfabeto.mkdir();//creamos la carpeta

        File fotografiasIni = new File("/Documentos/Fotografias");//POSICION INICIO DE FOTOGRAFIAS
        File librosIni = new File("/Documentos/Libros");//POSICION INICIO DE LIBROS

        File fotografiasFin = new File("/Documentos/Mis Cosas/Fotografias");//POSICION FINAL DE FOTOGRAFIAS
        File librosFin = new File("/Documentos/Mis Cosas/Libros");//POSICION FINAL DE LIBROS

        fotografiasIni.renameTo(fotografiasFin);//CAMBIA LA UBICACION DE FOTOGRAFIAS
        librosIni.renameTo(librosFin);//CAMBIA LA UBICACION DE LIBROS

        /**
         * for (int contador = 65; contador < 91; contador++) {//65 SERIA A EN
         * ASCII Y 90 LA Z //
         * System.out.println(String.fromCharCode(contador));//MUESTRA CODIGO
         * ASCII COMO LETRAS String aux = "/3º
         * Ev/Programacion/EjFicheros/Documentos/Alfabeto/" +
         * String.valueOf(contador);//CREA RUTA DE LA CARPETA
         * System.out.println(codePointAt(contador));
         *
         * // File letras = new File(aux);//CREA CARPETA CON LAS DISTINTAS
         * LETRAS }
         */
        for (int contador = 0; contador < 26; contador++) {
            char aux = (char) ('A' + contador);

            File letra = new File("/Documentos/Alfabeto/" + aux);
            letra.mkdir();

        }
    }

}

