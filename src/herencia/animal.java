/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian salamanca
 */
public class animal {
    public String alimentan;
    public String numeropatas;
    public animal(){
        
    }
    public animal(String alimentan, String numeropatas){
        this.alimentan=alimentan;
        this.numeropatas=numeropatas;
    }
    public void setAlimentan(String alimentan) {
        this.alimentan = alimentan;
    }

    public String getAlimentan() {
        return alimentan;
    }

    public void setNumeropatas(String numeropatas) {
        this.numeropatas = numeropatas;
    }

    public String getNumeropatas() {
        return numeropatas;
    }
    
     public void ImprimirAlimento(){
         JOptionPane.showMessageDialog(null,"su comida favorita es "+alimentan);
         JOptionPane.showMessageDialog(null,"su numero de patas es "+numeropatas);
     }
}
