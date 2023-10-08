package Ficheros;
/*
    El archivo ‘alumnos_notas.txt’ contiene una lista de 10 alumnos y las notas
    que han obtenido en cada asignatura. El número de asignaturas de cada alumno
    es variable. Implementa un programa que muestre por pantalla la nota media
    de cada alumno, junto a su nombre y apellido, ordenado por nota media de
    mayor a menor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FicherosB2 {
    public static void main(String[] args) {
        try {
            File f = new File("Documentos\\alumnos_notas.txt");
            Scanner lector = new Scanner(f);
            String[] alumnos = new String[10];
            for (int i = 0; lector.hasNext(); i++) {
                alumnos[i] = lector.nextLine();
            }

            double media[] = new double[10];

            for (int i = 0; i < 10; i++) {
                String[] temp = alumnos[i].split(" ");
                media[i] = 0;
                for (int j = 2; j < temp.length; j++) {
                    media[i] = media[i] + Integer.valueOf(temp[j]);
                }
                media[i] = media[i] / (temp.length - 2);
            }

            String[][] alumnosMatriz = new String[10][2];

            for (int i = 0; i < 10; i++) {
                alumnosMatriz[i][0] = alumnos[i];
                alumnosMatriz[i][1] = "" + media[i];
            }

            Arrays.sort(alumnosMatriz, new Comparator<String[]>(){
                @Override
                public int compare(final String[] first, final String[] second){
                    return Double.valueOf(second[1]).compareTo(Double.valueOf(first[1]));
                }
            });

            for (int i = 0; i < 10; i++) {
                System.out.println(alumnosMatriz[i][0]+", media: "+alumnosMatriz[i][1]);
            }

            lector.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}