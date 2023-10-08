/*
 Aplica el encapsulamiento básico a la clase Articulo: Declara todos sus atributos como private y
crea todos los getters y setters necesarios (un get y un set por atributo).
Programa los setters para que comprueben los valores y los guarden en el objeto solo si son
correctos. En caso contrario muestra un mensaje de error.
 */
package com.mycompany.objetos;

/**
 *
 * @author DAW
 */
public class AtributoC4 {

    public AtributoC4() {
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

    private String nombre;
    private double precio;
    private double iva = 21;
    private double pvp;
    private int stock;

}
