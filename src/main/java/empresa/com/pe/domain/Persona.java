
package empresa.com.pe.domain;

import java.io.Serializable;

public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    private int persona;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }

    public Persona(int persona, String apellido, String email, String telefono) {
        this.persona = persona;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public Persona(int i, String juan, String perez, String jperezmailcom, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "persona=" + persona + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
    
}
