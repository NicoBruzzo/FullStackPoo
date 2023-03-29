package encuentro.pkg3;
import java.util.Scanner;

/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */

/**
 *
 * @author Nico
 */
public class EjerciciosEx6 {
     public static void main(String[] args) {   
Scanner read= new Scanner(System.in);

  int P=5;
  double [] Vector= new double [5];
  double num=0,sum,Bajitos=0;
         sum = 0;
          
         for (int i = 0; i < P; i++) {
             System.out.println("Ingrese la altura de la persona n°" + (i+1));
             num=read.nextDouble();
             Vector[i]=num;
             sum=sum+Vector[i];
         }
         for (int i = 0; i < P; i++) {
             if (Vector[i]<1.6) {
               Bajitos++;  
             } 
         }
   System.out.println("El promedio de las personas por debajo de 1,60 metros es: " + (5/Bajitos)); 
         System.out.println(" ");
         System.out.println("El promedio de estaturas en general es: " + (sum/5));     
   
     }  
}
