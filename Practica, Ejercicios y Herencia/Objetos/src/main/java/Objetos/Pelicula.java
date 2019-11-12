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
public class Pelicula {
    private double duracion;
    private String titulo;
    private String genero;

    public Pelicula(double duracion, String titulo, String genero) {
        this.duracion = duracion;
        this.titulo = titulo;
        this.genero = genero;
    }
    
    public Pelicula() {
        this.duracion = 0.0;
        this.titulo = "Desconocido";
        this.genero = "Desconocido";
    }
    
    public void inforPeli()
    {
        System.out.println("La pelicula "+titulo+" dura "+duracion);
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "duracion=" + duracion + ", titulo=" + titulo + ", genero=" + genero + '}';
    }
    
    
    
    
}
