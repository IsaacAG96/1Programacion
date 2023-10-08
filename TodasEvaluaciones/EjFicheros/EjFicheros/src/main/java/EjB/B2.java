/*
El archivo ‘alumnos_notas.txt’ contiene una lista de 10 alumnos y las notas que han obtenido en cada asignatura.
El número de asignaturas de cada alumno es variable. 
Implementa un programa que muestre por pantalla la nota media de cada alumno,junto a su nombre y apellido, ordenado por nota media de mayor a menor.
 */
package EjB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File archivo = new File("E:/Documentos/alumnos_notas.txt");
            Scanner lectorArchivo = new Scanner(archivo);

            ArrayList Listado_Alumnos = new ArrayList();

            String nombre;
            String apellido;

            double Suma_Notas = 0;
            double Media = 0;

            while (lectorArchivo.hasNext()) {

                String linea = lectorArchivo.nextLine();
                String[] alumno = linea.split(" ");//array

                nombre = alumno[0];
                apellido = alumno[1];

                for (int contador = 2; contador < alumno.length; contador++) {
                    int aux = Integer.parseInt(alumno[contador]);//pasar de string a int

                    Suma_Notas = Suma_Notas + aux; //media va aumentando

                }
                Media = Suma_Notas / (alumno.length - 2);

                Alumno_B2 persona = new Alumno_B2(nombre, apellido, Media);
                Listado_Alumnos.add(persona);

                Suma_Notas = 0;//reset variable
                Media = 0;//reset variable

            }

            lectorArchivo.close();

            ordenarPorNotaMedia(Listado_Alumnos);
            mostrarAlumnos(Listado_Alumnos);

        } catch (FileNotFoundException X) {
            X.printStackTrace();
        }
    }

    public static void ordenarPorNotaMedia(ArrayList Listado_Alumnos) {//ordena los objetos alumno en base a la nota media de mayor a menor
        Collections.sort(Listado_Alumnos, new Comparator<Alumno_B2>() {
            @Override
            public int compare(Alumno_B2 e1, Alumno_B2 e2) {
                return Double.compare(e2.getNota_media(), e1.getNota_media());
            }
        });
    }

    public static void mostrarAlumnos(ArrayList Listado_Alumnos) {//muestra los objetos alumnos
        Listado_Alumnos.forEach(Alumno_B2 -> System.out.println(Alumno_B2.toString()));
    }
}
