package encuentro.pkg3;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. 
 */
public class Aprendizaje3 {
public static void main (String[] args){
 Scanner leer= new Scanner(System.in);
 String frase;
 
 System.out.println("Ingrese una frase el sistema se la devolverá");
    frase=leer.nextLine();
     System.out.println(toUpperCase(frase));
       System.out.println(toLowerCase(frase));
    
}   
}
