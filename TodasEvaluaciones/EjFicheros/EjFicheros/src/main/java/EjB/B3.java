/*
Implementa un programa que pida al usuario, un nombre de archivo A para lectura y otro nombre de archivo B para escritura.
Leerá el contenido del archivo A (por ejemplo ‘usa_personas.txt’) y lo escribirá ordenado alfabéticamente en B (por ejemplo ‘usa_personas_sorted.txt’).
 */
package EjB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            File archivo_A = new File("C:/Users/isaac/Desktop/Documentos/Documentos/usa_personas.txt");

            Scanner lectorArchivo = new Scanner(archivo_A);

            String nombre;
            String apellido;

            ArrayList Listado_Personas = new ArrayList();

            while (lectorArchivo.hasNext() == true) {//llena el array list de objetos que tienen nombre y apellido
                nombre = lectorArchivo.next();
                apellido = lectorArchivo.next();
                Persona_B3 persona = new Persona_B3(nombre, apellido);
                Listado_Personas.add(persona);

            }
            lectorArchivo.close();

            ordenarPorNombre(Listado_Personas);
            llenarTxt(Listado_Personas);

        } catch (FileNotFoundException X) {
            X.printStackTrace();
        } catch (IOException X) {
            X.printStackTrace();
        } catch (Exception x) {
            System.out.println("Excepcion encontrada! :" + x);
        }

    }

    public static void ordenarPorNombre(ArrayList<Persona_B3> Listado_Personas) throws Exception {//ordena el array list de objetos en base al nombre
        if (Listado_Personas == null || Listado_Personas.isEmpty()) {
            throw new Exception("La lista de personas está vacía o es nula");
        }
        Collections.sort(Listado_Personas, new Comparator<Persona_B3>() {
            @Override
            public int compare(Persona_B3 persona1, Persona_B3 persona2) {
                return persona1.getNombre().compareTo(persona2.getNombre());
            }
        });
    }

    public static void llenarTxt(ArrayList<Persona_B3> listadoPersonas) throws IOException {//llena el txt con los nombres+apellidos del array list de objetos

        File archivo_B = new File("C:/Users/isaac/Desktop/Documentos/Documentos/usa_personas_sorted.txt");
        FileWriter escritor = new FileWriter(archivo_B);

        for (Persona_B3 persona : listadoPersonas) {
            escritor.append(persona.toString());
            escritor.append("\n");//salto de linea

        }
        escritor.close();
    }

}
