/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.Entidad.Persona;

/**
 *
 * @author Nico
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  Persona primerapersona = new Persona();
  Persona segundaPersona =new Persona ("Mariano Marcos");
  
  segundaPersona.getNombre("Mariano");
  
}
}