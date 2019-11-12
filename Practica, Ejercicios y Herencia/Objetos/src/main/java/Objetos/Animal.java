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
public class Animal {
    
    private String nombreTipo;
    private String enPeligro;
    private String numEjemplares;

    public Animal(String nombreTipo, String enPeligro, String numEjemplares) {
        this.nombreTipo = nombreTipo;
        this.enPeligro = enPeligro;
        this.numEjemplares = numEjemplares;
    }
    
    public Animal() {
        this.nombreTipo = "Desconocido";
        this.enPeligro = "Desconocido";
        this.numEjemplares = "Desconocido";
    }
    
    public void informacion()
    {
        System.out.println("Hay "+numEjemplares+" "+nombreTipo+" en el mundo");
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getEnPeligro() {
        return enPeligro;
    }

    public void setEnPeligro(String enPeligro) {
        this.enPeligro = enPeligro;
    }

    public String getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(String numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombreTipo=" + nombreTipo + ", enPeligro=" + enPeligro + ", numEjemplares=" + numEjemplares + '}';
    }
    
    
    
    
}
