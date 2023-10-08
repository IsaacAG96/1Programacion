/*
Implementa un programa que haga lo siguiente:

    ● Cambiar el nombre de la carpeta ‘Documentos’ a ‘DOCS’, el de la carpeta ‘Fotografias’ a ‘FOTOS’ y el de la carpeta ‘Libros’ a ‘LECTURAS’

    ● Cambiar el nombre de todos los archivos de las carpetas FOTOS y LECTURAS quitándole la extensión. Por ejemplo, ‘astronauta.jpg’ pasará a llamarse ‘astronauta’
 */
package EjA;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String rutaInicio1 = "/3º Ev/Programacion/EjFicheros/Documentos";//POSICION INICIAL ARCHIVO DOCUMENTOS
        File documentosIni = new File(rutaInicio1);
        String rutaFin1 = "/3º Ev/Programacion/EjFicheros/DOCS";//POSICION FINAL ARCHIVO RENOMBRADO COMO DOCS
        File documentosFin = new File(rutaFin1);

        String rutaInicio2 = "/3º Ev/Programacion/EjFicheros/DOCS/Fotografias";//POSICION INICIAL ARCHIVO FOTOGRAFIAS
        File fotografiasIni = new File(rutaInicio2);
        String rutaFin2 = "/3º Ev/Programacion/EjFicheros/DOCS/FOTOS";//POSICION FINAL ARCHIVO RENOMBRADO COMO FOTOS
        File fotografiasFin = new File(rutaFin2);

        String rutainicio3 = "/3º Ev/Programacion/EjFicheros/DOCS/Libros";//POSICION INICIAL ARCHIVO Libros
        File librosIni = new File(rutainicio3);
        String rutaFin3 = "/3º Ev/Programacion/EjFicheros/DOCS/LECTURAS";//POSICION FINAL ARCHIVO RENOMBRADO COMO LECTURAS
        File librosFin = new File(rutaFin3);

        documentosIni.renameTo(documentosFin);//CAMBIO NOMBRE DE DOCUMENTOS A DOCS
        System.out.println("Se ha renombrado Documentos a DOCS");
        fotografiasIni.renameTo(fotografiasFin);//CAMBIO NOMBRE DE FOTOGRAFIAS A FOTOS
        System.out.println("Se ha renombrado Fotografias a FOTOS");
        librosIni.renameTo(librosFin);//CAMBIO NOMBRE DE Libros A LECTURAS
        System.out.println("Se ha renombrado Libros a Lecturas");

        File[] archivos_en_fotografia = fotografiasFin.listFiles();

        for (int contador = 0; contador < archivos_en_fotografia.length; contador++) {
            String aux = archivos_en_fotografia[contador].getName();
            String rutaIni = "/3º Ev/Programacion/EjFicheros/DOCS/FOTOS/" + aux;
            File fotitosIni = new File(rutaIni);//SE CREA UN FILE NUEVO CON LA RUTA NUEVA

            String aux2 = aux.substring(0, aux.length() - 4);//se elimina la extension
            String rutaFin = "/3º Ev/Programacion/EjFicheros/DOCS/FOTOS/" + aux2;//CREA RUTA SIN EXTENSION
            File fotitosFin = new File(rutaFin);//SE CREA UN FILE NUEVO CON LA RUTA NUEVA

            fotitosIni.renameTo(fotitosFin);

        }
        System.out.println("Se han eliminado las extensiones de las fotos");

        File[] archivos_en_libros = librosFin.listFiles();

        for (int contador = 0; contador < archivos_en_libros.length; contador++) {

            String aux = archivos_en_libros[contador].getName();
            String rutaIni = "/3º Ev/Programacion/EjFicheros/DOCS/LECTURAS/" + aux;
            File libritosIni = new File(rutaIni);//SE CREA UN FILE NUEVO CON LA RUTA NUEVA

            String aux2 = aux.substring(0, aux.length() - 4);//se elimina la extension
            String rutaFin = "/3º Ev/Programacion/EjFicheros/DOCS/LECTURAS/" + aux2;//CREA RUTA SIN EXTENSION
            File libritosFin = new File(rutaFin);//SE CREA UN FILE NUEVO CON LA RUTA NUEVA

            libritosIni.renameTo(libritosFin);

        }
        System.out.println("Se han eliminado las extensiones de los libros");

    }
}
