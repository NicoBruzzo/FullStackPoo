/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package encuentro.pkg3;

public class EjerciciosEx9 {
   public static void main(String[] args) {     
       int num1= 50,num2=12,cont=0;
while(num1>num2) {
 num1=num1-num2;
 cont++;
} 
       System.out.println("El residuo de la división es: "+ num1+ ". Y el cociente es: "+ cont);
   }
}
   
