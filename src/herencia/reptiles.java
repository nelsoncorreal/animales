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
public class reptiles extends animal{
    String escamas;
    String pupila;
     public reptiles(String alimentan, String numeropatas){
        super(alimentan, numeropatas);
    }

    reptiles() {
       
    }

    public void setPupila(String pupila) {
        this.pupila = pupila;
    }

    public String getPupila() {
        return pupila;
    }

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }

    public String getEscamas() {
        return escamas;
    }
      public void Imprimir(){
         JOptionPane.showMessageDialog(null,"sus escamas son "+escamas);
         JOptionPane.showMessageDialog(null,"su pupila  es "+pupila);
     }
    
}
