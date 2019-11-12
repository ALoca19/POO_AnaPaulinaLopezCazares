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
public class Bolso {
    
    private String marca;
    private int precio;
    private String material;

    public Bolso(String marca, int precio, String material) {
        this.marca = marca;
        this.precio = precio;
        this.material = material;
    }
    
    public Bolso() {
        this.marca = "Desconocido";
        this.precio = 0;
        this.material = "Desconocido";
    }
    
    public void informacionBolso()
    {
        System.out.println("El bolso de marca "+marca+" cuesta "+precio);
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bolso{" + "marca=" + marca + ", precio=" + precio + ", material=" + material + '}';
    }
    
    
}
