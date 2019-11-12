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
public abstract class Canino extends Animal{
    private String raza;

    public abstract void alimentarse();
    
    public Canino(String raza, double tamaño, String familia, int edad, double peso) {
        super(tamaño, familia, edad, peso);
        this.raza = raza;
    }

    public Canino() {
        this.raza = "";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
