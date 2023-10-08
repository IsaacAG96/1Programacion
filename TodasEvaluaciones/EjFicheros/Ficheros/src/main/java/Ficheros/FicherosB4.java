package Ficheros;
/*
    Implementa un programa que genere aleatoriamente nombres de persona
    (combinando nombres y apellidos de ‘usa_nombres.txt’ y ‘usa_apellidos.txt’).
    Se le pedirá al usuario cuántos nombres de persona desea generar y a qué
    archivo añadirlos (por ejemplo ‘usa_personas.txt’).
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FicherosB4 {
    public static void main(String[] args) {
        try {
            File f1 = new File("Documentos\\usa_nombres.txt");
            File f2 = new File("Documentos\\usa_apellidos.txt");
            Scanner lector1 = new Scanner(f1);
            Scanner lector2 = new Scanner(f2);
            Scanner esc = new Scanner(System.in);

            ArrayList<String> nombres = new ArrayList();
            ArrayList<String> apellidos = new ArrayList();

            for (int i = 0 ; lector1.hasNext() ; i++) {
                nombres.add(lector1.nextLine());
            }
            for (int i = 0 ; lector2.hasNext() ; i++) {
                apellidos.add(lector2.nextLine());
            }

            System.out.println("¿Cuántos nombres quieres generar?");
            int cont = esc.nextInt();
            System.out.println("Escribe el nombre del archivo en el que se guardarán los nombres:");
            FileWriter fnombres = new FileWriter("Documentos\\FicherosB4.txt");
            //FileWriter fnombres = new FileWriter(esc.nextLine());

            for (int i = 0 ; i < cont ; i++) {
                String tempNom = nombres.get((int) (Math.random() * nombres.size()));
                String tempApe = apellidos.get((int) (Math.random() * apellidos.size()));
                fnombres.write(tempNom + " " + tempApe + "\n");
            }

            lector1.close();
            lector2.close();
            fnombres.close();
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}