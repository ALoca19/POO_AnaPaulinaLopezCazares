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
public class Oso {
    
    private int peso;
    private String raza;
    private String genero;

    public Oso(int peso, String raza, String genero) {
        this.peso = peso;
        this.raza = raza;
        this.genero = genero;
    }
    
    public Oso() {
        this.peso = 0;
        this.raza = "Desconocido";
        this.genero = "Desconocido";
    }
    
    public void infoOso()
    {
        System.out.println("El oso "+raza+" pesa "+peso);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Oso{" + "peso=" + peso + ", raza=" + raza + ", genero=" + genero + '}';
    }
    
    
}
