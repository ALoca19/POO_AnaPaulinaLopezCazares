/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_Gato;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
    
    
    Tablero p=new Tablero();
    int G;
    int n, n2;
    int k=0;
    int i=0;

    do
    {
      p.mostrarTablero();
      
    if(i%2==0)
    {
        System.out.println("Turno del: JUGADOR X\n");
        do{
        System.out.print("Numero de renglon: ");
        n=entrada.nextInt();
        System.out.print("Numero de columna: ");
        n2=entrada.nextInt();
        }while((n<1 || n>3) || (n2<1 || n2>3));
        k=p.movimientoPrimerJ(n, n2, k);
    }
    else
    {
        System.out.println("Turno del: JUGADOR O\n");
        do{
        System.out.print("Numero de renglon: ");
        n=entrada.nextInt();
        System.out.print("Numero de columna: ");
        n2=entrada.nextInt();
        }while((n<1 || n>3) || (n2<1 || n2>3));
        k=p.movimientoSegundoJ(n, n2, k);
    }
    i++;
    G=p.buscarGanador();
    }while (i<9 && G==2);
    
    if (G==0)
     {
         System.out.println("Felicidades. Ganaste X!!\n");
       
     }
     else if (G==1){
        System.out.println("Felicidades. Ganaste O!!\n");
        
     }
    else
    {
        System.out.println("Han empatado :/\n");
     }

    }
}
