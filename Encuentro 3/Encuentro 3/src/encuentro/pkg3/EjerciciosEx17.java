/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
 */
package encuentro.pkg3;

import java.util.Scanner;


public class EjerciciosEx17 {
  public static void main(String[] args) {  
Scanner read= new Scanner(System.in);    
int num;
boolean retorno;

      System.out.println("Ingrese un número, el programa le dirá si es un número primo o no");
      num=read.nextInt();
  
 retorno=primo(num);
      if (retorno) {
          System.out.println("El número es primo");
      }else
          System.out.println("El número No es primo");
}
  
 public static boolean primo(int num) { 
     float x=1,cont=0;
   while (x<= num) { 
     if (num%x==0){ 
     cont++;
     }
     x++;      
   }
      return cont==2 || cont==1;
   } 
}