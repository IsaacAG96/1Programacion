/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConAmpliacion;

/**
 *
 * @author isaac
 */
public class ContactoEmpresa extends Contacto {

    private String paginaWeb;

    public ContactoEmpresa(String paginaWeb, String nombre, int telefono) {
        super(nombre, telefono);
        this.paginaWeb = paginaWeb;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

}
