package encuentro.pkg3;
import java.util.Scanner;
        
public class Aprendizaje5 {
public static void main (String[] args){ 
  Scanner read=new Scanner(System.in);
int num=0;

  System.out.println("Ingrese un número, el programa le mostrara el doble, triple y la raiz cuadrada del número ingresado");
 num=read.nextInt();
       
    System.out.println("El doble del número ingresado es "+ num*2);
    System.out.println("El triple del número ingresado es "+ num*3);    
    System.out.println("La raíz del número ingresado es "+ Math.sqrt(num));
} 
}
