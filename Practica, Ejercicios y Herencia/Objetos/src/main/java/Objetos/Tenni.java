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
public class Tenni {
    private int precio;
    private String color;
    private String marca;

    public Tenni(int precio, String color, String marca) {
        this.precio = precio;
        this.color = color;
        this.marca = marca;
    }
    
    public Tenni() {
        this.precio = 0;
        this.color = "Desconocido";
        this.marca = "Desconocido";
    }
    
    public Tenni(int precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Tenni{" + "precio=" + precio + ", color=" + color + ", marca=" + marca + '}';
    }
    
    
}
