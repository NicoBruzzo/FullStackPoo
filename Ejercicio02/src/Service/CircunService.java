/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author DanielPalma
 */
public class CircunService {
    
    public Circunferencia crearCircunferencia(){
        
        Scanner read = new Scanner(System.in);
        Circunferencia miCirculo = new Circunferencia();
        
        System.out.println("Ingrese el radio");
        miCirculo.setRadio(read.nextDouble());
        //Cálculo del área y setteo del mismo
        double y = miCirculo.getRadio();
        double x= miCirculo.calculoArea(y);
        miCirculo.setArea(x);   
        //Cálculo del períemtro  y setteo del mismo
        miCirculo.setPerimetro(miCirculo.calculoPerimetro(miCirculo.getRadio()));
        
        return miCirculo;
 
    }
    
    
}
