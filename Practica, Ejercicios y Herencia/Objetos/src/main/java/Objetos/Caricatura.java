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
public class Caricatura {
    private String nombreCaricatura;
    private int numTemporadas;
    private int añoEstreno;

    public Caricatura(String nombreCaricatura, int numTemporadas, int añoEstreno) {
        this.nombreCaricatura = nombreCaricatura;
        this.numTemporadas = numTemporadas;
        this.añoEstreno = añoEstreno;
    }
    
    public Caricatura() {
        this.nombreCaricatura = "Desconocido";
        this.numTemporadas = 0;
        this.añoEstreno = 0;
    }
    
    public void informacionCaricatura()
    {
        System.out.println("La caricatura de "+nombreCaricatura+ "se creo en "+añoEstreno);
    }

    public String getNombreCaricatura() {
        return nombreCaricatura;
    }

    public void setNombreCaricatura(String nombreCaricatura) {
        this.nombreCaricatura = nombreCaricatura;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    @Override
    public String toString() {
        return "Caricatura{" + "nombreCaricatura=" + nombreCaricatura + ", numTemporadas=" + numTemporadas + ", a\u00f1oEstreno=" + añoEstreno + '}';
    }
    
    
    
}
