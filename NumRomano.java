/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.numromano;

import java.util.Scanner;

/**
 *
 * @author DanielPalma
 */
public class NumRomano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        String numRom;
        do {
        System.out.println("Ingrese un número");
        num = read.nextInt();
        } while (num<1 || num>10);
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
