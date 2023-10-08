package Ficheros;
/*
    Implementa un programa que lea un documento de texto y muestre por pantalla
    algunos datos estadísticos: nº de líneas, nº de palabras, nº de caracteres y
    cuáles son las 10 palabras más comunes (y cuántas veces aparecen). Prueba el
    programa con los archivos de la carpeta ‘Libros’.
    NOTA: Para llevar la cuenta de cuántas veces aparece cada palabra puedes
    utilizar una HashTable. Una tabla hash es una estructura de datos tipo
    colección (como el ArrayList), que permite almacenar pares clave-valor.
    Por ejemplo {“elefante”, 5} o {“casa”, 10} son pares <String,Integer> que
    asocian una palabra (clave) con un nº entero (valor).
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FicherosB7 {
    public static void main(String[] args) {
        try {
            for (int i = 1 ; i < 6 ; i++) {
                String libroString = "";
                switch(i) {
                    case(1):
                        libroString = "\\coplas_manrique.txt";
                        break;
                    case(2):
                        libroString = "\\fuenteovejuna_lopevega.txt";
                        break;
                    case(3):
                        libroString = "\\lazarillo.txt";
                        break;
                    case(4):
                        libroString = "\\quijote_cervantes.txt";
                        break;
                    case(5):
                        libroString = "\\vida_unamuno.txt";
                        break;
                }

                File f = new File("Documentos\\libros"+libroString);
                int numLineas = 0;
                int numPalabras = 0;
                int numCaracteres = 0;
                HashMap<String, Integer> palabrasHashMap = new HashMap();

                for (int j = 1 ; j < 4 ; j++) {
                    Scanner lector1 = new Scanner(f);
                    switch(j) {
                        case(1):
                            while (lector1.hasNext()) {
                                lector1.nextLine();
                                numLineas++;
                            }
                            break;
                        case(2):
                            FileReader lector2 = new FileReader(f);
                            while (lector1.hasNext()) {
                                lector1.next();
                                numPalabras++;
                            }
                            while (lector2.ready()) {
                                lector2.read();
                                numCaracteres++;
                            }
                            lector2.close();
                            break;
                        case(3):
                            while (lector1.hasNext()) {
                                String palabra = lector1.next();
                                if (palabrasHashMap.get(palabra) == null) {
                                    palabrasHashMap.put(palabra,1);
                                } else {
                                    int posicion = palabrasHashMap.get(palabra)+1;
                                    palabrasHashMap.put(palabra,posicion);
                                }
                            }
                            //PRUEBAS
                            List<String> keys = palabrasHashMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(10).map(Map.Entry::getKey).collect(Collectors.toList());
                            HashMap<String, Integer> palabrastemp = new HashMap();
                            for (int cont = 0 ; cont < 10 ; cont++) {
                                String palabra = keys.get(cont);
                                palabrastemp.put(palabra,palabrasHashMap.get(palabra));
                            }
                            System.out.println(palabrastemp);
                            break;
                    }
                    lector1.close();
                }
                System.out.println("Número de lineas: "+numLineas);
                System.out.println("Número de palabras: "+numPalabras);
                System.out.println("Número de caracteres: "+numCaracteres);
                System.out.println("-----------------------------");
                palabrasHashMap.values();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Excepcion: " + e);
        } catch (IOException e) {
            System.out.println("Excepcion: " + e);
        } catch (Exception e) {
            System.out.println("Excepcion: " + e);
        }
    }
}