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
public class Libro {
    private int numeroHojas;
    private String autor;
    private String titulo;

    public Libro(int numeroHojas, String autor, String titulo) {
        this.numeroHojas = numeroHojas;
        this.autor = autor;
        this.titulo = titulo;
    }
    
    public Libro() {
        this.numeroHojas = 0;
        this.autor = "Desconocido";
        this.titulo = "Desconocido";
    }
    
    public Libro(String autor, String titulo) {
       
        this.autor = autor;
        this.titulo = titulo;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "numeroHojas=" + numeroHojas + ", autor=" + autor + ", titulo=" + titulo + '}';
    }
    
    
    
    
}
