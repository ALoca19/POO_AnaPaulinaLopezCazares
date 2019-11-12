/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author anita
 */
public class Main {
    
    public static void main(String[] args) {
        Perro p = new Perro("Kyra", "cafe","Maltez",35.5, "Can", 7, 5);
        Perro p2 = new Perro("Cony", "Blanco","Chihuahua",22.1, "Can", 2, 1);
        System.out.println(p.toString());
        System.out.println(p2.toString());
        
        if((p.getNombre()).equals(p2.getNombre()))
        {
            System.out.println("Los perros tienen el mismo nombre");
        }
        else
        {
            System.out.println("Los perros se llaman diferente");
        }
        
        p.alimentarse();
      
    
}
}
