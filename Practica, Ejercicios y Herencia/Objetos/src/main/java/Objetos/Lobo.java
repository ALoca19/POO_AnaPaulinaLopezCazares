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
public class Lobo {
    
    public String enPeligro;
    public String especie;
    public String region;

    public Lobo(String enPeligro, String especie, String region) {
        this.enPeligro = enPeligro;
        this.especie = especie;
        this.region = region;
    }
    
    public Lobo() {
        this.enPeligro = "Desconocido";
        this.especie = "Desconocido";
        this.region = "Desconocido";
    }
    
    public void datosLobos()
    {
        System.out.println("La especie "+especie+" habita en"+region);
    }

    @Override
    public String toString() {
        return "Lobo{" + "enPeligro=" + enPeligro + ", especie=" + especie + ", region=" + region + '}';
    }
    
    
}
