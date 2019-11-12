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
public class Carro {
    private String marca;
    private int precio;
    private int numPuertas;

    public Carro(String marca, int precio, int numPuertas) {
        this.marca = marca;
        this.precio = precio;
        this.numPuertas = numPuertas;
    }
    
    public Carro() {
        this.marca = "Toyota";
        this.precio = 150000;
        this.numPuertas = 4;
    }
    
    public void informacionCarro() {
        System.out.println("El carro cuesta "+precio);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", precio=" + precio + ", numPuertas=" + numPuertas + '}';
    }
    
    
    
}
