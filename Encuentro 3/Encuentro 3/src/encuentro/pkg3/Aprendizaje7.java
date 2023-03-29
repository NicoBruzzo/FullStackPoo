/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg3;

import java.util.Scanner;

/**
 *
 * @author DanielPalma
 */
public class Aprendizaje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = read.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else  {
            System.out.println("Incorrecto");
        }
        
        
    }
    
}
