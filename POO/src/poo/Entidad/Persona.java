/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.Entidad;

/**
 *
 * @author Nico
 */
public class Persona {
    
public String Nombre;
public int Edad;
public int ID;

    public Persona(String Nombre, int Edad, String Genero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.ID = ID;
    }

    public Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Persona(String mariano_Marcos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public int getID() {
        return ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void getNombre(String mariano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
