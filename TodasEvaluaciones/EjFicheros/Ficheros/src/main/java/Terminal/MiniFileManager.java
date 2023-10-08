package Terminal;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class MiniFileManager {
    //creamos el objeto File que sera equivalente a la posicion en la que estaremos trabajando
    private File directorioActual = new File ("terminal");

    //metodo para mostrar la ruta en la que estamos
    public String pwd() {
        return directorioActual.getAbsolutePath();
    }
    
    //metodo para cambiar la ubicacion de nuestra posicion
    public void cd(String dir) throws IllegalArgumentException {
        //en caso de poner .. como direccion, subiremos un nivel
        if (dir.equals("..")) {
            //para ello creamos un nuevo File, cuya direccion sera la direccion absoluta del File de trabajo
            File directorioAnterior = new File(directorioActual.getAbsolutePath());
            //comprobamos que exista un directorio superior. En ese caso copiamos esa direccion al fichero de trabajo
            if (directorioAnterior.getParent() == null) {
                throw new IllegalArgumentException("No existe directorio superior.");
            }
            directorioActual = directorioAnterior.getParentFile();
        //si ponemos direccion, primero comprobamos si es relativa o absoluta. Para esto miramos si el segundo caracter son dos puntos ":", ya que en ese caso la direccion sera absoluta
        //si es relativa la convertimos copiando la direccion absoluta de nuestro fichero
        } else {
            if (dir.charAt(1) != ':') {
                dir = directorioActual.getAbsolutePath()+"\\"+dir;
            }
            //creamos un nuevo objeto File en base a la direecion nueva
            File nuevoDirectorio = new File(dir);
            //comprobamos que exista
            if (!nuevoDirectorio.exists() || !nuevoDirectorio.isDirectory()) {
                throw new IllegalArgumentException("No existe el directorio " + dir);
            } else {
                directorioActual = nuevoDirectorio;
            }
        }
    }
    
    //metodo para mostrar una lista con los ficheros dentro del directorio actual
    public void list(boolean infoExtra) {
        //creamos un array de Files con cada fichero que contenga
        File lista[] = directorioActual.listFiles();
        Arrays.sort(lista);
        for (File archivo : lista) {
            if (archivo.isDirectory()) {
                System.out.printf("%s/\n", archivo.getName());
            }
            if (archivo.isFile()) {
                String info = archivo.getName();
                //en caso de usar el comando ll (tamaño y fecha de última modificación)
                if (infoExtra) {
                    info += "\t" + archivo.length() + " bytes";
                    info += "\t" + new java.util.Date(archivo.lastModified()).toString();
                }
                System.out.printf("%s/\n", info);
            }
        }
    }

    //metodo para crear ficheros
    public void mkdir(String dir) throws IllegalArgumentException, IOException {
        //convertimos la direccion a absoluta en caso de que no lo sea
        if (dir.charAt(1) != ':') {
            dir = directorioActual.getAbsolutePath()+"\\"+dir;
        }
        File f = new File(dir);
        if(f.exists()){
            System.out.println("El fichero ya existe.");
        //distingue entre archivo y carpeta en funcion de si contiene un punto o no
        } else {
            if (dir.indexOf('.') != -1) {
                f.getParentFile().mkdir();
                f.createNewFile();
            } else {
                f.mkdir();
            }
        }
    }
    
    //metodo para elimiar ficheros
    public void rm(String dir) throws IllegalArgumentException {
        if (dir.charAt(1) != ':') {
            dir = directorioActual.getAbsolutePath()+"\\"+dir;
        }
        File f = new File(dir);
        //comprobamos si el fichero es archivo o carpeta
        if (f.isFile()) {
            if (f.delete()) {
                System.out.println("Archivo eliminado con éxito.");
            } else {
                System.out.println("No se ha podido eliminar el archivo.");
            }
        }
        //en caso de ser una carpeta, recorremos los archivos internos y los eliminamos (a no ser que haya alguna otra carpeta)
        if (f.isDirectory()) {
            File lista[] = directorioActual.listFiles();
            int cont = 0;
            if (lista != null) {
                for (File archivo : lista) {
                    if (archivo.isDirectory()) {
                        cont++;
                    } else {
                        archivo.delete();
                    }
                }
            }
            if (cont==0) {
                directorioActual.delete();
            } else {
                System.out.println("Hay ["+cont+"] subcarpetas dentro de la carpeta");
            }
        }
    }
    
    //metodo para mover ficheros
    public void mv(String dir1, String dir2) throws IllegalArgumentException, IOException {
        //convertimos ambas direcciones a absolutas en caso de que no lo sean ya
        if (dir1.charAt(1) != ':') {
            dir1 = directorioActual.getAbsolutePath()+"\\"+dir1;
        }
        if (dir2.charAt(1) != ':') {
            dir2 = directorioActual.getAbsolutePath()+"\\"+dir2;
        }
        File f1 = new File(dir1);
        File f2 = new File(dir2);
        if(f2.exists()){
            throw new java.io.IOException("Ya existe un fichero con ese nombre.");
        } else {
            boolean exito = f1.renameTo(f2);
            if (!exito) {
                System.out.println("No se pudo renombrar el archivo.");
            }
        }
    }
}