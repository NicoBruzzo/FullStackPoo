/*
Crear un programa que dado un numero determine si es par o impar.
 */
package encuentro.pkg3;

import java.util.Scanner;


public class Aprendizaje6 {
public static void main (String[] args){    
  Scanner read= new Scanner(System.in);
  int num=0;
    System.out.println("Ingrese un número el programa le indicara si es par o impar");
  num=read.nextInt();
    
 if (num/2==0){ 
     System.out.println("El número " + num + " es par");    
 }else {
     System.out.println("El número " +num + " es impar");
 } 
}
}
