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
public class Chinchilla {
    private String genero;
    private String nombre;
    private int cantidad;

    public Chinchilla(String genero, String nombre, int cantidad) {
        this.genero = genero;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public Chinchilla() {
        this.genero = "Desconocido";
        this.nombre = "Desconocido";
        this.cantidad = 0;
    }
    
    public Chinchilla(String genero, String nombre) {
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Chinchilla{" + "genero=" + genero + ", nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
    
}
