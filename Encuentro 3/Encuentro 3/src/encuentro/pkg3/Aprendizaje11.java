
package encuentro.pkg3;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeRegExp.ignoreCase;

/**
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */

public class Aprendizaje11 {
public static void main (String [] args) {
  Scanner read= new Scanner (System.in);
  int num1, num2, resultado, opt; 
    String salir;
   do {
         System.out.println("Ingrese dos números enteros");
    num1=read.nextInt();
    num2=read.nextInt(); 
       
      salir = " ";
       System.out.println("Ingrese una opción");
       System.out.println("|1- Suma | 2- Resta | 3- Multiplicación | 4- División | 5 salir");
       opt=read.nextInt();
    switch(opt){
        case 1: 
            resultado=num1+num2;
            System.out.println("El resultado es "+ resultado);
            break;
        case 2:
            resultado=num1-num2;
            System.out.println("El resultado es "+ resultado);
            break;
        case 3: 
            resultado=num1*num2;
            System.out.println("El resultado es "+ resultado);
            break;
        case 4:
            resultado=num1/num2;
            System.out.println("El resultado es "+ resultado);
            break;
        case 5:
            System.out.println("Está seguro que desea salir S/N?");
            salir=read.next();
            break;    
            }
   }while(!salir.equalsIgnoreCase("S"));
              
}    
}
