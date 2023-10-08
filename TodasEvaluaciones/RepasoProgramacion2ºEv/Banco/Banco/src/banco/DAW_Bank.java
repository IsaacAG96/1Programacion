/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class DAW_Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lector = new Scanner(System.in);

        int lectura;
        String relleno = "--------------------------------------------------------------------------------------------------";
        String auxIBAN = CuentaBancaria.RandomIBAN();
        System.out.println("Introduce el nombre del titular de la cuenta,reuerde que no podra ser modificado posteriormente");
        CuentaBancaria Cuenta = new CuentaBancaria(auxIBAN, lector.next());
        boolean salida = false;

        while (salida == false) {

            System.out.println("Bienvenido al menu del banco.Seleccione una opcion");
            System.out.println("");
            System.out.println("1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.");
            System.out.println("2. IBAN. Mostrará el IBAN.");
            System.out.println("3. Titular. Mostrará el titular.");
            System.out.println("4. Saldo. Mostrará el saldo disponible.");
            System.out.println("5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.");
            System.out.println("6. Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible");
            System.out.println("7. Movimientos. Mostrará una lista con el historial de movimientos.");
            System.out.println("8. Salir. Termina el programa");
            int seleccion = lector.nextInt();

            switch (seleccion) {
                case 1://MUESTRA LOS DATOS DE LA CUENTA
                    System.out.println("Has seleccionado Datos de la cuenta");
                    System.out.println("La cuenta cuyo titular es " + Cuenta.getTitular() + " con IBAN "
                            + Cuenta.getIBAN() + " tiene un saldo actual de " + Cuenta.getSaldo() + " €");
                    System.out.println(relleno);//SEPARACION VISUAL
                    break;

                case 2://MUESTRA EL IBAN
                    System.out.println("Has seleeccionado IBAN");
                    System.out.println("El IBAN de la cuenta es: " + Cuenta.getIBAN());
                    System.out.println(relleno);//SEPARACION VISUAL
                    break;

                case 3://MUESTRA EL TITULAR
                    System.out.println("Has seleccionado Titular");
                    System.out.println("El titular de la cuenta es: " + Cuenta.getTitular());
                    System.out.println(relleno);//SEPARACION VISUAL
                    break;

                case 4://MUESTRA EL SALDO
                    System.out.println("Has seleccionado Saldo");
                    System.out.println("Tu saldo actual es de: " + Cuenta.getSaldo() + " €");
                    System.out.println(relleno);//SEPARACION VISUAL
                    break;

                case 5://INGRESA DINERO
                    System.out.println("Has seleccionado Ingreso");
                    System.out.println("Introduce los € que quieres ingresar");

                    lectura = lector.nextInt();

                    Cuenta.Modificar(+lectura);

                    Cuenta.setSaldo(Cuenta.getSaldo() + lectura);
                    System.out.println(relleno);//SEPARACION VISUAL
                    break;

                case 6://RETIRA DINERO
                    System.out.println("Has seleccionado Retirada");
                    System.out.println("Introduce los € que quieres retirar");

                    lectura = lector.nextInt();

                    Cuenta.Modificar(-lectura);

                    Cuenta.setSaldo(Cuenta.getSaldo() - lectura);
                    System.out.println(relleno);//SEPARACION VISUAL
                    break;

                case 7://MUESTRA LOS MOVIMIENTOS
                    System.out.println("Has seleccionado Movimientos");
                    System.out.println("Tus movimientos son los siguientes");
                    System.out.println(Cuenta.todosMovimientos());
                    System.out.println(relleno);//SEPARACION VISUAL
                    break;

                case 8://CIERRA LA APP
                    System.out.println("Has seleccionado Salir");
                    salida = true;
                    System.out.println(relleno);//SEPARACION VISUAL
                    break;

            }
        }

    }
}
