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
public class Main {
    public static void main(String[] args) {
        
        //se declaran tres objetos de tipo caja
        Caja c = new Caja();//se inicializa con el constructor por defaullt
        Caja c2 = new Caja(5, 5, 5);//se inicializa sus atributos todos iguales a 5
        Caja c3 = new Caja(5, 5, 5);//se inicializa sus atributos todos iguales a 5
        
        //mostramos los datos de los objetos al inicializar el programa
        System.out.println(c.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        
        //se manda a llamar el metodo volumen para obtener el volumen de cada objeto
        c.volumen();
        c2.volumen();
        c3.volumen();
        
        //con equals comparamos si las cadenas del objeto c3 y c2 son iguales
        if((c3.toString()).equals(c2.toString()))
        {
            //si lo son lo indica
            System.out.println("Las cajas son iguales");
        }
        else
        {
            //si no lo indica
            System.out.println("Las cajas son diferentes");
        }
        
        //mandamos a llamar el metodo equals para comparar los atributos
        //ahora del objeto c y del c2
        //este metodo en cuanto encuentre que algun atributo no es igual manda false
        //e indican que no son iguales, o que si son iguales en caso contrario.
        if(c.equals(c2))
        {
            System.out.println("Las cajas son iguales");
        }
        else
        {
            System.out.println("Las cajas son diferentes");
        }
        
    }
}
