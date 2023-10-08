/*
Implementa un programa con una función boolean borraTodo(File f) que borre f: Si no existe lanzará una excepción. Si es un archivo lo borrará. 
Si es un directorio, borrará primero sus archivos y luego el propio directorio (recuerda que para poder borrar un directorio debe estar vacío). 
Devolverá ‘true’ si pudo borrar el ‘File f’ (‘false’ si no fué posible).

Prueba la función borrando las carpetas: ‘Documentos/Fotografias’, ‘Documentos/Libros’ y ‘Documentos’ (es decir, tres llamadas a la función, en ese orden).


Super extra challenge: Esta función, tal y como está definida, no borrará las subcarpetas que estén dentro de una carpeta (para ello habría que borrar primero el contenido de dichas subcarpetas).
¿Se te ocurre cómo podría hacerse? Inténtalo si te animas ;-)

 */
package EjA;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author isaac
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File fotos = new File("/3º Ev/Programacion/EjFicheros/Documentos/Mis Cosas/Fotografias");
        File libros = new File("/3º Ev/Programacion/EjFicheros/Documentos/Mis Cosas/Libros");
        File documentos = new File("/3º Ev/Programacion/EjFicheros/Documentos");

        System.out.println("¿Se ha conseguido borrar? " + borraTodo(fotos));
        System.out.println("-----------------------------------------------");
        System.out.println("¿Se ha conseguido borrar? " + borraTodo(libros));
        System.out.println("-----------------------------------------------");
        System.out.println("¿Se ha conseguido borrar? " + borraTodo(documentos));

    }

    public static boolean borraTodo(File x) {//borra todo menos las carpetas que estan dentro de otras carpetas

        if (x.isFile() == true) {

            x.delete();
            return true;

        } else if (x.isDirectory() == true) {

            File[] archivos_en_directorio = x.listFiles();
            Arrays.sort(archivos_en_directorio);

            for (int contador = 0; contador < archivos_en_directorio.length; contador++) {

                if (archivos_en_directorio[contador].isDirectory() == true) {
                    String ruta = x + "/" + archivos_en_directorio[contador].getName();
                    System.out.println(ruta);
                    File paraBorrar = new File(ruta);
                    paraBorrar.delete();

                }

            }
            for (int contador = 0; contador < archivos_en_directorio.length; contador++) {

                if (archivos_en_directorio[contador].isFile() == true) {

                    String ruta = x + "/" + archivos_en_directorio[contador].getName();
                    System.out.println(ruta);
                    File paraBorrar = new File(ruta);
                    paraBorrar.delete();

                }

            }

            return true;

        } else {
            return false;
        }

    }

}
falta añadir excepcion en el false