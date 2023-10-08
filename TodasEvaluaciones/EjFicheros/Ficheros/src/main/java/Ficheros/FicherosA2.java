package Ficheros;
/*
    Partiendo de una copia del programa anterior, modifica la función muestraInfoRuta:
    ● En el caso de un directorio, mostrará la lista de directorios y archivos en orden alfabético.
    Es decir, primero los directorios en orden alfabético y luego los archivos en orden alfabético.
    Te será útil Arrays.sort().
    ● Añade un segundo argumento ‘boolean info’ que cuando sea ‘true’ mostrará,
    junto a la información de cada directorio o archivo, su tamaño en bytes y la
    fecha de la última modificación. Cuando ‘info’ sea ‘false’ mostrará la información
    como en el ejercicio anterior.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FicherosA2 {
    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        System.out.println("Introduce una ruta: (pulsa \"enter\" sin escribir nada para salir)");
        String ruta = esc.nextLine();
        while (!ruta.equals("")) {
            File f = new File(ruta);
            System.out.println("Escriba \"s\" si desea informacion adicional");
            String opcion = esc.nextLine();
            try {
                if (opcion.equals("s")) {
                    muestraInfoRuta(f, true);
                } else {
                    muestraInfoRuta(f, false);
                }
                
            } catch (FileNotFoundException e) {
                System.out.println("El archivo no existe");
            }
            System.out.println("Introduce una ruta: (pulsa \"enter\" sin escribir nada para salir)");
            ruta = esc.nextLine();
        }
    }
    
    public static void muestraInfoRuta(File f, boolean infoExtra) throws FileNotFoundException {
        if (f.exists()) {
            if (f.isFile()) {
                System.out.println(f.getName());
            } else {
                File lista[] = f.listFiles();
                Arrays.sort(lista);
                ArrayList<File> listaArray = new ArrayList <>();
                for (File f2 : lista) {
                    if (f2.isDirectory()) {
                        listaArray.add(f2);
                    }
                }
                for (File f2 : lista) {
                    if (f2.isFile()) {
                        listaArray.add(f2);
                    }
                }
                for (File f2 : listaArray) {
                    String info = "";
                    if (f2.isDirectory()) {
                        info = "[*]"+f2.getName();
                    } else {
                        info = "[A]"+f2.getName();
                    }
                    if (infoExtra) {
                        info += "\t" + f2.length() + " bytes" + "\t" + new java.util.Date(f2.lastModified()).toString();
                    }
                    System.out.println(info);
                }
            }
        } else {
            throw new FileNotFoundException("El archivo no existe");
        }
    }
}
/*
                listaArray.stream().map(f2 -> {
                    String info = "";
                    if (f2.isDirectory()) {
                        info = "[*]"+f2.getName();
                    } else {
                        info = "[A]"+f2.getName();
                    }
                    if (infoExtra) {
                        info += "\t" + f2.length() + " bytes" + "\t" + new java.util.Date(f2.lastModified()).toString();
                    }
                    return info;
                }).forEachOrdered(info -> {
                    System.out.println(info);
                });
*/