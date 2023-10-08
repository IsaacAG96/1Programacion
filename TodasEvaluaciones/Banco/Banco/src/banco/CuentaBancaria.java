/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author DAW
 */
public class CuentaBancaria {

    private final String IBAN;
    private final String Titular;
    private int Saldo = 0;
    private int Movimientos[] = new int[100];
    private int contadorMovimientos = 0;

    public CuentaBancaria(String IBAN, String Titular) {
        this.IBAN = IBAN;
        this.Titular = Titular;

    }

    public int[] getMovimientos() {
        return Movimientos;
    }

    public int getContadorMovimientos() {
        return contadorMovimientos;
    }

    public void setContadorMovimientos(int contadorMovimientos) {
        this.contadorMovimientos = contadorMovimientos;
    }

    public String getTitular() {
        return Titular;
    }

    public String getIBAN() {
        return IBAN;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public void Modificar(int modificar) {//MODIFICA LA CANTIDAD DE MOVIMIENTOS QUE SE HAN REALIZADO

        Movimientos[contadorMovimientos] = modificar;
        setContadorMovimientos(getContadorMovimientos() + 1);

    }

    public String todosMovimientos() {//MUESTRA TODOS LOS MOVIMIENTOS

        StringBuffer listadoMov = new StringBuffer(contadorMovimientos);

        for (int contador = 0; contador < this.getContadorMovimientos(); contador++) {
            if (contador == 0) {

            } else if (contador != this.getContadorMovimientos()) {
                listadoMov = listadoMov.append(",");
            }
            listadoMov = listadoMov.append(this.getMovimientos()[contador]);

        }

        String listadoFinal = listadoMov.toString();

        return listadoFinal;

    }

    public static String RandomIBAN() {//GENERA UN IBAN VALIDO ALEATORIO
        String IBAN_Generado = "ES";
        for (int i = 0; i < 20; i++) {
            int aleatorio = (int) Math.round(Math.random() * 9);
            IBAN_Generado += Integer.toString(aleatorio);
        }

        String IBAN_Nuevo = IBAN_Generado;
        return IBAN_Nuevo;
    }
}
