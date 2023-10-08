package Ficheros;
/*
    Implementa un programa que cree la carpeta ‘Diccionario’ con tantos archivos
    como letras del abecedario (A.txt, B.txt… Z.txt). Introducirá en cada
    archivo las palabras de ‘diccionario.txt’ que comiencen por dicha letra.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FicherosB5 {
    public static void main(String[] args) {
        File f1 = new File("Documentos\\Diccionario");
        f1.mkdir();
        
        for (char i=65 ; i<91; i++) {
            try {
                File temp = new File(f1.getAbsolutePath()+"\\"+i+".txt");
                temp.createNewFile();
                FileWriter temp2 = new FileWriter(temp);
                
                File diccionario = new File("Documentos\\diccionario.txt");
                Scanner lectorDiccionario = new Scanner(diccionario);
                
                while (lectorDiccionario.hasNext()) {
                    String textotemp = lectorDiccionario.nextLine();
                    if (textotemp.toUpperCase().charAt(0) == i) {
                        temp2.write(textotemp+"\n");
                    }
                }
                temp2.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}