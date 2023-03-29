
package encuentro.pkg3;

import java.util.Scanner;

/**
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class EjercicioEx1 {
     public static void main(String[] args) {
    Scanner read= new Scanner(System.in);
   int H=0,D=0;
    
         System.out.println("Ingrese la cantidad de tiempo en minutos que quiera convertir");
         int num= read.nextInt();
         D=num/(60*24);
     H=num/60-D*24;
         System.out.println("El tiempo ingresado son:  "+D + " Días con " + H + "Horas" );
    
     }  
}
