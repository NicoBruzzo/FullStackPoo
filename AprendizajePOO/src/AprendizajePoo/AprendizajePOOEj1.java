/**Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
package AprendizajePoo;

import Entidad.Libro;
import ServiceLibro.Servicio;

public class AprendizajePOOEj1 {


    public static void main(String[] args) {
        
    Servicio libser= new Servicio();    
    Libro MiPrimerLibro= libser.crearLibro();
    
        
        System.out.println(MiPrimerLibro.toString());   
        
        
        
        
        
    }
    
}
