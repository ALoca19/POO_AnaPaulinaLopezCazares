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
public class Erizo {
    private String genero;
    private String especie;
    private String nombre;

    public Erizo(String genero, String especie, String nombre) {
        this.genero = genero;
        this.especie = especie;
        this.nombre = nombre;
    }
    
    public Erizo() {
        this.genero = "Desconocido";
        this.especie = "Desconocido";
        this.nombre = "Desconocido";
    }
    
    public Erizo(String especie, String nombre) {
        this.especie = especie;
        this.nombre = nombre;
    } 

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Erizo{" + "genero=" + genero + ", especie=" + especie + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
