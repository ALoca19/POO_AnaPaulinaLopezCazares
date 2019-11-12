/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Alumno
 */
public class Operadores {
    
    private float num1;
    private float num2;
    private float suma;
    private float multiplicacion;
    private float resta;
    private float division;

    public Operadores(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public float sum()
    {
        return suma=num1+num2;
        
    }
    
    public float multi()
    {
        return multiplicacion=num1*num2;
    }
    
    public float rest()
    {
        return resta=num1-num2;
    }
    
    public void div()
    {
        
        if(num2==0)
        {
            System.out.println("No se puede dividir entre 0");
        }
        else
        {
            System.out.println("La divicion es: "+(division=num1/num2));
        }
    }
}
