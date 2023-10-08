package Ficheros;
/*
    Implementa un programa que pida al usuario, un nombre de archivo A para
    lectura y otro nombre de archivo B para escritura. Leerá el contenido del
    archivo A (por ejemplo ‘usa_personas.txt’) y lo escribirá ordenado
    alfabéticamente en B (por ejemplo ‘usa_personas_sorted.txt’.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FicherosB3 {
    public static void main(String[] args) {
        try {
            Scanner esc = new Scanner(System.in);
            System.out.println("Introduce un nombre de archivo A para lectura y uno B para escritura:");

            //File f1 = new File(esc.nextLine());
            //File f2 = new File(esc.nextLine());
            File f1 = new File("Documentos\\usa_personas.txt");
            File f2 = new File("Documentos\\usa_personas_sorted.txt");
            Scanner fLectura = new Scanner(f1);
            FileWriter fEscritura = new FileWriter(f2);
            ArrayList<String> temp = new ArrayList<>();

            for (int i = 0 ; fLectura.hasNext() ; i++) {
                temp.add(fLectura.nextLine()+"\n");
            }   Collections.sort(temp);

            for (int i = 0 ; i < temp.size() ; i++) {
                fEscritura.write(temp.get(i));
            }

            fLectura.close();
            fEscritura.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}