/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Alumno
 */
public class Escuela {
    
    private String nombre;
    private String grado;
    private String horario; //matutino vespertino

    public Escuela(String nombre, String grado, String horario) {
        this.nombre = nombre;
        this.grado = grado;
        this.horario = horario;
    }
    
    public Escuela() {
        this.nombre = "Desconocido";
        this.grado = "Desconocido";
        this.horario = "Desconocido";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Escuela{" + "nombre=" + nombre + ", grado=" + grado + ", horario=" + horario + '}';
    }
    
    
}
