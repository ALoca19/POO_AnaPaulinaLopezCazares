/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); 
        
        float numero, numero2;
        
        System.out.print("Insertar numero 1: ");
        numero=entrada.nextFloat();
        
        System.out.print("Insertar numero 2: ");
        numero2=entrada.nextFloat();
        
        Operadores O=new Operadores(numero, numero2);
        
        System.out.println("La suma es: "+O.sum());
        System.out.println("La resta es: "+O.rest());
        System.out.println("La multiplicacion es: "+O.multi());
        O.div();
                
    }
}
