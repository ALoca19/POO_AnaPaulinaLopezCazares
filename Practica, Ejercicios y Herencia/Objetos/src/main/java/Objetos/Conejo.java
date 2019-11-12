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
public class Conejo {
    private String genero;
    private String nombre;
    private int tamaño;

    public Conejo(String genero, String nombre, int tamaño) {
        this.genero = genero;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
    
    public Conejo() {
        this.genero = "Desconocido";
        this.nombre = "Desconocido";
        this.tamaño = 0;
    }
    
    public Conejo(String genero, String nombre) {
        this.genero = "Desconocido";
        this.nombre = "Desconocido";
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Conejo{" + "genero=" + genero + ", nombre=" + nombre + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}
