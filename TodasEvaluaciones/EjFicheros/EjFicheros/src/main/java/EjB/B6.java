/*
 Implementa un programa que pida al usuario un número de cualquier longitud, como por ejemploP “1234”, 
y le diga al usuario si dicho número aparece en el primer millón de decimales del nº pi (están en el archivo ‘pi-million.txt’).

No está permitido utilizar ninguna librería ni clase ni método que realice la búsqueda.
Debes implementar el algoritmo de búsqueda tú
 */
package EjB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class B6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String numero;
        boolean existe_numero = false;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero cualquiera");
        numero = lector.next();
        String numeritos[] = numero.split(""); //char[] numeritos = numero.toCharArray();

        try {
            File archivo = new File("/DAW/1º_Año/3º_Ev/Programacion/EjFicheros/Documentos/pi-million.txt");
            Scanner lectorArchivo = new Scanner(archivo);

            while (lectorArchivo.hasNextLine() == true && existe_numero == false) {

                // int contador = 2;//para no contar ni el 3 ni la ,
                String comprobar = lectorArchivo.nextLine();
                //String aux[] = comprobar.split("");//char[] aux = comprobar.toCharArray();

                if (buscarNumeros(comprobar, numero) == true) {
                    System.out.println("El numero existe");
                    existe_numero = true;

                } /*while (contador < numeritos.length) {
                    System.out.println("bucle2");
                    if (aux[contador].equals(numeritos[contador])) {
                        contador++;
                        System.out.println("if1");
                        if (contador == numeritos.length) {
                            existe_numero = true;
                            System.out.println("El numero existe");

                        } else {
                            break;
                        }
                    }

                }
                 */ else if (existe_numero == false) { // si tras recorrer el archivo no encuentro el numero
                    System.out.println("No existe el numero");
                }
            }

        } catch (FileNotFoundException X) {// si no se encuentra el archivo
            X.printStackTrace();
        }
    }

    public static boolean buscarNumeros(String linea, String numero) {

        boolean resultado = false;

        for (int contador = 0; contador <= linea.length() - numero.length(); contador++) {

            if (linea.substring(contador, contador + numero.length()).equals(numero)) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

}
