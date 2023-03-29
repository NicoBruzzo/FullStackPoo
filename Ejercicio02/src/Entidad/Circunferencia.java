/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author DanielPalma
 */
public class Circunferencia {
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
    public double calculoArea(double radio){
        
        double area = (Math.PI)*Math.pow(radio,2);
        
        return area;
                     
    }
    
    public double calculoPerimetro(double radio){
        
        double perimetro = 2*(Math.PI)*radio;
        
        return perimetro;             
    }

    @Override
    public String toString() {
        return "Datos de Circunferencia: \n" + "radio=" + radio + "\n" + "area=" + area + "\n" + "perimetro=" + perimetro;
    }

  
}
