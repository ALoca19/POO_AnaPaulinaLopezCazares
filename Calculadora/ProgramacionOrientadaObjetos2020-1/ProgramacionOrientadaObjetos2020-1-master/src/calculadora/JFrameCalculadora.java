/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class JFrameCalculadora extends JFrame {
    JButtonC btnC, btnCE, btnMM, btnMulti, btn7, btn8, btn9, btnDiv, btn4, btn5;
    JButtonC btn6, btnMenos, btn1, btn2, btn3, btnPlus, btnCero, btnPunto, btnIgual, btnAcerca;
    JTextField display;
    ListenerVerdes nu;
    Operaciones_cal si;
    int num=100;
    int cont;
   
   
    public JFrameCalculadora() {
        inicializarComponentes();
        
        
    }

    private void inicializarComponentes() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(5,4));
        // creamos los botones
        Dimension dim = new Dimension(30,30);
         btnC = new JButtonC("C", dim, Color.yellow);
         btnCE = new JButtonC("CE", dim, Color.black);
         btnMM = new JButtonC("+/-", dim, Color.white);
         btnMulti = new JButtonC("X", dim, Color.GRAY);
         btn7 = new JButtonC("7", dim, Color.white);
         btn8 = new JButtonC("8", dim,Color.white);
         btn9 = new JButtonC("9", dim, Color.white);
         btnDiv = new JButtonC("/", dim, Color.GRAY);
         btn4 = new JButtonC("4", dim, Color.white);
         btn5 = new JButtonC("5", dim, Color.white);
         btn6 = new JButtonC("6", dim, Color.white);
         btnMenos = new JButtonC("-", dim, Color.GRAY);
         btn1 = new JButtonC("1", dim, Color.white);
         btn2 = new JButtonC("2", dim, Color.white);
         btn3 = new JButtonC("3", dim, Color.white);
         btnPlus = new JButtonC("+", dim, Color.GRAY);
         btnCero = new JButtonC("0", dim, Color.white);
         btnPunto = new JButtonC(".", dim, Color.white);
         btnIgual = new JButtonC("=", dim, Color.GRAY);
         btnAcerca = new JButtonC("?", dim, Color.black);
       
       
        
        
        panelCentral.add(btnC);
        panelCentral.add(btnCE);
        panelCentral.add(btnMM);
        panelCentral.add(btnMulti);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btnDiv);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btnMenos);
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btnPlus);
        panelCentral.add(btnCero);
        panelCentral.add(btnPunto);
        panelCentral.add(btnIgual);
        panelCentral.add(btnAcerca);
        
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        
        display = new JTextField();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(),auxF.getStyle(),50);
        display.setFont(nueva);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display,BorderLayout.NORTH);
        
         nu = new ListenerVerdes(this);
         nu.botin1();
      //nu.mostrar();
//         si = new Operaciones_cal(this);
//         si.Botin2();
         

         setLocationRelativeTo(null);
        setMinimumSize(new Dimension(500,500));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public JButtonC getBtnC() {
        return btnC;
    }

    public JButtonC getBtnCE() {
        return btnCE;
    }

    public JButtonC getBtnMM() {
        return btnMM;
    }

    public JButtonC getBtnMulti() {
        return btnMulti;
    }

    public JButtonC getBtn7() {
        return btn7;
    }

    public JButtonC getBtn8() {
        return btn8;
    }

    public JButtonC getBtn9() {
        return btn9;
    }

    public JButtonC getBtnDiv() {
        return btnDiv;
    }

    public JButtonC getBtn4() {
        return btn4;
    }

    public JButtonC getBtn5() {
        return btn5;
    }

    public JButtonC getBtn6() {
        return btn6;
    }

    public JButtonC getBtnMenos() {
        return btnMenos;
    }

    public JButtonC getBtn1() {
        return btn1;
    }

    public JButtonC getBtn2() {
        return btn2;
    }

    public JButtonC getBtn3() {
        return btn3;
    }

    public JButtonC getBtnPlus() {
        return btnPlus;
    }

    public JButtonC getBtnCero() {
        return btnCero;
    }

    public JButtonC getBtnPunto() {
        return btnPunto;
    }

    public JButtonC getBtnIgual() {
        return btnIgual;
    }

    public JButtonC getBtnAcerca() {
        return btnAcerca;
    }

    public void setBtnC(JButtonC btnC) {
        this.btnC = btnC;
    }

    public void setBtnCE(JButtonC btnCE) {
        this.btnCE = btnCE;
    }

    public void setBtnMM(JButtonC btnMM) {
        this.btnMM = btnMM;
    }

    public void setBtnMulti(JButtonC btnMulti) {
        this.btnMulti = btnMulti;
    }

    public void setBtn7(JButtonC btn7) {
        this.btn7 = btn7;
    }

    public void setBtn8(JButtonC btn8) {
        this.btn8 = btn8;
    }

    public void setBtn9(JButtonC btn9) {
        this.btn9 = btn9;
    }

    public void setBtnDiv(JButtonC btnDiv) {
        this.btnDiv = btnDiv;
    }

    public void setBtn4(JButtonC btn4) {
        this.btn4 = btn4;
    }

    public void setBtn5(JButtonC btn5) {
        this.btn5 = btn5;
    }

    public void setBtn6(JButtonC btn6) {
        this.btn6 = btn6;
    }

    public void setBtnMenos(JButtonC btnMenos) {
        this.btnMenos = btnMenos;
    }

    public void setBtn1(JButtonC btn1) {
        this.btn1 = btn1;
    }

    public void setBtn2(JButtonC btn2) {
        this.btn2 = btn2;
    }

    public void setBtn3(JButtonC btn3) {
        this.btn3 = btn3;
    }

    public void setBtnPlus(JButtonC btnPlus) {
        this.btnPlus = btnPlus;
    }

    public void setBtnCero(JButtonC btnCero) {
        this.btnCero = btnCero;
    }

    public void setBtnPunto(JButtonC btnPunto) {
        this.btnPunto = btnPunto;
    }

    public void setBtnIgual(JButtonC btnIgual) {
        this.btnIgual = btnIgual;
    }

    public void setBtnAcerca(JButtonC btnAcerca) {
        this.btnAcerca = btnAcerca;
    }

    public JTextField getDisplay() {
        return display;
    }

    public void setDisplay(JTextField display) {
        this.display = display;
    }

    
    
}
