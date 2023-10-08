package Ficheros;
/*
    Implementa un programa con una función boolean borraTodo(File f) que borre f:
    Si no existe lanzará una excepción. Si es un archivo lo borrará. Si es un
    directorio, borrará primero sus archivos y luego el propio directorio
    (recuerda que para poder borrar un directorio debe estar vacío). Devolverá
    ‘true’ si pudo borrar el ‘File f’ (‘false’ si no fué posible). Prueba la
    función borrando las carpetas: ‘Documentos/Fotografias’, ‘Documentos/Libros’
    y ‘Documentos’ (es decir, tres llamadas a la función, en ese orden).
    Super extra challenge: Esta función, tal y como está definida, no borrará
    las subcarpetas que estén dentro de una carpeta (para ello habría que borrar
    primero el contenido de dichas subcarpetas).
*/
import java.io.File;
import java.util.Scanner;

public class FicherosA5 {
    public static void main(String[] args) throws Exception {
        Scanner esc = new Scanner(System.in);
        File f = new File(esc.nextLine());
        borraTodo(f);
    }
    
    public static boolean borraTodo(File f) throws Exception {
        if (f.exists()) {
            if (f.isFile()) {
                if (f.delete()) {
                    return true;
                } else {
                    System.out.println("No se ha podido eliminar el archivo.");
                }
            } else {
                File lista[] = f.listFiles();
                int cont = 0;
                if (lista != null) {
                    for (File archivo : lista) {
                        if (archivo.isDirectory()) {
                            borraTodo(archivo);
                        } else {
                            archivo.delete();
                        }
                    }
                }
                if (cont==0) {
                    f.delete();
                    return true;
                } else {
                    System.out.println("Hay ["+cont+"] subcarpetas dentro de la carpeta");
                }
            }
        } else {
            throw new Exception("El archivo no existe.");
        }
        return false;
    }
}