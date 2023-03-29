/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package encuentro.pkg3;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class EjerciciosEx4 {
public static void main(String[] args) {   
    Scanner read= new Scanner(System.in);
 int num;
 String Rom;
 
    System.out.println("Ingrese un número del 1 al 10 el programa lo transformará en romano");
    num=read.nextInt();
    String numRom;
        switch (num) {
            case 1:
                numRom = "I";
                System.out.println("El número en romano es: " + numRom);
                break;
            case 2:
                numRom = "II";
                System.out.println("El número en romano es: " + numRom);
                break;
            case 3:
                numRom = "III";
                System.out.println("El número en romano es: " + numRom);
                break;
            case 4:
                numRom = "IV";
                System.out.println("El número en romano es: " + numRom);
                break;
            case 5:
                numRom = "V";
                System.out.println("El número en romano es: " + numRom);
                break;
            case 6:
                numRom = "VI";
                System.out.println("El número en romano es: " + numRom);
                break;
            case 7:
                numRom = "VII";
                System.out.println("El número en romano es: " + numRom);
                break;
            case 8:
                numRom = "VIII";
                System.out.println("El número en romano es: " + numRom);
                break;
            case 9:
                numRom = "IX";
                System.out.println("El número en romano es: " + numRom);
                break;
            case 10:
                numRom = "X";
                System.out.println("El número en romano es: " + numRom);
                break;
                }
}
}
