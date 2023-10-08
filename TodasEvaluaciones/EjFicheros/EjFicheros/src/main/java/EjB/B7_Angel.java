/*
Implementa un programa que lea un documento de texto y muestre por pantalla algunos datos estadísticos:
nº de líneas, nº de palabras, nº de caracteres y cuáles son las 10 palabras más comunes (y cuántas veces aparecen).
Prueba el programa con los archivos de la carpeta ‘Libros’.

NOTA: Para llevar la cuenta de cuántas veces aparece cada palabra puedes utilizar una HashTable. 
Una tabla hash es una estructura de datos tipo colección (como el ArrayList), que permite almacenar pares clave-valor.
Por ejemplo {“elefante”, 5} o {“casa”, 10} son pares <String,Integer> que asocian una palabra (clave) con un nº entero (valor).
 */
package EjB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DAW
 */
public class B7_Angel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            int numero_lineas = 0;
            int numero_palabras = 0;
            int numero_caracteres = 0;

            File manrique = new File("/DAW/1º_Año/3º_Ev/Programacion/EjFicheros/Documentos/Libros/coplas_manrique.txt");
            Scanner lector_manrique = new Scanner(manrique);

            HashMap<Integer, String> lista_manrique = new HashMap<>();

            while (lector_manrique.hasNext() == true) {//cuenta lineas
                int contador = 0;
                int contador1 = 0;
                String aux = lector_manrique.nextLine();

                numero_lineas++;

                String palabras[] = aux.split(" ");
                String letras[] = aux.split("");

                while (contador < palabras.length) {//cuenta palabras
                    lista_manrique.put(numero_palabras, palabras[contador]);
                    contador++;
                }
                while (contador1 < letras.length) {
                    contador1++;

                }

                numero_palabras = numero_palabras + contador;
                numero_caracteres = numero_caracteres + contador1;

            }

            //CODIGO ROBOT EMPIEZA
            //crear un HashMap adicional para contar el número de repeticiones de cada valor
            HashMap<String, Integer> repeticiones = new HashMap<>();
            for (String valor : lista_manrique.values()) {
                repeticiones.put(valor, repeticiones.getOrDefault(valor, 0) + 1);
            }

            // crear una lista de entradas
            List<Map.Entry<Integer, String>> lista_entradas = new ArrayList<>(lista_manrique.entrySet());

            // ordenar la lista en función del número de repeticiones (valueCount)
            Collections.sort(lista_entradas, new Comparator<Map.Entry<Integer, String>>() {
                @Override
                public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                    int valueCount1 = Collections.frequency(lista_manrique.values(), o1.getValue());
                    int valueCount2 = Collections.frequency(lista_manrique.values(), o2.getValue());
                    return Integer.compare(valueCount2, valueCount1);
                }
            });

            // mostrar las 10 entradas más repetidas y cuántas veces se repiten
            int count = 0;
            Set<String> valores_mostrados = new HashSet<>();
            for (Map.Entry<Integer, String> entrada : lista_entradas) {
                String valor = entrada.getValue();
                if (!valores_mostrados.contains(valor)) {
                    valores_mostrados.add(valor);
                    int repeticion = repeticiones.get(valor);
                    System.out.println("Palabra:-> " + valor + " <- | Repeticiones: " + repeticion);
                    count++;
                    if (count >= 10) {
                        break;
                    }
                }
            }
            //CODIGO ROBOT ACABA

            System.out.println("Cantidad lineas = " + numero_lineas);
            System.out.println("Cantidad palabras = " + numero_palabras);
            System.out.println("Cantidad caracteres = " + numero_caracteres);

        } catch (FileNotFoundException x) {
            System.out.println("Excepcion: " + x);
        }
    }

}
//solo esta uno de todos,faltan los demas

//MIRAR ANGEL
