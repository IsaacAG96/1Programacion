/*
 Partiendo de una copia del programa anterior, modifica la función muestraInfoRuta:

    ● En el caso de un directorio, mostrará la lista de directorios y archivos en orden alfabético. Es decir, primero los directorios en orden alfabético y luego los archivos en orden alfabético. 
    Te será útil Arrays.sort().

    ● Añade un segundo argumento ‘boolean info’ que cuando sea ‘true’ mostrará, junto a la información de cada directorio o archivo, su tamaño en bytes y la fecha de la última modificación. 
    Cuando ‘info’ sea ‘false’ mostrará la información como en el ejercicio anterior.

 */
package EjA;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String ruta = " ";

        while (ruta != "") {

            System.out.println("Introduce una ruta");

            ruta = lector.nextLine();

            if (ruta != "") {

                System.out.println("¿Quieres que se muestre informacion adicional?");
                System.out.println("1.Si o 2.No");
                int aux = lector.nextInt();
                lector.nextLine();

                if (aux == 1) {
                    Boolean info = true;
                    File Ruta_File = new File(ruta);
                    muestraInfoRuta(Ruta_File, info);

                } else if (aux == 2) {
                    Boolean info = false;
                    File Ruta_File = new File(ruta);
                    muestraInfoRuta(Ruta_File, info);

                }

            } else {
                System.out.println("El bucle va a ser parado");
                break;

            }
            System.out.println("-----------------------------------------");

        }

    }

    public static void muestraInfoRuta(File Ruta_File, boolean info) {

        if (existeRuta(Ruta_File) == true) {

            if (info == false) {//MUESTRA INFO ORIGINAL

                if (Ruta_File.isFile() == true) {
                    System.out.println("Es un archivo");
                    cosasArchivo(Ruta_File);

                } else if (Ruta_File.isDirectory() == true) {
                    System.out.println("Es un directorio");
                    cosasDirectorio(Ruta_File);
                }
            } else if (info == true) {//MUESTRA INFO ADICIONAL
                if (Ruta_File.isFile() == true) {
                    System.out.println("Es un archivo");
                    cosasArchivoExtra(Ruta_File);

                } else if (Ruta_File.isDirectory() == true) {
                    System.out.println("Es un directorio");
                    cosasDirectorioExtra(Ruta_File);

                }

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
        Arrays.sort(archivos_en_directorio);

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

    public static void cosasDirectorioExtra(File Ruta_File) {

        File[] archivos_en_directorio = Ruta_File.listFiles();
        Arrays.sort(archivos_en_directorio);

        for (int contador1 = 0; contador1 < archivos_en_directorio.length; contador1++) {

            if (archivos_en_directorio[contador1].isDirectory() == true) {
                System.out.println("[*]" + archivos_en_directorio[contador1].getName());
                System.out.println("Tamaño = " + tamañoByte(archivos_en_directorio[contador1]) + " Bytes");
                System.out.println("La fecha de la ultima modificacion es: " + ultimaModificacion(archivos_en_directorio[contador1]));

            }

        }
        for (int contador2 = 0; contador2 < archivos_en_directorio.length; contador2++) {

            if (archivos_en_directorio[contador2].isFile() == true) {
                System.out.println("[A]" + archivos_en_directorio[contador2].getName());
                System.out.println("Tamaño = " + tamañoByte(archivos_en_directorio[contador2]) + " Bytes");
                System.out.println("La fecha de la ultima modificacion es: " + ultimaModificacion(archivos_en_directorio[contador2]));

            }

        }

    }

    public static void cosasArchivo(File Ruta_File) {
        System.out.println("A " + Ruta_File.getName());

    }

    public static void cosasArchivoExtra(File Ruta_File) {
        System.out.println("A " + Ruta_File.getName());
        System.out.println("Tamaño = " + tamañoByte(Ruta_File) + " Bytes");
        System.out.println("La fecha de la ultima modificacion es: " + ultimaModificacion(Ruta_File));

    }

    public static long tamañoByte(File Ruta_File) {

        long tamaño = Ruta_File.length();
        return tamaño;
    }

    public static Date ultimaModificacion(File Ruta_File) {//muestra la fecha de la ultima modificacion

        long milisegundos = Ruta_File.lastModified();
        Date tiempo = new Date(milisegundos);
        return tiempo;
    }

}



falta excepcion,ponerla cuando ruta de falso en existe ruta