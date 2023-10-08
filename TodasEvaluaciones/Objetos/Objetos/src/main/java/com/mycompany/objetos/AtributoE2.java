/*
El DNI de una persona no puede variar. Añade el modificador final al atributo dni y asegúrate de
que se guarde su valor en el constructor. Quita el método setDNI(…) que de todos modos ya no se
podrá utilizar porque Java no te dejará modificar el atributo dni.
La mayoría de edad a las 18 años es un valor común a todas las personas y no puede variar. Crea
un nuevo atributo llamado mayoriaEdad que sea static y final. Tendrás que inicializarlo a 18 en la
declaración. Utilízalo en el método que comprueba si una persona es mayor de edad.
Crea un método static boolean validarDNI(String dni) que devuelva true si dni es válido (tiene 8
números y una letra). Si no, devolverá false. Utilízalo en el constructor para comprobar el dni (si no
es válido, muestra un mensaje de error y no guardes los valores).
Realiza algunas pruebas en el main para comprobar el funcionamiento de los cambios realizados.
También puedes utilizar Persona.validarDNI(…) por ejemplo para comprobar si unos DNI
introducidos por teclado son válidos o no (sin necesidad de crear ningún objeto).
 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoE2 {

    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private final int mayoriaEdad = 18;

    public AtributoE2(String dni) {
        this.dni = dni;

    }

    public String getDni() {
        return dni;

    }

    public int getmayoriaEdad() {
        return mayoriaEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprime() {

        System.out.println("La persona " + this.getNombre() + " " + this.getApellidos()
                + " de edad " + this.getEdad() + " y con DNI " + this.getDni());
    }

    public boolean esMayorEdad() {
        if (this.getEdad() >= getmayoriaEdad()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esJubilado() {
        if (this.getEdad() >= 65) {
            return true;
        } else {
            return false;
        }
    }

    public int diferenciaEdad(AtributoD2 persona) {
        int diferencia;

        if (this.edad >= persona.getEdad()) {

            diferencia = this.edad - persona.getEdad();

        } else {
            diferencia = persona.getEdad() - this.edad;

        }
        return diferencia;
    }

    /**
     * Clase que permite validar un DNI. Se crea un objeto del tipo ValidadorDNI
     * y se le pasa un String a validar.
     *
     * @return true si DNI es correcto. Desarrollado por Manuel Mato.
     */
    class ValidadorDNI //COPIADO INTERNET
    {

        private final String dni;

        public ValidadorDNI(String dni) {
            this.dni = dni;
        }

        public boolean validar() {

            String letraMayuscula = ""; //Guardaremos la letra introducida en formato mayúscula

            // Aquí excluimos cadenas distintas a 9 caracteres que debe tener un dni y también si el último caracter no es una letra
            if (dni.length() != 9 || Character.isLetter(this.dni.charAt(8)) == false) {
                return false;
            }

            // Al superar la primera restricción, la letra la pasamos a mayúscula
            letraMayuscula = (this.dni.substring(8)).toUpperCase();

            // Por último validamos que sólo tengo 8 dígitos entre los 8 primeros caracteres y que la letra introducida es igual a la de la ecuación
            // Llamamos a los métodos privados de la clase soloNumeros() y letraDNI()
            if (soloNumeros() == true && letraDNI().equals(letraMayuscula)) {
                return true;
            } else {
                return false;
            }
        }

        private boolean soloNumeros() {

            int i, j = 0;
            String numero = ""; // Es el número que se comprueba uno a uno por si hay alguna letra entre los 8 primeros dígitos
            String miDNI = ""; // Guardamos en una cadena los números para después calcular la letra
            String[] unoNueve = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

            for (i = 0; i < this.dni.length() - 1; i++) {
                numero = this.dni.substring(i, i + 1);

                for (j = 0; j < unoNueve.length; j++) {
                    if (numero.equals(unoNueve[j])) {
                        miDNI += unoNueve[j];
                    }
                }
            }

            if (miDNI.length() != 8) {
                return false;
            } else {
                return true;
            }
        }

        private String letraDNI() {
            // El método es privado porque lo voy a usar internamente en esta clase, no se necesita fuera de ella

            // pasar miNumero a integer
            int miDNI = Integer.parseInt(this.dni.substring(0, 8));
            int resto = 0;
            String miLetra = "";
            String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
                "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

            resto = miDNI % 23;

            miLetra = asignacionLetra[resto];

            return miLetra;
        }
    }
}
as
