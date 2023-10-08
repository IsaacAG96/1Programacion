/*
Implementa un programa que genere aleatoriamente nombres de persona (combinando nombres y apellidos de ‘usa_nombres.txt’ y ‘usa_apellidos.txt’).
Se le pedirá al usuario cuántos nombres de persona desea generar y a qué archivo añadirlos (por ejemplo ‘usa_personas.txt’).
 */
package EjB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class B4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File archivo_A = new File("E:/Documentos/usa_nombres.txt");
            File archivo_B = new File("E:/Documentos/usa_apellidos.txt");
            File archivo_C = new File("E:/Documentos/usa_personasNUEVO.txt");

            Scanner lectorArchivo_A = new Scanner(archivo_A);
            Scanner lectorArchivo_B = new Scanner(archivo_B);
            FileWriter escritor_C = new FileWriter(archivo_C);

            int nombreAleatorio = (int) Math.round(Math.random() * 275);//hay 275 nombres
            int apellidoAleatorio = (int) Math.round(Math.random() * 246);//hay 246 apellidos
            String nombre = "";
            String apellido = "";
            for (int contador = 0; contador < nombreAleatorio; contador++) {
                nombre = lectorArchivo_A.next();

            }
            for (int contador = 0; contador < apellidoAleatorio; contador++) {
                apellido = lectorArchivo_B.next();
            }

            String completo = nombre + " " + apellido;

            escritor_C.append(completo);
            lectorArchivo_A.close();
            lectorArchivo_B.close();
            escritor_C.close();

        } catch (FileNotFoundException X) {
            X.printStackTrace();
        } catch (IOException X) {
            X.printStackTrace();
        }

    }
}
