package Terminal;
/*
    Implementa un programa que funcione como una pequeña terminal Linux, con algunos comandos (simplificados) que permitan al usuario realizar distintas operaciones
    de gestión de archivos. Los comandos que el usuario podrá ejecutar son:
        ● pwd: Muestra cual es la carpeta actual.
        ● cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.
        ● ls: Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego archivos, ambos ordenados alfabéticamente).
        ● ll: Como ls pero muestra también el tamaño y la fecha de última modificación.
        ● mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual.
        ● rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta.
            Si tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.
        ● mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’.
        ● help: Muestra una breve ayuda con los comandos disponibles.
        ● exit: Termina el programa.

    Clase MiniTerminal: Clase principal (con función main) que se encargará de interactuar con el usuario e interpretar los comandos
        (qué comando se pide, argumentos, etc.). Utilizará la segunda clase para realizar las operaciones de gestión de archivos. Manejará todas las posibles excepciones.

    Clase MiniFileManager: Tendrá los atributos y métodos que necesites, para realizar las distintas operaciones relacionadas con la gestión de archivos.
        Necesitarás al menos un método por cada operación. Se lanzará una excepción si se produce un error o la operación solicitada no es posible.
*/
import java.util.Scanner;

public class MiniTerminal {
    public static void main(String[] args) {
        Scanner esc = new Scanner (System.in);
        MiniFileManager manager = new MiniFileManager();
        String comando = "";
        
        while (!comando.equals("exit")) {
            System.out.print("> ");
            comando = esc.nextLine();
            
            try {
                String divisionComando[] = comando.split("\\s+");
                
                switch (divisionComando[0]) {
                    case "pwd":
                        System.out.println(manager.pwd());
                        break;
                    case "cd":
                        if (divisionComando.length > 1) {
                            manager.cd(divisionComando[1]);
                        } else {
                            manager.cd("..");
                        }
                        break;
                    case "ls":
                        manager.list(false);
                        break;
                    case "ll":
                        manager.list(true);
                        break;
                    case "mkdir":
                        manager.mkdir(divisionComando[1]);
                        break;
                    case "rm":
                        manager.rm(divisionComando[1]);
                        break;
                    case "mv":
                        manager.mv(divisionComando[1], divisionComando[2]);
                        break;
                    case "exit":
                        break;
                    case "help":
                        System.out.println("Comandos disponibles:\n");
                        System.out.println("- pwd: Muestra la carpeta actual.");
                        System.out.println("- cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.");
                        System.out.println("- ls: Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego archivos, ambos ordenados alfabéticamente).");
                        System.out.println("- ll: Como ls pero muestra también el tamaño y la fecha de última modificación.");
                        System.out.println("- mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual.");
                        System.out.println("- rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.");
                        System.out.println("- mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’.");
                        System.out.println("- help: Muestra una breve ayuda con los comandos disponibles.");
                        System.out.println("- exit: Termina el programa.");
                        break;
                    default:
                        throw new IllegalArgumentException("Comando desconocido: " + divisionComando[0]);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}