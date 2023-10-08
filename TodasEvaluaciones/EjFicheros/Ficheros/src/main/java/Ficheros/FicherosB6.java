package Ficheros;
/*
    Implementa un programa que pida al usuario un número de cualquier longitud,
    como por ejemplo “1234”, y le diga al usuario si dicho número aparece en el
    primer millón de decimales del nº pi (están en el archivo ‘pi-million.txt’).
    No está permitido utilizar ninguna librería ni clase ni método que realice
    la búsqueda. Debes implementar el algoritmo de búsqueda tú.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FicherosB6 {
    public static void main(String[] args) throws FileNotFoundException {
        File fpi = new File("Documentos\\pi-million.txt");
        Scanner lectorpi = new Scanner(fpi);
        String pi = lectorpi.nextLine();
        Scanner esc = new Scanner(System.in);
        System.out.println("Introduce un numero de cualquier longitud:");
        String num = esc.nextLine();
        boolean coincidencia = false;
        //EL NUMERO 123456 (1234567, 12345678,123456789 etc HACE QUE EL PROGRAMA FALLE, NO SE POR QUE
        int i = 0;
        while (i < pi.length() && !coincidencia) {
            if (pi.charAt(i) == num.charAt(0)) {
                int j = i+1;
                for (int k = 1 ; k < num.length() ; k++) {
                    if (pi.charAt(j) != num.charAt(k)) {
                        break;
                    } else if (k == (num.length()-1)) {
                        coincidencia = true;
                    }
                    j++;
                }
                if (coincidencia) {
                    break;
                }
            }
            i++;
        }
        if (coincidencia) {
            System.out.println("Su numero existe entre los decimales de pi");
        } else {
            System.out.println("Su numero NO existe entre los decimales de pi");
        }
    }
}