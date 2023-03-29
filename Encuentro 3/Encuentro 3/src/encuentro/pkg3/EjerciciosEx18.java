/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package encuentro.pkg3;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class EjerciciosEx18 {
    public static void main(String[] args) {  
Scanner read= new Scanner(System.in);    
int []Vect= new int[8];
int sum=0;

     for (int i = 0; i < 8; i++) {
      System.out.println("Ingrese 8 números enteros el programa los sumará a todos");
       Vect[i]=read.nextInt();
       sum+=Vect[i];
        }
        
        System.out.println("La suma total de los números ingresados es: "+ sum);
        
        System.out.println("Los números ingresados fueron: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(" [ "+ Vect[i] + " ] ");
            }
}
}