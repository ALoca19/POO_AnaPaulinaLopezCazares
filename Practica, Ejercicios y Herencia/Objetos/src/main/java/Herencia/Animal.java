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
public abstract class Animal {
    
    private double tamaño; //acuatico, volador
    private String familia;
    private int edad;
    private double peso;
    
    public abstract void alimentarse();
    
    public Animal(double tamaño, String familia, int edad, double peso) {
        this.tamaño = tamaño;
        this.familia = familia;
        this.edad = edad;
        this.peso = peso;
    }
    
    public Animal() {
        this.tamaño = 0;
        this.familia = "";
        this.edad = 0;
        this.peso = 0;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    
}
