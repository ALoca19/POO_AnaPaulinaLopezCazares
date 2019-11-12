/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class CuadroDialogo extends JFrame{
    public CuadroDialogo() {
        inicializarBotones();
        
    }

    private void inicializarBotones() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(4,11));
        JPanel flechas = new JPanel(new GridLayout(2,3));
        // creamos los botones
        
        Dimension dim = new Dimension(30,30);
        JButtonC btn1 = new JButtonC("1", dim, Color.magenta);
        JButtonC btn2 = new JButtonC("2", dim, Color.magenta);
        JButtonC btn3 = new JButtonC("3", dim, Color.magenta);
        JButtonC btn4 = new JButtonC("4", dim, Color.magenta);
        JButtonC btn5 = new JButtonC("5", dim, Color.magenta);
        JButtonC btn6 = new JButtonC("6", dim, Color.magenta);
        JButtonC btn7 = new JButtonC("7", dim, Color.magenta);
        JButtonC btn8 = new JButtonC("8", dim, Color.magenta);
        JButtonC btn9 = new JButtonC("9", dim, Color.magenta);
        JButtonC btn0 = new JButtonC("0", dim, Color.magenta);
        JButtonC btnNada = new JButtonC("-", dim, Color.magenta);
        
        JButtonC btnQ = new JButtonC("Q", dim, Color.magenta);
        JButtonC btnW = new JButtonC("W", dim, Color.magenta);
        JButtonC btnE = new JButtonC("E", dim, Color.magenta);
        JButtonC btnR = new JButtonC("R", dim, Color.magenta);
        JButtonC btnT = new JButtonC("T", dim, Color.magenta);
        JButtonC btnY = new JButtonC("Y", dim, Color.magenta);
        JButtonC btnU = new JButtonC("U", dim, Color.magenta);
        JButtonC btnI = new JButtonC("I", dim, Color.magenta);
        JButtonC btnO = new JButtonC("O", dim, Color.magenta);
        JButtonC btnP = new JButtonC("P", dim, Color.magenta);
        JButtonC btnA = new JButtonC("A", dim, Color.magenta);
        JButtonC btnS = new JButtonC("S", dim, Color.magenta);
        JButtonC btnD = new JButtonC("D", dim, Color.magenta);
        JButtonC btnF = new JButtonC("F", dim, Color.magenta);
        JButtonC btnG = new JButtonC("G", dim, Color.magenta);
        JButtonC btnH = new JButtonC("H", dim, Color.magenta);
        JButtonC btnJ = new JButtonC("J", dim, Color.magenta);
        JButtonC btnK = new JButtonC("K", dim, Color.magenta);
        JButtonC btnL = new JButtonC("L", dim, Color.magenta);
        JButtonC btnÑ = new JButtonC("Ñ", dim, Color.magenta);
        JButtonC btnZ = new JButtonC("Z", dim, Color.magenta);
        JButtonC btnX = new JButtonC("X", dim, Color.magenta);
        JButtonC btnC = new JButtonC("C", dim, Color.magenta);
        JButtonC btnV = new JButtonC("V", dim, Color.magenta);
        JButtonC btnB = new JButtonC("B", dim, Color.magenta);
        JButtonC btnN = new JButtonC("N", dim, Color.magenta);
        JButtonC btnM = new JButtonC("M", dim, Color.magenta);
        JButtonC btnArriba = new JButtonC("Arr", dim, Color.magenta);
        JButtonC btnAbajo = new JButtonC("ABa", dim, Color.magenta);
        JButtonC btnIzquierda = new JButtonC("Izq", dim, Color.magenta);
        JButtonC btnDerecha = new JButtonC("Dere", dim, Color.magenta);
        
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btn0);
        panelCentral.add(btnNada);
        
        
      panelCentral.add(btnQ); 
      
       panelCentral.add(btnW); 
       panelCentral.add(btnE); 
       panelCentral.add(btnR); 
       panelCentral.add(btnT); 
       panelCentral.add(btnY); 
       panelCentral.add(btnU); 
       panelCentral.add(btnI); 
       panelCentral.add(btnO); 
       panelCentral.add(btnP); 
       panelCentral.add(btnNada);
       
       panelCentral.add(btnA); 
       panelCentral.add(btnS); 
       panelCentral.add(btnD);
       panelCentral.add(btnF);
       panelCentral.add(btnG); 
       panelCentral.add(btnH); 
       panelCentral.add(btnJ); 
       panelCentral.add(btnK);
       panelCentral.add(btnL); 
       panelCentral.add(btnÑ);
       panelCentral.add(btnNada);
       
       panelCentral.add(btnZ); 
       panelCentral.add(btnX);
       panelCentral.add(btnC);
       panelCentral.add(btnV); 
       panelCentral.add(btnB);
       panelCentral.add(btnN); 
       panelCentral.add(btnM); 
       panelCentral.add(btnIzquierda); 
       panelCentral.add(btnArriba);
        panelCentral.add(btnAbajo);
       panelCentral.add(btnDerecha);
       
       
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        setLocationRelativeTo(null);
                setMinimumSize(new Dimension(1500,450));
        Escuchador orejon = new Escuchador(0);
        EscuchadorLetras orejon2 = new EscuchadorLetras();
        
        btn1.addActionListener(orejon);
        btn2.addActionListener(orejon);
        btn3.addActionListener(orejon);
        btn4.addActionListener(orejon);
        btn5.addActionListener(orejon);
        btn6.addActionListener(orejon);
        btn7.addActionListener(orejon);
        btn8.addActionListener(orejon);
        btn9.addActionListener(orejon);
        btn0.addActionListener(orejon);
        
        btnQ.addKeyListener(orejon2);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
