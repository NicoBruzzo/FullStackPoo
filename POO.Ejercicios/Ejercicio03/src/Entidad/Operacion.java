/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Nico
 */
public class Operacion {
 private double num1;
 private double num2;
 private double suma;
 private double rest;
 private double mult;
 private double division;

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
 
   public double sumar(double num1,double num2){
     
       double suma=num1+num2;
       
       return suma;
    
}   
     public double restar(double num1,double num2){
     
       double rest=num1-num2;
       
       return rest;
   } 
     public double multi(double num1,double num2){
     
     double multi = num1*num2;
       
       return multi;
   }  
     public double division(double num1,double num2){
     
     double division = num1*num2;
       
       return division;
   }    
     
}
