/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse.
 */
package encuentro.pkg3;

import java.util.Scanner;

public class EjerciciosEx8 {
     public static void main(String[] args) {   
Scanner read= new Scanner(System.in);
float num=0,par=0,impar=0;
while(num!=5){
    
    System.out.println("Ingrese números enteros positivos el programa los almacenará");
    num=read.nextFloat();
      if (num%5==0){
        break;
    }else if (num%2==0){
        par++;
    } else {
        if (num/2!=0){
        impar++;
    } 
  } 
      System.out.println("Hola");
}

         System.out.println("La cantidad de número pares ingresada fue : "+ par);
         System.out.println(" ");
         System.out.println("La cantidad de números impares ingresada fue: "+impar);
         System.out.println(" ");
         System.out.println("");
}
}
