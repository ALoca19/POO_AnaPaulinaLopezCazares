/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author anita
 */
public class Alumno {
    private String nombre;
    private String grupo;
    private int semestre;

    public Alumno(String nombre, String grupo, int semestre) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.semestre = semestre;
    }
    
    public Alumno() {
        this.nombre = "Desconocido";
        this.grupo = "Desconocido";
        this.semestre = 0;
    }
    
    public void presentacion()
    {
        System.out.println("Mi nombre es "+nombre+" voy en "+semestre+" en el grupo "+grupo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", grupo=" + grupo + ", semestre=" + semestre + '}';
    }
    
    
    
            
}
