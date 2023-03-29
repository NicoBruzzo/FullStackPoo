/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
package encuentro.pkg3;
import java.util.Scanner;

public class Aprendizaje13 {
public static void main (String [] args){
Scanner read= new Scanner(System.in);
int side;

    System.out.println("ingrese la altura del cuadrado");
    side=read.nextInt();
    
for(int i=0; i<side;i++){
    for(int j=0; j<side;j++){
if (i==0 || i==side-1 || j==0 || j==side-1){
            System.out.print("*"); 
}else{
      System.out.print(" ");  
        }  
}
    System.out.println("");  
}
}
}