/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author anita
 */
public class Perro extends Canino{
    private String nombre;
    private String color;

    public Perro(String nombre, String color, String raza, double tamaño, String familia, int edad, double peso) {
        super(raza, tamaño, familia, edad, peso);
        this.nombre = nombre;
        this.color = color;
    }

    
    public Perro() {
        this.nombre = "";
        this.color = "";
    }

    public void alimentarse()
    {
        System.out.println("El perro come de su tazon");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "El perro se llama "+nombre+" y es de color "+color;
    }

    
    
}
