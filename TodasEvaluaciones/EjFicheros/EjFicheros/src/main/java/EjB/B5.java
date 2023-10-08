/*
Implementa un programa que cree la carpeta ‘Diccionario’ con tantos archivos como letras del abecedario (A.txt, B.txt… Z.txt).
Introducirá en cada archivo las palabras de ‘diccionario.txt’ que comiencen por dicha letra.
 */
package EjB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Normalizer;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class B5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File archivo = new File("/DAW/1º_Año/3º_Ev/Programacion/EjFicheros/Documentos/Abecedario");

            archivo.mkdir();

            for (int contador = 0; contador < 26; contador++) {
                System.out.println("check");
                String aux = archivo.getAbsolutePath() + "/" + ((char) ('a' + contador) + ".txt");
                File letra = new File(aux);

            }

            File archivo2 = new File("/DAW/1º_Año/3º_Ev/Programacion/EjFicheros/Documentos/diccionario.txt");
            Scanner lector_archivo2 = new Scanner(archivo2);

            while (lector_archivo2.hasNext() == true) {
                String palabra_extraida = lector_archivo2.next();
                String letra[] = palabra_extraida.split("");

                //le quita acentos a la letra inicial para que coincida con el nombre de uno de los txt existentes
                String letra_ok = Normalizer.normalize(letra[0], Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

                //se transforma la primera letra a minuscula para evitar fallo en caso de que halla palabras que empiecen por mayus
                letra_ok = letra_ok.toLowerCase();

                String ruta = "/DAW/1º_Año/3º_Ev/Programacion/EjFicheros/Documentos/Abecedario/" + letra_ok + ".txt";
                File letra_llenar = new File(ruta);

                FileWriter escritor_archivos = new FileWriter(letra_llenar, true);
                escritor_archivos.append(palabra_extraida);
                escritor_archivos.append("\n");
                escritor_archivos.close();

            }

            lector_archivo2.close();
        } catch (FileNotFoundException X) {
            X.printStackTrace();
        } catch (IOException X) {
            X.printStackTrace();
        }
    }

}
//sigue creando un txt para los que empiezan con guion