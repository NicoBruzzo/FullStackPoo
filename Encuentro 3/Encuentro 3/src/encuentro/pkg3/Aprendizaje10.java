/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package encuentro.pkg3;
import java.util.Scanner;

public class Aprendizaje10 {
public static void main (String [] args) {
Scanner read= new Scanner(System.in);

    System.out.println("Ingrese un número positivo máximo");
int num=read.nextInt();

int num1,suma;
num1=0;
suma=0;

while (suma<num){
    System.out.println("Ingrese numéros que se sumarán hasta llegar al límite indicado");
  num1=read.nextInt();
  suma=num1+suma;
}
    System.out.println("La suma total de los números ingresados "+ suma+ "ha superado el límite establecido");
    
}   
}
