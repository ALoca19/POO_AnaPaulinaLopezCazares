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
public class Arbol {
    
    private String nombreArbol;
    private String fruto;
    private String region;

    public Arbol(String nombreArbol, String fruto, String region) {
        this.nombreArbol = nombreArbol;
        this.fruto = fruto;
        this.region = region;
    }
    
    public Arbol() {
        this.nombreArbol = "Desconocido";
        this.fruto = "Desconocido";
        this.region = "Desconocido";
    }
    
    public void informacionArbol()
    {
        System.out.println("El "+nombreArbol+" crece en "+region);
    }

    public String getNombreArbol() {
        return nombreArbol;
    }

    public void setNombreArbol(String nombreArbol) {
        this.nombreArbol = nombreArbol;
    }

    public String getFruto() {
        return fruto;
    }

    public void setFruto(String fruto) {
        this.fruto = fruto;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Arbol{" + "nombreArbol=" + nombreArbol + ", fruto=" + fruto + ", region=" + region + '}';
    }
    
    
}
