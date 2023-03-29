/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Nico
 */
public class Curso {
   
private String nombreCurso;
private int horasXDia;
private int DiasxSem;
private String turno;
private double precioXhora;
private String alumnos[]=new String[5];    

    public Curso() {
    }

    public Curso(String nombreCurso, int horasXDia, int DiasxSem, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.horasXDia = horasXDia;
        this.DiasxSem = DiasxSem;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getHorasXDia() {
        return horasXDia;
    }

    public int getDiasxSem() {
        return DiasxSem;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setHorasXDia(int horasXDia) {
        this.horasXDia = horasXDia;
    }

    public void setDiasxSem(int DiasxSem) {
        this.DiasxSem = DiasxSem;
    }
    
    
    
    
    
    
    
    
}
