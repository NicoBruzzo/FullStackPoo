/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej02Aprendizaje;

import Entidad.Circunferencia;
import Service.CircunService;

/**
 *
 * @author DanielPalma
 */
public class Ej02Aprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunService cs = new CircunService();  //crear Servicio
        Circunferencia miCirculo = cs.crearCircunferencia();  //crear Objeto
        
        System.out.println(miCirculo.toString());  //Impresión de los datos con toString
        
    }
    
}
