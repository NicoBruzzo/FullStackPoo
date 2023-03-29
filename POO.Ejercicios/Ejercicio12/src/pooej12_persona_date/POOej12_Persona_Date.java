/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12_persona_date;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author mcnar
 */
public class POOej12_Persona_Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.iniciarPersona();
        int opc;
        boolean sal = false;
        do {
            System.out.println("Elija una opcion");
            System.out.println("1-Calcular Edad");
            System.out.println("2-Mayor Que");
            System.out.println("3-Mostrar Datos");
            System.out.println("4-Salir");
            opc=leer.nextInt();
            switch (opc){
                case 1:
                    ps.calcularEdad(p1);
                    continue;
                case 2:
                    ps.menorQue(p1);
                    continue;
                case 3:
                    ps.mostrarPersona(p1);
                    continue;
                case 4:
                    sal=true;
            }
        } while (sal != true);

    }

}
