/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Libro {
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int numPag;

    public Libro(String ISBN, String Titulo, String Autor, int numPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPag = numPag;
    }

    public Libro() {
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo =Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor =Autor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", numPag=" + numPag + '}';
    }
    
    
    
}
