package Ficheros;
/*
    Implementa un programa, que muestre por pantalla los valores máximos y
    mínimos del archivo ‘numeros.txt’.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FicherosB1 {
    public static void main(String[] args) {
        try {
            File f = new File("Documentos\\numeros.txt");
            Scanner lector = new Scanner(f);
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while (lector.hasNext()) {
                int temp = Integer.valueOf(lector.nextLine());
                if (temp < min) {
                    min = temp;
                }
                if (temp > max) {
                    max = temp;
                }
            }
            lector.close();
            System.out.println(min+", "+max);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}