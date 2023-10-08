package Ficheros;
/*
    Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas:
    ‘Mis Cosas’ y ‘Alfabeto’. Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro
    de ‘Mis Cosas’. Luego crea dentro de ‘Alfabeto’ una carpeta por cada letra
    del alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’.
*/
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class FicherosA4 {
    public static void main(String[] args) throws IOException {
        File fAlfabeto = new File("Documentos\\Alfabeto");
        fAlfabeto.mkdir();
        File fMisCosas = new File("Documentos\\Mis Cosas");
        fMisCosas.mkdir();
        
        try {
            File temp1 = new File("Documentos\\Fotografias");
            Path path = Files.move(Paths.get(temp1.getAbsolutePath()), Paths.get(fMisCosas.getAbsolutePath()+"\\Fotografias"));
            temp1 = new File("Documentos\\Libros");
            path = Files.move(Paths.get(temp1.getAbsolutePath()), Paths.get(fMisCosas.getAbsolutePath()+"\\Libros"));
        } catch (IOException e) {
            System.out.println("No se pudo cambiar la ubicacion");
        }
        
        for (char i=65 ; i<91; i++) {
            File temp2 = new File(fAlfabeto.getAbsolutePath()+"\\"+i);
            temp2.mkdir();
        }
    }
}