package encuentro.pkg3;
/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor.
 */
import java.util.Scanner;

public class Ejercicio10 {
     public static void main(String[] args) {
         Scanner read = new Scanner(System.in);    
    int num;
     for (int i=0;i<4;i++){
        do{
         System.out.println("Ingrese un número entre 1 y 20");
      num = read.nextInt();
     } while(num<1 || 20<num);
     System.out.print(num);
     for (int j=0;j<num;j++){
             System.out.print("*");
     }   
         System.out.println("");
     }
}
}