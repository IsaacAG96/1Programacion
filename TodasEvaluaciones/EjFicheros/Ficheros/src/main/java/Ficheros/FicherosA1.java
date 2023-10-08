package Ficheros;

/*
    Implementa un programa que pida al usuario introducir por teclado una ruta
    del sistema de archivos (por ejemplo, “C:/Windows” o “Documentos”) y muestre
    información sobre dicha ruta (ver función más abajo). El proceso se repetirá
    una y otra vez hasta que el usuario introduzca una ruta vacía (tecla intro).
    Deberá manejar las posibles excepciones. Necesitarás crear la función void
    muestraInfoRuta(File ruta) que dada una ruta de tipo File haga lo siguiente:
        ● Si es un archivo, mostrará por pantalla el nombre del archivo.
        ● Si es un directorio, mostrará por pantalla la lista de directorios y
        archivos que contiene (sus nombres). Deberá mostrar primero los directorios y luego los archivos.
        ● En cualquier caso, añade delante del nombre la etiqueta [*] o [A]
        para indicar si es un directorio o un archivo respectivamente.
        ● Si el path no existe lanzará un FileNotFoundException.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FicherosA1 {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        System.out.println("Introduce una ruta: (pulsa \"enter\" sin escribir nada para salir)");
        String ruta = esc.nextLine();
        while (!ruta.equals("")) {
            File f = new File(ruta);
            try {
                muestraInfoRuta(f);
            } catch (FileNotFoundException e) {
                System.out.println("El archivo no existe");
            }
            System.out.println("Introduce una ruta: (pulsa \"enter\" sin escribir nada para salir)");
            ruta = esc.nextLine();
        }
    }

    public static void muestraInfoRuta(File f) throws FileNotFoundException {
        if (f.exists()) {
            if (f.isFile()) {
                System.out.println(f.getName());
            } else {
                File lista[] = f.listFiles();
                for (File f2 : lista) {
                    if (f2.isDirectory()) {
                        System.out.println("[*]" + f2.getName());
                    }
                }
                for (File f2 : lista) {
                    if (f2.isFile()) {
                        System.out.println("[A]" + f2.getName());
                    }
                }
            }
        } else {
            throw new FileNotFoundException("El archivo no existe");
        }
    }
}
