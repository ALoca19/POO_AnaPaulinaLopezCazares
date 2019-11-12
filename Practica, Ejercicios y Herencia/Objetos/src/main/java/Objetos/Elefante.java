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
public class Elefante {
    private String especie;
    private int numExistencia;
    private String region;

    public Elefante(String especie, int numExistencia, String region) {
        this.especie = especie;
        this.numExistencia = numExistencia;
        this.region = region;
    }
    
    public Elefante(String especie, String region) {
        this.especie = especie;
        this.region = region;
    }
    
    public Elefante() {
        this.especie = "Desconocida";
        this.region = "Desconocida";
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNumExistencia() {
        return numExistencia;
    }

    public void setNumExistencia(int numExistencia) {
        this.numExistencia = numExistencia;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Elefante{" + "especie=" + especie + ", numExistencia=" + numExistencia + ", region=" + region + '}';
    }
    
    
    
}
