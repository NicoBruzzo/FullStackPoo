/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
 */
package encuentro.pkg3;
import java.util.Scanner;

public class Ejercicio11 {
    
public static void main (String[] args) {  
 
 funct();
   
   
}    



public static void funct(){  
  Scanner scan = new Scanner(System.in);
  String st=scan.next();
  String res= "";   
  boolean pointAppa= true;
  for (int i=0; i< st.length()&& pointAppa;i++){
     String a= String.valueOf(st.charAt(i));
     switch(a)
{
         case "a":
             res+= "@";
             continue;
         case "e":
             res+= "#";
             continue;
         case "i":
             res+= "$";
             continue;
         case "o":
             res+="%";
             continue;
         case "u":
             res += "*";
             continue;
         case ".":
             System.out.println("Punto encontrado");
             pointAppa= false;
             break;
         default:
             res+= st.charAt(i);
             
     }          
  }
    System.out.println(res);
  } 
}