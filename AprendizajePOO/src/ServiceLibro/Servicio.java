package ServiceLibro;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class Servicio {
    public Libro crearLibro(){
    
  Scanner read=new Scanner(System.in); 
  Libro miLibro= new Libro();
  
        System.out.println("Ingrese el ISBN del libro que ingresa");
       miLibro.setISBN(read.next());
        System.out.println("Ingrese el título del libro");
        miLibro.setTitulo(read.next());
        System.out.println("Ingrese el autor del libro");
        miLibro.setAutor(read.next());
        System.out.println("Ingrese el número de la página que busca");
        miLibro.setNumPag(read.nextInt());
        
        
  return miLibro;         
}
}