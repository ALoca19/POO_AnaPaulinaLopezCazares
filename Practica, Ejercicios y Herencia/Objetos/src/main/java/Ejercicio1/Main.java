package Ejercicio1;

import java.util.Scanner;


public class Main {
    
    static int nose=0;
    
    
    
    
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int r, s;
        
        Instancia IDK=new Instancia();
        System.out.println("Generando primera instancia");
        
        do
        {
           
            IDK.instancia();
       
            System.out.println("Generar otra instancia?");
            s=entrada.nextInt();
            
        }while(s!=0);
        
        
        System.out.println(nose);
        
    }
    
}
