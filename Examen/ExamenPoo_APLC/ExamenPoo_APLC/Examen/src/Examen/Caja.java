/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author Alumno
 */
public class Caja {
    //Declaramos los atributos de la caja de tipo private para que no se puedan modificar de otro lado
        private int Ancho;
        private int Alto;
        private int Produndidad;
        private int Volumen;

        //Declaramos dos constructores
        
    public Caja(int Ancho, int Alto, int Produndidad) {
//este constructor inicializa los atributos a parametos que el usuario o programador pueden incertar en el metodo main
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.Produndidad = Produndidad;
    }
        
    public Caja() {
        //este constructor inicializa los atributos por defaull
        this.Ancho = 0;
        this.Alto = 0;
        this.Produndidad = 0;
    } 
    
    public void volumen()
    {
        //al mandarse a llamar este metodo en el atributo volumen guarda el volumen del objeto
        //por ser de tipo void no retorna nada
        Volumen=Ancho*Alto*Produndidad;
    }

    @Override
    public String toString() {
        //modificamos el toString para presentar mejor los datos de la caja
        return "La Caja tiene las siguientes caracteristicas: \n" + 
                "Ancho= " + Ancho + "\n"
                + "Alto=" + Alto + "\n"
                + "Produndidad=" + Produndidad + "\n"
                + "Su volumen es: " + Volumen+"\n";
    }

    public int getAncho() {
        return Ancho;
    }

    public int getAlto() {
        return Alto;
    }

    public int getProdundidad() {
        return Produndidad;
    }

    public int getVolumen() {
        return Volumen;
    }

    @Override
    public boolean equals(Object obj) 
    {
        
        Caja caja=(Caja)obj;
        return ((this.Alto==caja.getAlto()) && (this.Ancho==caja.Ancho) &&(this.Produndidad==caja.Produndidad));
        //equal nos permite coparar los atributos de los objetos
        //en main comparamos el objeto c con todos los atributos del objeto c2
        //cada if es de cada atributo del objeto que se tiene
        
    }
    
    
}
