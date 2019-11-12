/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class ListenerVerdes {

   private JFrameCalculadora a;
   public String cantidad;
   public int contador=0;  
   public String seve[];
   public String c1[];
   public String c2[];
   public String cadenaNumeros="";
   public String operacion="nula";
   public double  resultado, num1, num2;
   public int opee;
   private boolean punto=true;
   
   public ListenerVerdes(JFrameCalculadora a){
      this.a=a;
       seve = new String[100];
       c1 = new String[100];
       c2 = new String[100];
       opee=0;
   }
   public void botin1(){
                                                                              /////inicio numeros
      a.getBtnCero().addActionListener((ActionEvent nu0)->{
          a.getDisplay().setText("0");
          cantidad="0";
          seve[contador]=cantidad;
          contador++;
          
          if(cadenaNumeros!="")
          {
            cadenaNumeros+="0";
            a.display.setText(cadenaNumeros);
          }
          
         
          });
      
      a.getBtn1().addActionListener((ActionEvent nu1)->{
          a.getDisplay().setText("1");
          cantidad="1";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="1";
          a.display.setText(cadenaNumeros);
      
      });
      
      a.getBtn2().addActionListener((ActionEvent nu2)->{
          a.getDisplay().setText("2");
          cantidad="2";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="2";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn3().addActionListener((ActionEvent nu3)->{
          a.getDisplay().setText("3");
          cantidad="3";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="3";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn4().addActionListener((ActionEvent nu4)->{
          a.getDisplay().setText("4");
          cantidad="4";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="4";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn5().addActionListener((ActionEvent nu5)->{
          a.getDisplay().setText("5");
          cantidad="5";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="5";
          a.display.setText(cadenaNumeros);
          
      });
      
      a.getBtn6().addActionListener((ActionEvent nu6)->{
          a.getDisplay().setText("6");
          cantidad="6";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="6";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn7().addActionListener((ActionEvent nu7)->{
          a.getDisplay().setText("7");
          cantidad="7";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="7";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn8().addActionListener((ActionEvent nu8)->{
          a.getDisplay().setText("8");
          cantidad="8";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="8";
          a.display.setText(cadenaNumeros);
      });
      
      a.getBtn9().addActionListener((ActionEvent nu9)->{
          a.getDisplay().setText("9");
          cantidad="9";
          seve[contador]=cantidad;
          contador++;
          cadenaNumeros+="9";
          a.display.setText(cadenaNumeros);
      });
      
                                                                               ///fin mumeros
      
      a.getBtnMM().addActionListener((ActionEvent numm)->{
          a.getDisplay().setText("-");
         cantidad="-";
          seve[contador]=cantidad;
          contador++;
          
          //////////////////////////////
          num2=Double.parseDouble(cadenaNumeros);
          num2=num2*-1;
          cadenaNumeros= new Double(num2).toString();
          a.getDisplay().setText(cadenaNumeros);
          //a.display.setText(cadenaNumeros);
          
      });
      a.getBtnPunto().addActionListener((ActionEvent nop)->{
          
          if(punto==true)
          {
                cantidad=".";
                if(cadenaNumeros=="")
                {

                 cadenaNumeros+="0.";

                }
                else
                {
                    cadenaNumeros+=".";
                }

                seve[contador]=cantidad;
                contador++;
                punto=false;
          }
          
          
          
      });
      
      
      
      
                                                                               /// inicio opereaciones
      
        a.getBtnMulti().addActionListener((ActionEvent nu2) -> {
            a.getDisplay().setText("");// *
            for (int i = 0; i <= contador; i++) {
                c1[i]=seve[i];
            }
            num1=Double.parseDouble(cadenaNumeros);
            cadenaNumeros="";
            contador=0;
            opee=1;
            punto=true;
      });
        a.getBtnPlus().addActionListener((ActionEvent nu3)->{
         //numero1=Double.parseDouble(cadenaNumeros);
        a.getDisplay().setText("");// +
        for (int i = 0; i <= contador; i++) {
              c1[i]=seve[i];
          }
        num1=Double.parseDouble(cadenaNumeros);
        cadenaNumeros="";    
        contador=0;
        opee=2;
        punto=true;
      });
        a.getBtnDiv().addActionListener((ActionEvent nu4)->{
        a.getDisplay().setText(""); // /
        for (int i = 0; i <= contador; i++) {
              c1[i]=seve[i];
          }
        num1=Double.parseDouble(cadenaNumeros);
        cadenaNumeros="";
            contador=0;
        opee=3;
        punto=true;
      });
        a.getBtnMenos().addActionListener((ActionEvent nu4)->{
        a.getDisplay().setText("");// -
        for (int i = 0; i <= contador; i++) {
              c1[i]=seve[i];
          }
        num1=Double.parseDouble(cadenaNumeros);
        cadenaNumeros="";
            contador=0;
        opee=4;
        punto=true;
      });
        a.getBtnIgual().addActionListener((ActionEvent nu1)->{
        a.getDisplay().setText("");// =
           num2=Double.parseDouble(cadenaNumeros);
           cadenaNumeros="";
            contador=0;
            if (opee==1) {/// *
                resultado = num1 * num2;
                
                
            }
            if (opee==2){/// + 
                resultado =num1 + num2;
            
            }
            if (opee==3){/// / 
               resultado = num1 / num2;
               
            
            }
            if (opee==4){/// - 
               resultado = num1 - num2;
               
            
            }
            cadenaNumeros= new Double(resultado).toString();
            a.getDisplay().setText(cadenaNumeros);
                                                                                 //// eliminadores
         });
        a.getBtnC().addActionListener((ActionEvent nu0)->{
          a.getDisplay().setText("");
          cadenaNumeros="";
          
          
         
          });
        a.getBtnCE().addActionListener((ActionEvent nu0)->{
         
            if(cadenaNumeros!="")
            {
             contador=contador-1;
            cadenaNumeros=cadenaNumeros.substring(0, cadenaNumeros.length()-1);
            a.getDisplay().setText(cadenaNumeros);  
            }
           
         
          });
      
                                                                                ///fin operaciones
      ///OPERADORES
    //      a.getBtnPlus().addActionListener((ActionEvent nu3)->{ //SUMA
    //         numero1=Double.parseDouble(cadenaNumeros);
    //         
    //         cadenaNumeros="";
    //         operacion="suma";
    //         
    //      });
      
//      a.getBtnIgual().addActionListener((ActionEvent nu1)->{ //IGUAL
//        
//          double numero2;
//        
//        if(operacion.equals("nula"))
//        {
//            a.display.setText(cadenaNumeros);
//        }
//        else if(operacion.equals("sumar"))
//        {
//            numero2=Double.parseDouble(cadenaNumeros);
//            resultado=numero1+numero2;
//             a.display.setText("No posh no");
//            //a.display.setText(String.valueOf(resultado));
//            
//        }
//      });
      
           
      
   }
   
   
}
