package encuentro.pkg3;
import java.util.Scanner;

public class Ejercicio12 {
    

    
public static void main(String[] args) {

EsMultiplo();    
}



public static void EsMultiplo(){
Scanner read = new Scanner(System.in);
int num1,num2;
System.out.println ("Digite dos números , el programa verificará que el primero sea multiplo del segundo");
num1= read.nextInt();
num2=read.nextInt();
if (num1%num2==0){
  System.out.println("El número"+ num1+ " SI es multiplo de " + num2);
  }
  else
    System.out.println("El número"+ num1 +" NO es multiplo de " + num2);
}
    
}
