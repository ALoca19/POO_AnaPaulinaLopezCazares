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
public class Gato {
    private String especie;
    private int edad;
    private String color;

    public Gato(String especie, int edad, String color) {
        this.especie = especie;
        this.edad = edad;
        this.color = color;
    }
    
    public Gato() {
        this.especie = "Desconocida";
        this.edad = 0;
        this.color = "Desconocida";
    }
    
    public void datos()
    {
        System.out.println("El gato "+especie+" es color "+color);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato{" + "especie=" + especie + ", edad=" + edad + ", color=" + color + '}';
    }
    
    
}
