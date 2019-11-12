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
public class Casa {
    private int numPuertas;
    private String direccion;
    private int numero;

    public Casa(int numPuertas, String direccion, int numero) {
        this.numPuertas = numPuertas;
        this.direccion = direccion;
        this.numero = numero;
    }
    
    public Casa() {
        this.numPuertas = 0;
        this.direccion = "Desconocido";
        this.numero = 0;
    }
    
    public Casa(String direccion, int numero)
    {
        this.direccion = direccion;
        this.numero = numero;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Casa{" + "numPuertas=" + numPuertas + ", direccion=" + direccion + ", numero=" + numero + '}';
    }
    
    
}
