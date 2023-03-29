/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg3;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class EjerciciosEx3 {
   public static void main(String[] args) {   

    {
        Scanner scane= new Scanner(System.in);


        String scan = scane.nextLine();
        
        if(scan.equals("a")|| scan.equals("e")|| scan.equals("i")|| scan.equals("o")|| scan.equals("u")){
            System.out.println("es vocal");
        
        }else System.out.println("no es vocal");  
}
}
}