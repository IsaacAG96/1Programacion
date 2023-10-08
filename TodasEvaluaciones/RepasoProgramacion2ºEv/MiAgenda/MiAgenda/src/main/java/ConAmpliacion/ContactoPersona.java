/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConAmpliacion;

/**
 *
 * @author isaac
 */
public class ContactoPersona extends Contacto {

    private String cumpleaños;

    public ContactoPersona(String cumpleaños, String nombre, int telefono) {
        super(nombre, telefono);
        this.cumpleaños = cumpleaños;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

}
