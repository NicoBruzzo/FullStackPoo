/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package encuentro.pkg3;

import java.util.Scanner;


public class EjerciciosEx7 {
        public static void main(String[] args) {   
Scanner read= new Scanner(System.in); 
int N=0,count=0, num, max=0,min=100;
double promedio=0;

            System.out.println("Ingrese la cantidad total de valores ");
            N = read.nextInt();
        while (count <N){  
            System.out.println("Ingrese un número entero");
            num=read.nextInt();
                if (num<min) {
                    min=num;
                }else if (max<num) {
                 max=num;   
                }
                promedio+=num;
                count++;
        }    
            System.out.println("El número máximo es: "+ max);
            System.out.println(" ");
            System.out.println("El número mínimo es: "+ min);
            System.out.println(" ");
            System.out.println("El promedio de todos los números es: " + (promedio/N));
            
        }
}


