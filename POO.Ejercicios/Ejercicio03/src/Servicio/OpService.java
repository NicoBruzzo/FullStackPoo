
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;


public class OpService {
  public Operacion crearOperacion()  {
     Scanner read=new Scanner(System.in);
      Operacion Op1= new Operacion ();
      System.out.println("Ingrese un número");
      Op1.setNum1(read.nextDouble());
      System.out.println("Ingrese el segundo número");
      Op1.setNum2(read.nextDouble());
    
    
   return Op1;  
}    
  
  
  
}
