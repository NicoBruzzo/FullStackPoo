/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 */
package encuentro.pkg3;
import java.util.Scanner;

public class Aprendizaje9 {
public static void main (String [] args) {
Scanner leer= new Scanner (System.in);

    System.out.println("Ingrese una palabra o frase, el programa revisará si comienza con la letra A");    
 String frase=leer.nextLine();
 

 if ((frase.substring(0,1).equalsIgnoreCase("A"))){
     System.out.println("Correcto!");   
 }else{
     System.out.println("Incorrecto!");   
 }
}
}
