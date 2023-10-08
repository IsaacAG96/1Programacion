/*
Añade a la clase Artículo métodos públicos con las siguientes funcionalidades:
• Método para imprimir la información del artículo por pantalla.
• Método getPVP que devuelva el precio de venta al público (PVP) con iva incluido.
• Método getPVPDescuento que devuelva el PVP con un descuento pasado como argumento.
• Método vender que actualiza los atributos del objeto tras vender una cantidad ‘x’ (si es
posible). Devolverá true si ha sido posible (false en caso contrario).
• Método almacenar que actualiza los atributos del objeto tras almacenar una cantidad ‘x’ (si
es posible). Devolverá true si ha sido posible (false en caso contrario).
 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoD4 {

    private String nombre;
    private double precio;
    private double iva = 21;
    private double pvp;
    private int stock;

    public AtributoD4() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void imprime() {
        System.out.println((this.getNombre()) + " - Precio:" + (this.getPrecio()) + " € - IVA 21% tiene un PVP de: " + (this.getPvp()) + " €,con " + this.getStock() + " en stock");

    }

    public double getPvpDescuento(double descuento) {
        double aux = this.getPrecio() * descuento;
        double pvpDescuento = this.getPrecio() - aux;
        return pvpDescuento;
    }

    public void cambioStock(int cambio) {

        if (this.getStock() + cambio <= 0) {

            System.out.println("FALSE");

        } else if (cambio >= 0) {

            if (cambio == 0) {
                System.out.println("TRUE");
            } else if (cambio > 1) {

                int aux = this.getStock() + cambio;
                this.setStock(aux);
                System.out.println("TRUE");
            } else if (cambio < 1) {
                int aux = this.getStock() - cambio;
                this.setStock(aux);
                System.out.println("TRUE");

            }
        }

    }
}
