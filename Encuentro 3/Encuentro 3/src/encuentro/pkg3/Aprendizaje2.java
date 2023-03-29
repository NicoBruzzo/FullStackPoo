
package encuentro.pkg3;
import java.util.Scanner;
/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
public class Aprendizaje2 {
    public static void main (String [] args){
        
    Scanner read= new Scanner(System.in);
    String nombre = "";
    System.out.println("Ingrese su nombre");
    nombre=read.nextLine();
    System.out.println("Tu nombre es "+ nombre);
    
}   
}
