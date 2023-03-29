package encuentro.pkg3;
import java.util.Scanner;

/**
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Aprendizaje4 {
public static void main (String[] args){ 
    
 Scanner read=new Scanner(System.in);
 int num1=0,num2;
System.out.println("Increse un número de grados centígrados para que el programa lo cambie a Fahrenheit"); 
    num1=read.nextInt();
 
    num2=32+(9*num1/5);
    
    System.out.println("Los grados en Fahrenheit son : "+ num2); 
    
}
}
