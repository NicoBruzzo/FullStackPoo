
package encuentro.pkg3;
import java.util.Scanner;
/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
public class Aprendizaje1 {
public static void main (String [] args){
 Scanner read= new Scanner(System.in);
 int num1,num2,suma;   
 System.out.println("Ingrese dos números, el programa los sumará");
 num1=read.nextInt();
 num2=read.nextInt();
 
 suma=num1+num2;
 
    System.out.println("La suma de los números ingresados es "+ suma);
    
    
}    
}
