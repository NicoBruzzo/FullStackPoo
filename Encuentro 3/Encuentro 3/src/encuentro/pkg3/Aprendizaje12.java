/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas.
 */
package encuentro.pkg3;
import java.util.Scanner;

public class Aprendizaje12 {
public static void main (String [] args){
Scanner read=new Scanner(System.in);
String frase, FDE="&&&&&";
int correctas=0,incorrectas=-1;

 do{
     System.out.println("Ingrese una frase de 5 caracteres que empiece con X y termine con O");
     frase=read.next();
     if (frase.length()==5 && frase.substring(0,1).equalsIgnoreCase("X") && frase.substring(4,5).equalsIgnoreCase("O") ){
      correctas++;
              }else {
         incorrectas++;
     }
             
 }while (!FDE.equals(frase));
    System.out.println("La cantidad de frases correctas fue: "+ correctas);
    System.out.println("La cantidad de frases incorrectas fue: "+ incorrectas);
}
}
