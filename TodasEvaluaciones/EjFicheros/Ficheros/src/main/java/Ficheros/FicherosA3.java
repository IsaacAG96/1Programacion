package Ficheros;
/*
    Implementa un programa que haga lo siguiente:
    ● Cambiar el nombre de la carpeta ‘Documentos’ a ‘DOCS’, el de la carpeta
    ‘Fotografias’ a ‘FOTOS’ y el de la carpeta ‘Libros’ a ‘LECTURAS’
    ● Cambiar el nombre de todos los archivos de las carpetas FOTOS y LECTURAS
    quitándole la extensión. Por ejemplo, ‘astronauta.jpg’ pasará a llamarse ‘astronauta’.
*/
import java.io.File;

public class FicherosA3 {
    public static void main(String[] args) {
        File f = new File("Documentos");
        File fNuevo = new File("DOCS");
        f.renameTo(fNuevo);
        
        File f2 = new File(fNuevo.getPath()+"\\Fotografias");
        File f3 = new File(fNuevo.getPath()+"\\FOTOS");
        f2.renameTo(f3);
        
        File f4 = new File(fNuevo.getPath()+"\\Libros");
        File f5 = new File(fNuevo.getPath()+"\\LECTURAS");
        f4.renameTo(f5);
    }
}