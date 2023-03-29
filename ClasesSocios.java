/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.clasessocios;

import java.util.Scanner;

/**
 *
 * @author DanielPalma
 */
public class ClasesSocios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String socio="";
        double cost, pago;
        do {
            System.out.println("Ingrese qué tipo de socio es (A,B,C):");
            socio = read.next();
        } while (!socio.equals("A") && !socio.equals("B") && !socio.equals("C"));
        System.out.println("Ingrese el costo del tratamiento");
        cost = read.nextInt();
        switch (socio) {
            case "A":
                pago = cost * 0.5;
                System.out.println("El importe a pagar por ser de clase A, es: " + pago + " $");
                break;
            case "B":
                pago = cost * 0.65;
                System.out.println("El importe a pagar por ser de clase B, es: " + pago + " $");
                break;
            case "C":
                pago = cost;
                System.out.println("El importe a pagar por ser de clase C, es: " + pago + " $");
                break;

        }

    }

}
