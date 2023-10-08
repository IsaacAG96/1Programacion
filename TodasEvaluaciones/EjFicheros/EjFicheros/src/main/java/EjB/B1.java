/*
Implementa un programa, que muestre por pantalla los valores máximos y mínimos del archivo ‘numeros.txt’.
 */
package EjB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int menor = 999999;
        int mayor = -999999;
        int contador = 0;
        try {
            File archivo = new File("E:/Documentos/numeros.txt");
            Scanner lectorArchivo = new Scanner(archivo);

            while (lectorArchivo.hasNextInt() == true) {
                int aux = lectorArchivo.nextInt();

                if (aux > mayor) {
                    mayor = aux;
                } else if (aux < menor) {
                    menor = aux;

                }

                contador++;

            }

            lectorArchivo.close();

            System.out.println("Vueltas dadas en total: " + contador);
            System.out.println("Menor->" + menor);
            System.out.println("Mayor->" + mayor);

        } catch (FileNotFoundException X) {
            X.printStackTrace();
        }
    }

}
