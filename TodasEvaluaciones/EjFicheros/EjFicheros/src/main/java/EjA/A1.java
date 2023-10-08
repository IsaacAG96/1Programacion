/*
Ejercicio A1 - Mostrar información de ficheros

Implementa un programa que pida al usuario introducir por teclado una ruta del sistema de archivos (por ejemplo, “C:/Windows” o “Documentos”) y muestre información sobre dicha ruta (ver
función más abajo). El proceso se repetirá una y otra vez hasta que el usuario introduzca una ruta vacía (tecla intro). Deberá manejar las posibles excepciones.

Necesitarás crear la función void muestraInfoRuta(File ruta) que dada una ruta de tipo File haga lo siguiente:

    ● Si es un archivo, mostrará por pantalla el nombre del archivo.

    ● Si es un directorio, mostrará por pantalla la lista de directorios y archivos que contiene (sus nombres). Deberá mostrar primero los directorios y luego los archivos.

    ● En cualquier caso, añade delante del nombre la etiqueta [*] o [A] para indicar si es un directorio o un archivo respectivamente.
    
    ● Si el path no existe lanzará un FileNotFoundException.
 */
package EjA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class A1 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String ruta = " ";

        while (ruta != "") {

            System.out.println("Introduce una ruta");
            ruta = lector.nextLine();

            if (ruta == "") {
                System.out.println("El bucle va a ser parado");
                break;
            } else {
                File Ruta_File = new File(ruta);
                muestraInfoRuta(Ruta_File);
            }
            System.out.println("-----------------------------------------");

        }

    }

    public static void muestraInfoRuta(File Ruta_File) {

        if (existeRuta(Ruta_File) == true) {

            if (Ruta_File.isFile() == true) {
                System.out.println("Es un archivo");
                cosasArchivo(Ruta_File);

            } else if (Ruta_File.isDirectory() == true) {
                System.out.println("Es un directorio");
                cosasDirectorio(Ruta_File);
            }

        }
    }

    public static boolean existeRuta(File Ruta_File) {

        if (Ruta_File.exists() == true) {
            System.out.println("Ruta correcta");
            return true;
        } else {
            System.out.println("Ruta Invalida");
            return false;
        }

    }

    public static void cosasDirectorio(File Ruta_File) {

        File[] archivos_en_directorio = Ruta_File.listFiles();

        for (int contador1 = 0; contador1 < archivos_en_directorio.length; contador1++) {

            if (archivos_en_directorio[contador1].isDirectory() == true) {
                System.out.println("[*]" + archivos_en_directorio[contador1].getName());

            }

        }
        for (int contador2 = 0; contador2 < archivos_en_directorio.length; contador2++) {

            if (archivos_en_directorio[contador2].isFile() == true) {
                System.out.println("[A]" + archivos_en_directorio[contador2].getName());

            }

        }

    }

    public static void cosasArchivo(File Ruta_File) {
        System.out.println("A " + Ruta_File.getName());

    }

}
falta excepcion,ponerla cuando ruta de falso en existe ruta