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
public class Rectangulo {
    private int lado1;
    private int lado2;
    private int area;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = lado1*lado2;
    }
    
    public Rectangulo() {
        this.lado1 = 0;
        this.lado2 = 0;
        this.area = 0;
    }
    
    public Rectangulo(int lado1, int lado2, int area) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", area=" + area + '}';
    }
    
    
}
